args <- commandArgs(TRUE)
setwd("C:/Users/Tieburach/PriceAnalysis")
source("eksplo.R")
library(RODBC)
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
auctions <- dbGetQuery(con, "SELECT * from auction")
prices <- auctions[, c("price")]
parameters <- auctions[, c("firstparametervalue")]
dbSendQuery(con, "DELETE FROM results")
prices <- sort (prices)
y <- dnorm(prices, mean = mean(prices), sd = sd(prices))
cenamin <- mean(prices) - sd(prices)/2
cenaavg <- mean(prices)
cenamax <- mean(prices) + sd(prices)/2



categorytree <- "Tutaj bedzie drzewko wywolan kategorii"
#outputfolder <- "testpierwszego"
outputfolder <- args[1]
#categorytree <- args[2]
maindir <- "C:/Users/Tieburach/Desktop/"
togetherdir <- paste(maindir, outputfolder, sep = "")
dir.create(file.path(maindir, outputfolder), showWarnings = FALSE)
setwd(file.path(maindir, outputfolder))




#wyliczenie cen istniejacych aukcji
cenaminwykres <-
  prices[which(abs(prices - cenamin) == min(abs(prices - cenamin)))]
cenaavgwykres <-
  prices[which(abs(prices - cenaavg) == min(abs(prices - cenaavg)))]
cenamaxwykres <-
  prices[which(abs(prices - cenamax) == min(abs(prices - cenamax)))]




#wrzucenie do tabeli z rezultatami
query <-
  paste("INSERT INTO results (price, id) VALUES ( ", cenaminwykres, ", 1)")
dbSendQuery(con, query)
query <-
  paste("INSERT INTO results (price, id) VALUES ( ", cenaavgwykres, ", 2)")
dbSendQuery(con, query)
query <-
  paste("INSERT INTO results (price, id) VALUES ( ", cenamaxwykres, ", 3)")
dbSendQuery(con, query)




#rysowanie rozkladu normalnego z zaznaczonymi programi
png("rozkladnormalny.png")
plot(
  prices,
  y,
  col = ifelse(
    prices == cenaminwykres |
      prices == cenaavgwykres | prices == cenamaxwykres,
    "red",
    "white"
  )
)
lines(prices, y)
title(main = "Rozklad normalny z zaznaczonymi programi")
dev.off()
prices <- auctions[, c("price")]
z <- length(prices)
z1 <- 1:z




#punkty oddalone dla parametru
png("oddaloneparametr.png")
md1oind = abs(parameters - mean(parameters)) < odchstandard * sd(parameters)
plot(parameters, z1, pch = 16, col = md1oind + 1)
title("Punkty oddalone dla parametru")
dev.off()







#punkty oddalone dla ceny
png("oddalonecena.png")
md2oind = abs(prices - mean(prices)) < odchstandard * sd(prices)
plot(prices, z1, pch = 16, col = md2oind + 1)
title("Punkty oddalone dla ceny")
dev.off()





#usuwanie punktow oddalonych
parametersboolean = abs(parameters - mean(parameters)) < odchstandard *
  sd(parameters)
parametersreduced <- parameters[parametersboolean]
price2 <- prices[parametersboolean]
pricesboolean = abs(price2 - mean(price2)) < odchstandard * sd(price2)
pricereduced <- price2[pricesboolean]
parametersreduced <- parametersreduced[pricesboolean]



pricesdataframe <- data.frame(prices)
pricesreduceddataframe <- data.frame(pricereduced)
#rysowanie histogramu dla ceny
png("histogramceny.png")
par(mfcol = c(1, 2))
ggplot(pricesdataframe, aes(x=prices)) + geom_histogram(bins = 20, colour="white", fill=rainbow(20, start=.8, end=.2))
ggplot(pricesreduceddataframe, aes(x=pricereduced)) + geom_histogram(bins = 20, colour="white", fill=rainbow(20, start=.8, end=.2))
dev.off()




parametersdataframe <- data.frame(parameters)
parametersreduceddataframe <- data.frame(parametersreduced)
#rysowanie histogramu dla parametru
png("histogramparametru.png")
par(mfcol = c(1, 2))
ggplot(parametersdataframe, aes(x=parameters)) + geom_histogram(bins = 5, colour="white", fill=rainbow(5, start=.8, end=.2))
ggplot(parametersreduceddataframe, aes(x=parametersreduced)) + geom_histogram(bins = 5, colour="white", fill=rainbow(5, start=.8, end=.2))
dev.off()



#renderowanie i otwieranie okna
rscriptpath <- "C:/Users/Tieburach/PriceAnalysis/raport.Rmd"
rmarkdown::render(
  rscriptpath,
  output_format = "html_document",
  output_file = "raport.html",
  output_dir = togetherdir,
  params = list(directory = togetherdir, categorytree = categorytree)
)

rmarkdown::render(
  rscriptpath,
  output_format = "word_document",
  output_file = "raport.docx",
  output_dir = togetherdir,
  params = list(directory = togetherdir, categorytree = categorytree)
)

browseURL(paste('file://', file.path(getwd(), 'raport.html'), sep = ''))