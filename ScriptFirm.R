  args <- commandArgs(TRUE)
  setwd("C:/Users/Tieburach/PriceAnalysis")
  source("eksplo.R")
  library(RODBC)
  library(plotrix)
  library(rmarkdown)
  library(getPass)
  library(ggplot2)
  require("RPostgreSQL")
  require(knitr) # required for knitting from rmd to md
  require(markdown) # required for md to html
  Sys.setenv(RSTUDIO_PANDOC = "C:/Program Files/RStudio/bin/pandoc")
  
  pw <- getPass::getPass("Enter the password: ")
  drv <- dbDriver("PostgreSQL")
  con <- dbConnect(
    drv,
    dbname = "postgres",
    host = "localhost",
    port = 5432,
    user = "postgres",
    password = pw
  )
  rm(pw)
  
  odchstandard = 3
  
  
  # query the data from postgreSQL
  auctions <- dbGetQuery(con, "SELECT * from detailedauction")
  avaiablecategories <-
    dbGetQuery(con, "SELECT distinct categoryname FROM detailedauction ORDER BY categoryname")
  
  
  categorytree <- "Tutaj bedzie drzewko wywolan kategorii"
  outputfolder <- "testfirmowy"
  #outputfolder <- args[1]
  #categorytree <- args[2]
  maindir <- "C:/Users/Tieburach/Desktop/"
  togetherdir <- paste(maindir, outputfolder, sep = "")
  dir.create(file.path(maindir, outputfolder), showWarnings = FALSE)
  setwd(file.path(maindir, outputfolder))
  
  
  
  
  
  
  #tworzenie i zapisanie wykesu na analize ilosciowa
  howmanyoftype <-
    dbGetQuery(
      con,
      "SELECT categoryname, COUNT (categoryname) FROM detailedauction GROUP BY categoryname ORDER BY categoryname "
    )
  slices <- howmanyoftype[, c("count")]
  lbls <- howmanyoftype[, c("categoryname")]
  pct <- round(slices / sum(slices) * 100)
  lbls <- paste(lbls, pct) # add percents to labels
  lbls <- paste(lbls, "%", sep = "") # ad % to labels
  png("Wykres Kolowy Udzialow.png")
  pie(
    slices,
    label = lbls,
    col = terrain.colors(length(lbls)),
    cex = 0.8,
    main = "Wykres iloœciowy udzia³ów modeli w rynku"
  )
  dev.off()
  
  
  
  
  
  #tworzenie i zapisanie wykesu na analize kwotowa
  allprice <-
    dbGetQuery(con, "SELECT SUM(price) from detailedauction")
  allprice <- allprice [, c("sum")]
  pricefortype <-
    dbGetQuery(
      con,
      "SELECT categoryname, SUM (price) FROM detailedauction GROUP BY categoryname ORDER BY categoryname"
    )
  slicesprice <- pricefortype[, c("sum")]
  lblsprice <- pricefortype[, c("categoryname")]
  pctprice <- round(slicesprice / sum(slicesprice) * 100)
  lblsprice <- paste(lblsprice, pctprice) # add percents to labels
  lblsprice <- paste(lblsprice, "%", sep = "") # ad % to labels
  png("Wykres kolowy udzialow kwotowy.png")
  pie(
    slicesprice,
    labels = lblsprice,
    col = topo.colors(length(lbls)),
    cex = 0.8,
    main = "Wykres kwotowy udzia³ów modeli w rynku"
  )
  dev.off()
  
  
  
  
  #tworzenie i zapisanie wykesu na stan urzadzen
  conditiongraph <-
    dbGetQuery(
      con,
      "SELECT condition, COUNT (condition) FROM detailedauction WHERE NOT condition='undefined' GROUP BY condition "
    )
  slicesused <- conditiongraph[, c("count")]
  lblsused <- conditiongraph[, c("condition")]
  pctused <- round(slicesused / sum(slicesused) * 100)
  lblsused <- paste(lblsused, pctused) # add percents to labels
  lblsused <- paste(lblsused, "%", sep = "") # ad % to labels
  png("Wykres kolowy stanu aukcji.png")
  pie3D(
    slicesused,
    labels = lblsused,
    explode = 0,
    col = terrain.colors(length(lblsused)),
    theta = pi / 4,
    start = pi / 2,
    main = "Wykres popularnoœci nowych i u¿ywanych urz¹dzeñ"
  )
  dev.off()
  
  
  
  
  
  #wyliczenie ilu jest uzytkownikow prywatnych a ilu firmowych
  # firmowych (wiecej niz 1)
  howManyFirmSellers <-
    dbGetQuery(
      con,
      "SELECT COUNT (t.counted) FROM (SELECT username AS username, count(id) AS counted FROM detailedauction GROUP BY username ORDER BY counted DESC ) t WHERE counted >1"
    )
  howManyFirmSellers <- howManyFirmSellers[, c("count")]
  # prywatnych (rowno 1)
  howManyPrivateSellers <-
    dbGetQuery(
      con,
      "SELECT COUNT (t.counted) FROM (SELECT username AS username, count(id) AS counted FROM detailedauction GROUP BY username ORDER BY counted DESC ) t WHERE counted=1"
    )
  howManyPrivateSellers <- howManyPrivateSellers[, c("count")]
  slicesSellers <- c(howManyFirmSellers, howManyPrivateSellers)
  lblsSellers <- c("Sprzedawcy", "Osoby prywatne")
  pctSellers <- round(slicesSellers / sum(slicesSellers) * 100)
  lblsSellers <-
    paste(lblsSellers, pctSellers) # add percents to labels
  lblsSellers <- paste(lblsSellers, "%", sep = "") # ad % to labels
  png("Wykres konkurencji.png")
  pie3D(
    slicesSellers,
    labels = lblsSellers,
    explode = 0,
    col = terrain.colors(length(lblsSellers)),
    theta = pi / 4,
    start = pi,
    main = "Wykres stosunku sprzedawców do osób prywatnych"
  )
  dev.off()
  
  
  
  
  
  #wyliczenie ile jest aukcji uzytkownikow prywatnych a ilu firmowych
  # firmowych (wiecej niz 1)
  howManyFirmSellersAuctions <-
    dbGetQuery(
      con,
      "SELECT SUM (t.counted) FROM (SELECT username AS username, count(id) AS counted FROM detailedauction GROUP BY username ORDER BY counted DESC ) t WHERE counted >1"
    )
  howManyFirmSellersAuctions <- howManyFirmSellersAuctions[, c("sum")]
  # prywatnych (rowno 1)
  howManyPrivateSellersAuctions <-
    dbGetQuery(
      con,
      "SELECT SUM (t.counted) FROM (SELECT username AS username, count(id) AS counted FROM detailedauction GROUP BY username ORDER BY counted DESC ) t WHERE counted=1"
    )
  howManyPrivateSellersAuctions <-
    howManyPrivateSellersAuctions[, c("sum")]
  slicesSellersAuctions <-
    c(howManyFirmSellersAuctions, howManyPrivateSellersAuctions)
  lblsSellersAuctions <- c("Sprzedawcy", "Osoby prywatne")
  pctSellersAuctions <-
    round(slicesSellersAuctions / sum(slicesSellersAuctions) * 100)
  lblsSellersAuctions <-
    paste(lblsSellersAuctions, pctSellersAuctions) # add percents to labels
  lblsSellersAuctions <-
    paste(lblsSellersAuctions, "%", sep = "") # ad % to labels
  png("Wykres konkurencji ilosciowy.png")
  pie3D(
    slicesSellersAuctions,
    labels = lblsSellersAuctions,
    explode = 0,
    col = terrain.colors(length(lblsSellersAuctions)),
    theta = pi / 4,
    start = pi,
    main = "Wykres stosunku iloœci przedmiotów sprzedawców do osób prywatnych"
  )
  dev.off()
  
  
  
  
  #najwieksi sprzedawcy
  biggestSellers <-
    dbGetQuery(
      con,
      "SELECT username, count(id) AS counted FROM detailedauction GROUP BY username ORDER BY counted DESC LIMIT 10"
    )
  png("Najwieksi sprzedawcy i ilosci aukcji.png")
  barplot(
    biggestSellers[, c("counted")],
    main = "Najwieksi sprzedawcy",
    xlab = "Nazwy u¿ytkowników",
    ylab = "Ilosc ofert",
    names.arg = biggestSellers[, c("username")],
    col = terrain.colors(length(biggestSellers[, c("username")])),
    cex.names = 0.5
  )
  dev.off()
  
  #proba duzej petli
  for (object in avaiablecategories$categoryname) {
  
    
    
    #piechart ile jest wersji 16 a ile 32 gb
    query <- paste("SELECT * FROM detailedauction WHERE categoryname ='",object,"' AND condition='new'", sep="")
    singlecategory <- dbGetQuery(con, query)
    query <- paste(" SELECT COUNT(id), t.parametervalue FROM (SELECT * FROM detailedauction WHERE categoryname ='", 
                   object,"' AND condition='new')as t GROUP BY t.parametervalue",sep="")
    differentVersion <- dbGetQuery(con, query)
    parameterUnit <- dbGetQuery(con, "SELECT parameterunit FROM detailedauction LIMIT 1")
    parameterUnit <- parameterUnit[,c("parameterunit")]
    slicesVersion <- differentVersion[,c("count")]
    lblsVersion <- differentVersion[,c("parametervalue")]
    pctVersion <- round(slicesVersion / sum(slicesVersion) * 100)
    lblsVersion <-
      paste(lblsVersion, "GB - ", pctVersion) # add percents to labels
    lblsVersion <- paste(lblsVersion, " %", sep = "") # ad % to labels
    titleGraph <- paste("Procentowy udzia³ ró¿nych wersji parametrów dla ", object, sep = "")
    png(paste(titleGraph, ".png", sep=""))
    pie3D(
      slicesVersion,
      labels = lblsVersion,
      explode = 0,
      col = terrain.colors(length(lblsVersion)),
      theta = pi / 4,
      start = pi,
      main = titleGraph
    )
    dev.off()
    

    
    
    
    #barchart dla roznych wersji gb ile kwota srednia
    query <- paste(" SELECT AVG(price), t.parametervalue FROM (SELECT * FROM detailedauction WHERE categoryname ='", 
                   object,"' AND condition='new')as t GROUP BY t.parametervalue ORDER BY t.parametervalue",sep="")
    differentPrices <- dbGetQuery(con, query)
    query <- paste(" SELECT stddev(price), t.parametervalue FROM (SELECT * FROM detailedauction WHERE categoryname ='", 
                   object,"' AND condition='new')as t GROUP BY t.parametervalue ORDER BY t.parametervalue",sep="")
    differentPricesOdchylenie <- dbGetQuery(con, query)
    differentPricesOdchylenie <- differentPricesOdchylenie[,c("stddev")]
    lblsPrices <- differentPrices[,c("parametervalue")]
    differentPrices <- differentPrices[,c("avg")]
    lblsPrices <- paste(lblsPrices, " GB")
    titlePrices <- paste("Œrednie ceny wersji z parametrami dla ", object, sep = "")
    png(paste(titlePrices, ".png", sep=""))
    my_bar = barplot(
      differentPrices,
      main = titlePrices,
      xlab = "Rodzaje",
      ylab = "Cena",
      names.arg = lblsPrices,
      col = terrain.colors(length(differentPrices)),
      cex.names = 1
    )
    text(my_bar, differentPrices * 0.9, "Cena œrednia:", cex=0.8)
    text(my_bar, differentPrices * 0.7 , paste(formatC(as.numeric(differentPrices), format="f", digits=2, big.mark=","), " z³", sep="") ,cex=0.8)
    text(my_bar, differentPrices * 0.5, "Zakres:", cex = 0.8)
    text(my_bar, differentPrices * 0.3 , paste("< " , formatC(as.numeric(differentPrices-differentPricesOdchylenie), format="f", digits=2, big.mark=","), " z³ , ", sep="") ,cex=0.8)
    text(my_bar, differentPrices * 0.1, paste(formatC(as.numeric(differentPrices+differentPricesOdchylenie), format="f", digits=2, big.mark=","), " z³ >", sep="") ,cex=0.8)
    dev.off()
    
    
    #histogram dla zakresow cenowych
    query <- paste("SELECT price FROM detailedauction WHERE categoryname ='",object,"' AND condition='new'", sep="")
    pricesForSingle <- dbGetQuery(con, query)
    pricesboolean = abs(pricesForSingle$price - mean(pricesForSingle$price)) < 2 * sd(pricesForSingle$price)
    pricereduced <- pricesForSingle$price[pricesboolean]
    pricereduced <- data.frame(pricereduced)
    titlePricesHist <- paste("Histogram ceny dla ", object, sep = "")
    ggplot(pricereduced, aes(x=pricereduced)) + geom_histogram(bins = 20, colour="white", fill=topo.colors(20)) + ggtitle(titlePricesHist) + xlab("Cena (z³)") + ylab("Iloœæ")
    ggsave(paste(titlePricesHist, ".png", sep = ""))
    }
  
  
  
  
  #renderowanie i otwieranie strony
  rscriptpath <- "C:/Users/Tieburach/PriceAnalysis/raportFirm.Rmd"
  rmarkdown::render(
    rscriptpath,
    output_format = "html_document",
    output_file = "raportfirm.html",
    output_dir = togetherdir,
    params = list(directory = togetherdir, categorytree = categorytree)
  )
  rmarkdown::render(
    rscriptpath,
    output_format = "word_document",
    output_file = "raportfirm.docx",
    output_dir = togetherdir,
    params = list(directory = togetherdir, categorytree = categorytree)
  )
  
  
  
  browseURL(paste('file://', file.path(getwd(), 'raportfirm.html'), sep =
                    ''))
  
  