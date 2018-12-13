args<-commandArgs(TRUE)

source("eksplo.R")
library(RODBC)
library(rmarkdown)



require("RPostgreSQL")

pw <- getPass::getPass("Enter the password: ")
drv <- dbDriver("PostgreSQL")
con <- dbConnect(drv, dbname = "postgres",
                 host = "localhost", port = 5432,
                 user = "postgres", password = pw)
rm(pw)

# check for the cartable
dbExistsTable(con, "cartable")
# TRUE

# query the data from postgreSQL 
df_postgres <- dbGetQuery(con, "SELECT * from category")



Sys.setenv(RSTUDIO_PANDOC="C:/Program Files/RStudio/bin/pandoc")
  myconn <- odbcConnect("allegro", uid = "Tieburach", pwd = "")

  pundat <- sqlQuery(myconn, "select price, parametervalues from AllegroDatabase.dbo.ProductsPrices")
  
  prices <- pundat[,c("price")]
  parameters <- pundat[,c("parametervalues")]
  prices <- sort (prices)
  y <- dnorm(prices, mean=mean(prices), sd = sd(prices))
  cenamin <- mean(prices) - sd(prices)
  cenaavg <- mean(prices)
  cenamax <- mean(prices) + sd(prices)

  sqlQuery(myconn, "DELETE FROM AllegroDatabase.dbo.Results")

  query <- paste("INSERT INTO AllegroDatabase.dbo.Results (price) VALUES ( ", cenamin, ")")
  sqlQuery(myconn, query)  
  
  query <- paste("INSERT INTO AllegroDatabase.dbo.Results (price) VALUES ( ", cenaavg, ")")
  sqlQuery(myconn, query)  
  
  query <- paste("INSERT INTO AllegroDatabase.dbo.Results (price) VALUES ( ", cenamax, ")")
  sqlQuery(myconn, query)  
  
  #outputfolder <- "TESTY"
  #categorytree <- "jakiesdrzewko<-zwywolaniami<-itd<-"
  outputfolder <- args[1]
  categorytree <- args[2]
  maindir <- "C:/Users/Tieburach/Desktop/"
  togetherdir <- paste(maindir, outputfolder, sep="")
  dir.create(file.path(maindir, outputfolder), showWarnings = FALSE)
  setwd(file.path(maindir, outputfolder))
  
  cenaminwykres <- prices[which(abs(prices-cenamin)==min(abs(prices-cenamin)))]
  cenaavgwykres <- prices[which(abs(prices-cenaavg)==min(abs(prices-cenaavg)))]
  cenamaxwykres <- prices[which(abs(prices-cenamax)==min(abs(prices-cenamax)))]
 

  
  #rysowanie rozkladu normalnego z zaznaczonymi programi
  png("rozkladnormalny.png")
  plot(prices, y, col=ifelse(prices==cenaminwykres | prices==cenaavgwykres | prices==cenamaxwykres, "red", "white"))
  lines(prices, y)
  title(main="Rozklad normalny z zaznaczonymi programi")
  dev.off()
  
  
  
  
  prices <- pundat[,c("price")]
  
  z <- length(prices)
  z1 <- 1:z  
  
  #punkty oddalone dla parametru
  png("oddaloneparametr.png")
  md1oind = abs(parameters - mean(parameters)) < 3*sd(parameters)
  plot(parameters,z1,pch=16,col=md1oind+1)
  title("Punkty oddalone dla parametru")
  dev.off()
  
  #punkty oddalone dla ceny
  png("oddalonecena.png")
  md2oind = abs(prices - mean(prices)) < 3*sd(prices)
  plot(prices,z1,pch=16,col=md2oind+1)
  title("Punkty oddalone dla ceny")
  dev.off()
  
  
  #usuwanie punktow oddalonych
  parametersboolean = abs(parameters - mean(parameters)) < 3*sd(parameters)
  parametersreduced <- parameters[parametersboolean]
  price2 <- prices[parametersboolean]
  pricesboolean = abs(price2 - mean(price2)) < 3*sd(price2)
  pricereduced <- price2[pricesboolean]
  parametersreduced <- parametersreduced[pricesboolean]
  
  
  #rysowanie histogramu dla ceny
  png("histogramceny.png")
  par(mfcol=c(1,2))
  hist(prices)
  hist(pricereduced)
  dev.off()
  
  
  #rysowanie histogramu dla parametru
  png("histogramparametru.png")
  par(mfcol=c(1,2))
  hist(parameters, breaks = 10)
  hist(parametersreduced,breaks=10)
  dev.off()
  
  
  #grupowanie poszczegolnych elementow
  png("grupowanie.png")
  par(mfcol=c(1,1))
  pundatreduced<- data.frame(pricereduced, parametersreduced)
  g <-grupuj("ksrednich",pundatreduced,4,c(2,1),1)
  title("Grupowanie wyst�pie�")
  dev.off()
  
  for (i in 1:nrow(pundatreduced)) {
      query <- paste("INSERT INTO AllegroDatabase.dbo.Analysis (pricereduced, parametersreduced) VALUES ( " , pundatreduced$pricereduced[i], ",", pundatreduced$parametersreduced[i], ")")
      sqlQuery(myconn, query)  
      }
  close(myconn)
  
  rscriptpath <- "C:/Users/Tieburach/source/repos/AllegroWEBAPI/AllegroWEBAPI/bin/Debug/raport.Rmd"
  
  rmarkdown::render(
    rscriptpath,
    output_format = "html_document",
    output_file = "raport.html",
    output_dir = togetherdir,
    params = list(directory=togetherdir, categorytree = categorytree)
  )
  
  rmarkdown::render(
    rscriptpath,
    output_format = "word_document",
    output_file = "raport.docx",
    output_dir = togetherdir,
    params = list(directory=togetherdir, categorytree = categorytree)
  )
  
  sqlQuery(myconn, "DELETE FROM AllegroDatabase.dbo.ProductsPrices")
  sqlQuery(myconn, "DELETE FROM AllegroDatabase.dbo.Results")
  