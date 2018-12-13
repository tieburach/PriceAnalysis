#########################################
#                                       #
#  Zestaw funkcji do æwiczeñ z podstaw  # 
#   klasyfikacji i grupowania danych    #
#                                       #
#     (c) 2015 Marcin Iwanowski PW      #
#                                       #
#          wersja   14.12.2015          #
#                                       #
#########################################

# Funkcje pomocnicze

wczytaj_pakiety <- function()
{
  # wczytanie niezbêdnych pakietów
  print("wczytujê pakiety", quote=F)
  library(psych)
  library(stats)
  library(scatterplot3d)
  library(class)
  library(matrixStats)
  library(e1071)
  library(party)
}

testuj_opis <- function(m,opis)
{
  # testuje czy atrybuty opisuj¹ce s¹ iloœciowe
  # m - macierz danych (data frame)
  # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
  #
  wynik <- T
  for (i in 1:length(opis))
    if (opis[i]>ncol(m)) wynik <- F
  if(wynik)
  {
   for (i in 1:length(opis))
    if (!is.numeric(m[,opis[i]])) {wynik <- F}
  }
  wynik
}

testuj_dec <- function(m,dec)
{
 # testuje czy atrybut decyzyjny jest prawid³owy
 # m - macierz danych (data frame)
 # dec - pozycja na ktorej znajduje sie atrybut decyzyjny 
 #
 wynik <- T
 if ((dec < 0) | (dec>ncol(m))) wynik <- F
 else 
  if(dec>0) wynik <- is.factor(m[,dec])
 wynik
}

testuj_atryb <-function(m,opis,dec)
{ 
  # testuje czy m jest macierz¹ danych (data frame), 
  # jej kolumny o numerach w 'opis' sa numeryczna (ilosciowe)
  # a kolumna 'dec' jest kategoryczna (factor) lub == 0
  # 'dec' mo¿na pomin¹æ
  wynik <- F
  if (is.data.frame(m)) {wynik <- testuj_opis(m,opis)}
  if (wynik & (!missing(dec))) wynik <- testuj_dec(m,dec)
  wynik
}

klawisz <- function()
{
 # invisible(readline(prompt="Press [enter] to continue"))
  cat('Solution to everything? > ')
  b <- scan("stdin", character(), n=1)
}

# Analiza eksploracyjna (statystyki opisowe), wizualizacja, normalizacja i podzia³

eksploruj <- function(m,opis,dec)
{
 # Wyœwietla podstawowe statystyki opisowe ca³ego zbioru 
 #   i dla kazdej klasy z osobna
 #
 # m - macierz danych (data frame)
 # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
 # dec - pozycja na ktorej znajduje sie atrybut decyzyjny
 # jeœli decpos == 0 to brak atrybutu decyzyjnego
 #
 if (missing(opis))
  {opis = 1:(ncol(m)-1)}
 if (missing(dec))
 {dec = ncol(m)}
 if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry")  
 ileop <- length(opis)  # liczba wybranych atrybutow opisujacych
 if (ileop > 2)
  {
   if (dec == 0)
    {  pairs(m[,opis]) }
   else
    {  pairs(m[,opis],col=m[,dec]) }   
  }
 else
 {
   nazwyatr = names(m)
   if (dec == 0)
    { plot(m[,opis[1]],m[,opis[2]],pch=16,xlab=nazwyatr[opis[1]],ylab=nazwyatr[opis[2]]) }
   else
    { plot(m[,opis[1]],m[,opis[2]],pch=16,col=m[,dec],xlab=nazwyatr[opis[1]],ylab=nazwyatr[opis[2]]) }    
 }    
 print("PODSUMOWANIE DANYCH", quote=F)
 print("Podstawowe miary", quote=F)
 print(summary(m[,c(opis,dec)])) # podsumowanie ca³oœci
 #  print("Macierz kowariancji", quote=F) 
 #  print(cov(aopis))  # macierz kowariancji
 print("Macierz korelacji", quote=F)
 print(cor(m[,opis]))  # macierz korelacji
 if (dec>0)
  {   
   if (is.factor(m[,dec])) # typ wyliczeniowy (najwygodniejszy)
     {
       klasy <- levels(m[,dec])
       ileklas = length(klasy)
     }
     else
     { 
      if (is.numeric(m[,dec])) # typ numeryczny (klasa = liczba) 
        {
          klasy <- as.numeric(levels(as.factor(m[,dec])))
          ileklas = length(klasy)          
        }
       else
          {
            if (is.character(m[,dec])) # typ znakowy (klasa = identyfikator znakowy)
            {
              klasy <- levels(as.factor(m[,dec]))
              ileklas = length(klasy)       
            }  
            else {ileklas = 0}
          }
     }
   if (ileklas>0)
   {
    for (i in 1:ileklas)
    {
     print(paste("klasa ",klasy[i]," : Podstawowe miary"), quote=F)
     print(summary(m[m[,dec]==klasy[i],opis])) 
     #  print(paste("klasa ",i,": Macierz kowariancji"), quote=F) 
     #  print(cov(aopis[adec==i,]))  # macierz kowariancji
     print(paste("klasa ",klasy[i],": Macierz korelacji"), quote=F)
     print(cor(m[m[,dec]==klasy[i],opis]))  # macierz korelacji
    }
   }   
 }   
}

normatr <- function(wekt)
{
 # normalizacja wartoœci wektora wartoœci atrybutu  
 normatr <- (wekt - min(wekt))/(max(wekt) - min(wekt))
}

normalizuj <- function(m,typ,atryb)
{
  # Normalizacja lub standaryzacja wybranych lub wszystkich atrybutów 
  #  iloœciowych znajduj¹cych siê w macierzy danych
  #
  # m - macierz danych
  # typ = typ normalizacja/standaryzacja
  # atryb - pozycje na ktorych mamy atrybuty do normalizacji
  #
  if (missing(typ))
  { typ <- "norm"}
  if (missing(atryb))
  { # jesli brakuje wskazania atrybutów to bierze wszystkie iloœciowe
    pierwszy <- TRUE;
    for (i in 1:ncol(m))
     if(is.numeric(m[,i])==TRUE)
     {
       if (pierwszy == TRUE)
       {atryb <- c(i)
        pierwszy <- FALSE
       }
       else
       {atryb=c(atryb,i)
       }
     }
  }
  if (!testuj_atryb(m,atryb)) stop("B³êdne parametry") 
  m1 <- m
  if (typ == "norm")
  {for (i in 1:length(atryb))
   {
    mina = min(m1[,atryb[i]]);
    maxa = max(m1[,atryb[i]]);    
    m1[,atryb[i]]=(m1[,atryb[i]]-mina)/(maxa-mina)
  }}
  else # typ == 'std'
  {for (i in 1:length(atryb))
  {
    meana = mean(m1[,atryb[i]]);
    sda = sd(m1[,atryb[i]]);    
    m1[,atryb[i]]=(m1[,atryb[i]]-meana)/sda
  }}
  normalizuj <- m1
}

podziel = function(m, p, dec)
{
 # Wybiera losowo z macierzy danych obiekty przypisane zbiorowi ucz¹cemu
 #   i zbiorowi testowemu (podzia³ macierzy na czêœæ ucz¹c¹ i testow¹)
 #   zwraca wektor wskazañ na odpowiedni zbiór 
 #
 # m - macierz danych (data frame) 
 # p stosunek podzia³u (jaka czêœæ w zbiorze ucz¹cym, reszt w testowym)
 # dec == 0 bez uwzglêdnienia wartoœci atrybutu decyzyjnego
 # dec > 0 indeks atr. dec. taki sam stosunek podzialu w kazdej klasie  
 # zwraca wektor binarny: 1 - obiekt z zb.uczacym, 0 - w testowym
 #
 if (missing(dec))
 {dec = ncol(m)}
 if (missing(p))
 { p = 0.7 }
 if (!(is.data.frame(m) & testuj_dec(m,dec))) stop("B³êdne parametry")   
 ile <- nrow(m)
 ind <- 1:ile
 if (dec>0) # z podzialem na klasy
  {
   kl <- as.numeric(as.factor(m[,dec])) # dzieki temu zadziala dla int,char i fact
   ile_klas <- length(levels(as.factor(m[,dec]))) # liczba klas
   wklasie <- sum(kl==1)
   indeksy <- sample(ind[kl == 1],p*wklasie) 
   for (i in 2:ile_klas)
    {
      wklasie <- sum(kl==i)     
      indeksy = c(indeksy, sample(ind[kl == i],p*wklasie))
    }
  }
 else # typ == 0
  {
    indeksy <- sample(ind,p*ile) 
  }
  ind_wy <- replace(rep(0,ile),indeksy,1)
  # zwraca wektor uczace/testowe
}

srednie <- function(m,opis,dec)
{
  # wyznacza wektory œrednie atrybutów w ca³ej macierzy
  # lub w poszczególnych klasach
  #
  # m - macierz danych (data frame)
  # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
  # dec - pozycja na ktorej znajduje sie atrybut decyzyjny
  #
  if (missing(dec))
  {dec <- 0}
  if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry") 
  if(dec>0)
  {
   ile_klas <- length(levels(as.factor(m[,dec]))) # liczba klas  
   atrd <- as.numeric(as.factor(m[,dec])) # dzieki temu zadziala dla int,char i fact
   srednie = matrix(0,ile_klas,length(opis))
   srednie[1,] <- colMeans(as.matrix(m[atrd==1,opis]))
   if (ile_klas > 1)
   { 
    for (k in 2:ile_klas)
     {  
      srednie[k,] <- colMeans(as.matrix(m[atrd==k,opis]))
    }
   }
  }
  else # dec == 0
  {
    srednie <- colMeans(as.matrix(m[,opis]))
  }
  srednie
}

najmniejsze <- function(m,opis,dec)
{  
  # wyznacza wektory najmniejszych wartoœci atrybutów w ca³ej macierzy
  # lub w poszczególnych klasach
  #
  # m - macierz danych (data frame)
  # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
  # dec - pozycja na ktorej znajduje sie atrybut decyzyjny
  #
  if (missing(dec))
   {dec <- 0}
  if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry") 
  if(dec>0)
  {
   ile_klas <- length(levels(as.factor(m[,dec]))) # liczba klas  
   atrd <- as.numeric(as.factor(m[,dec])) # dzieki temu zadziala dla int,char i fact
   najmniejsze = matrix(0,ile_klas,length(opis))
   najmniejsze[1,] <- colMins(as.matrix(m[atrd==1,opis]))
   if (ile_klas > 1)
   { 
    for (k in 2:ile_klas)
    {  
      najmniejsze[k,] <- colMins(as.matrix(m[atrd==k,opis]))
    }
   }
  }
  else
  {
    najmniejsze <- colMins(as.matrix(m[,opis]))
  } 
  najmniejsze
}

najwieksze <- function(m,opis,dec)
{
  # wyznacza wektory najwiêkszych wartoœci atrybutów w ca³ej macierzy
  # lub w poszczególnych klasach
  #
  # m - macierz danych (data frame)
  # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
  # dec - pozycja na ktorej znajduje sie atrybut decyzyjny
  #
  if (missing(dec))
   {dec <- 0}
  if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry")   
  if(dec>0)
  {  
   ile_klas <- length(levels(as.factor(m[,dec]))) # liczba klas  
   atrd <- as.numeric(as.factor(m[,dec])) # dzieki temu zadziala dla int,char i fact
   najwieksze = matrix(0,ile_klas,length(opis))
   najwieksze[1,] <- colMaxs(as.matrix(m[atrd==1,opis]))
   if (ile_klas > 1)
   { 
     for (k in 2:ile_klas)
    {  
      najwieksze[k,] <- colMaxs(as.matrix(m[atrd==k,opis]))
    }
   }
  }
   else
   {
     najwieksze <- colMaxs(as.matrix(m[,opis]))     
   }
  najwieksze
}

pokaz <- function (m,ut,opis,dec)
{ 
  # Wyswietla wykresy punktowe 
  #
  # m - macierz danych (data frame) 
  # ut - wektor ucz¹ce/testowe (wynik podzia³u macierzy)
  # opis - atrybuty opisuj¹ce
  # dec - atrybut decyzyjny
  #
    
 if (missing(opis))
  {opis = 1:(ncol(m)-1)}
 if (missing(dec))
 {dec = ncol(m)}
  if (missing(ut))
  {ut=0}
 if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry") 
 # m -macierz danych
 # ut - wektor uczace/testowe (jesli skalar to caly zbior jest uczacy)
  ileop <- length(opis)  # liczba atrybutow opisujacych
  m1 <- m[,opis]
  if (length(ut) < nrow(m1))  
   { # niepoprawny albo == 0 (czyli brak) wektor ut - wszystkie sa ucz¹ce
    ut1 <- rep(1,nrow(m1))
   }
  else
   { # prawid³owy ut
    ut1 <- ut
   }
  # liczymy i dodajemy srednie
  if (dec == 0) 
   { # brak rozroznienia klas 
    m1 <- rbind(m1,colMeans(m1[ut1 == 1,])) 
    ut1 <- c(ut1,2)
   }
   else
   { # z rozroznieniem klas
     ile_klas <- length(levels(as.factor(m[,dec]))) # liczba klas  
     m1d <- as.numeric(as.factor(m[,dec])) # dzieki temu zadziala dla int,char i fact
     for (k in 1:ile_klas)
     {  
       srednie <- colMeans(m1[(ut1 == 1) & (m1d == k),])
       m1 <- rbind(m1,srednie)    
       ut1 <- c(ut1,2)
       m1d <- c(m1d,k)
     } 
   }
  pchw <- (ut1 == 1)*16 + (ut1 == 0)*1 + (ut1 == 2)*8
  if (ileop > 2)
  {
    if (dec == 0)
    {  pairs(m1,pch=pchw) }
    else
    {  pairs(m1,col=m1d,pch=pchw)}   
  }
  else
  {
    nazwyatr = names(m1)
    if (dec == 0)
    { plot(m1[,1],m1[,2],pch=pchw,xlab=nazwyatr[1],ylab=nazwyatr[2]) }
    else
    { plot(m1[,1],m1[,2],pch=pchw,col=m1d,xlab=nazwyatr[1],ylab=nazwyatr[2]) }    
  }   
}

histklas <- function(m,atr,dec,gl)
{
  # histogram z podzia³em na klasy
  # m - macierz danych
  # atr - numer (pozycja) atrybutu dla którego wyœwietlamy histogramy
  # dec - pozycja atrybutu decyzyjnego
  # gl - stopieñ wyg³adzania (gl=0.95 silne, gl= 0.01 s³abe)
  ile_klas <- length(levels(as.factor(m[,dec]))) # liczba klas  
  klasy <- levels(m[,dec])
  if (missing(gl))
  {gl=0.01}
  d = density(m[m[,dec]==klasy[1],atr],bw=gl)
  xmaxd = max(d$x)
  xmind = min(d$x)    
  ymaxd = max(d$y)
  ymind = min(d$y)    
  for (i in 2:ile_klas)
  {
    d = density(m[m[,dec]==klasy[i],atr],bw=gl)
    xmaxd = c(xmaxd, max(d$x))
    xmind = c(xmind, min(d$x))   
    ymaxd = c(ymaxd, max(d$y))
    ymind = c(ymind, min(d$y))     
  }
  xmin = min(xmind)
  ymin = min(ymind)
  xmax = max(xmaxd)
  ymax = max(ymaxd)
  d = density(m[m[,dec]==klasy[1],atr],bw=gl)  
  plot(d$x,d$y,type="l",col=1,xlim=c(xmin,xmax),ylim=c(ymin,ymax),ylab="",xlab="",main="")
  for (i in 2:ile_klas)
  {
    d = density(m[m[,dec]==klasy[i],atr],bw=gl)
    lines(d$x,d$y,type="l",col=i,xlim=c(xmin,xmax),ylim=c(ymin,ymax),ylab="",xlab="",main="")    
  }
}

histbox <- function(m,opis,dec,gl)
{
  # funkcja wyœwietla histogramy i wykresy pude³kowe poszczególnych atrybutów 
  # m - macierz danych (data frame) 
  # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
  #
  if (missing(opis))
  {opis <- 1:(ncol(m)-1)}
  if(missing(dec))
  {dec<-ncol(m)}
  if (missing(gl))
  {gl <- 0.05}  
  if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry") 
  ile <- length(opis)
  plot.new()
  close.screen(all = TRUE)  
  split.screen(fig=c(2,ile))
  cn <- colnames(m)
  for (k in 1:ile)
  {
    screen(k)
   # hist(m[,opis[k]],40,col=3,main=" ",xlab=" ")
    histklas(m,opis[k],dec,gl)
  }
  for (k in 1:ile)
  {
    screen(k+ile)
    boxplot(m[,opis[k]] ~ m[,dec],main=cn[k],horizontal = T)
  }
  close.screen(all = TRUE)
}

# Klasyfikacja

klasyfikuj <- function (typ, m_ucz, w_test, k, opis, dec)  
{
 # Klasyfikacja
 #
 # typ - rodzaj klasyfikatora ("knn","np","bayes","drzewo")
 # m_ucz - macierz danych (data frame) zbioru ucz¹cego
 # w_test - macierz danych (data frame) zbioru testowego 
 # k - parameter klasyfikatora
 # opis - wektor pozycji na ktorych znajduja sie atrybuty opisujace
 # dec - pozycja na ktorej znajduje sie atrybut decyzyjny
 # 
 # na wyjœciu lista:
 #           klasyfikuj$wynik - wynik klasyfikacji zbioru testowego
 #    klasyfikuj$klasyfikator - dodatkowe dane zwracane przez klasyfikator 
 #          klasyfikuj$metoda - nazwa metody klasyfikacji
 #
 if (missing(opis)) 
  {opis <- 1:(ncol(m_ucz)-1)}
 if (missing(dec))
  {dec <- ncol(m_ucz)}
 if (missing(k))
  {if (typ=="drzewo") {k <- 95} else {k <- 1}}
 if (!testuj_atryb(m_ucz,opis,dec)) stop("B³êdne parametry") 
 ok <- F
 if (typ == "knn")
 {
  wyj = knn(m_ucz[,opis], w_test, m_ucz[,dec],k)
  daneklas <- NULL
  ok <- T
 }
 if (typ == "np")
 {
  s = srednie(m_ucz,opis,dec)
  wyj = knn(s, w_test,1:nrow(s), 1) 
  daneklas <- s
  ok <- T  
 }
 if (typ == "bayes")
 {
	  b <- naiveBayes(m_ucz[,opis],m_ucz[,dec])
	  wyj <- predict(b,w_test)
	  daneklas <-b
	  ok <- T	  
 }
 if (typ == "drzewo")
 {
   cn <- colnames(m_ucz)
	# tc <- ctree_control(minsplit = 1, minbucket = 1, mincriterion = k) #, teststat = "max", testtype = "Teststatistic")
   tc <- ctree_control(minbucket = 1, minsplit = 2, mincriterion = k/100) 
	 dt <- ctree( as.formula(paste(cn[dec],"~ .")), data = m_ucz[,c(opis, dec)], controls = tc)
   wyj <- predict(dt,w_test)
   daneklas <- dt
   ok <- T
 }
 if (ok == T) wyjscie <- list(wynik=wyj,klasyfikator=daneklas,metoda=typ)  

}

weryfikuj <- function (typ, m, ut, opis, dec, k, pokazuj)
{
  # Klasyfikacja, sprawdzenie wyników na zbiorze ucz¹cym i testowym
  #  wyniki w postaci macierzy kontyngencji (konfuzji)
  #
  # m - macierz danych (data frame) 
  # ut - wektor ucz¹ce/testowe (wynik podzia³u macierzy)
  # opis - atrybuty opisuj¹ce
  # dec - atrybut decyzyjny
  # k - parametr klasyfikatora
  # pokazuj - czy pokazywaæ drzewo dec.  
  #
  # na wyjœciu lista:
  #           weryfikuj$wynik - wynik klasyfikacji zbioru testowego
  #    weryfikuj$klasyfikator - dodatkowe dane zwracane przez klasyfikator 
  #          weryfikuj$metoda - nazwa metody klasyfikacji
  #
  if (missing(opis))
   {opis <- 1:(ncol(m)-1)}
  if (missing(dec))
   {dec <- ncol(m)}
  if (missing(k))
  {if (typ=="drzewo") {k <- 95} else {k <- 1}}
  if (missing(pokazuj))
  {pokazuj <- T}
  braktest = F
  if (missing(ut))
  {ut <- rep(1,nrow(m))
   print("Brak zbioru testowego")
   braktest = T}
  if (!testuj_atryb(m,opis,dec)) stop("B³êdne parametry") 
  print("Weryfikacja klasfikatora", quote=F)
  print("  zbiór ucz¹cy", quote = F)
  wyn <- klasyfikuj(typ, m[ut == 1,], m[ut == 1,opis], k, opis, dec)
  print(table(m[ut == 1,dec],wyn$wynik))
  if (!braktest)
  {
   print("  zbiór testowy", quote = F)
   wyn = klasyfikuj(typ, m[ut == 1,], m[ut == 0,opis], k, opis, dec)
   print(table(m[ut == 0,dec],wyn$wynik))
  }
  if ((pokazuj == T) & (typ == "drzewo")) {plot(wyn$klasyfikator)}
  #wyn
}

granice <- function (typ, m, ut, atrx, atry, dec, k)
{
  # Rysuje granice decyzyjne
  #
  # m - macierz danych (data frame) 
  # ut - wektor ucz¹ce/testowe (wynik podzia³u macierzy)
  # atrx, atry - atrybuty opisuj¹ce
  # dec - atrybut decyzyjny
  # k - parametr klasyfikatora
  #
  # na wyjœciu lista:
  #           granice$wynik - wynik klasyfikacji zbioru testowego
  #    granice$klasyfikator - dodatkowe dane zwracane przez klasyfikator 
  #          granice$metoda - nazwa metody klasyfikacji
  #
  if (missing(atrx))
   {atrx <- 1}
  if (missing(atry))
   {atry <- 2}
  if (missing(dec))
   {dec <- ncol(m)}
  if (missing(k))
  {if (typ=="drzewo") {k <- 95} else {k <- 1}}
  if (missing(ut))
  {ut <- rep(1,nrow(m))}
  if (!testuj_dec(m,dec)) stop("B³êdne parametry")  
  s = srednie(m,c(atrx,atry))
  mi = najmniejsze(m,c(atrx,atry))
  ma = najwieksze(m,c(atrx,atry))
  krok = abs(ma - mi)/100
  margines = abs(ma - mi)/15
  s1 = seq(mi[1]-margines[1],ma[1]+margines[1],krok[1])
  s2 = seq(mi[2]-margines[2],ma[2]+margines[2],krok[2])
  g <- as.matrix(expand.grid(s1,s2))
  cn <- colnames(m)
  colnames(g) <- cn[c(atrx,atry)]
  klas = klasyfikuj(typ, m[ut == 1,], as.data.frame(g), k, c(atrx,atry), dec)
  plot(g[,1],g[,2],col=klas$wynik,pch='+',xlab=cn[atrx],ylab=cn[atry])
  points(m[ut==1,atrx],m[ut==1,atry],col=m[ut==1,dec],pch=16) 
  points(m[ut==0,atrx],m[ut==0,atry],col=m[ut==0,dec],pch=1) 
  print(klas$klasyfikator)
 # klas
}

# Grupowanie

grupowanie = function(typ, m, k, opis)
{
  # Grupowanie 
  #
  # typ - metoda grupowania ("ksrednich","hie_pp","hie_cp","hie_sp")
  # m - macierz danych (data frame) 
  # k - liczba klas
  # opis - atrybuty opisuj¹ce
  #
  # 
  # na wyjœciu: lista -
  #         grupowanie$grupy - grupy wynikowe, 
  #          grupowanie$dane - ró¿ne informacje dot. metody
  #        grupowanie$metoda - nazwa metody grupowania
  #             grupowanie$k - liczba grup
  #
 if (!testuj_opis(m,opis)) stop("B³êdne parametry") 
 ok <- F 
 if (typ == 'ksrednich')
 {
  g <- kmeans(m[,opis],k) # grupowanie
  dane <- g$centers
  gr <- g$cluster
  ok <- T
 }
 if (typ == 'hie_pp')
 {
  d = dist(mhead(i[,opis], method = "euclidean")) # wektor odleg³osci
  dend <- hclust(d,method = "single") # grupowanie hierarchiczne
  gr <- cutree(dend,k) # przycinamy aby otrzymac k grup
  dane <- dend
  ok <- T
 }
  if (typ == 'hie_cp')
 {
  d = dist(m[,opis], method = "euclidean") # wektor odleg³osci
  dend <- hclust(d,method = "complete") # grupowanie hierarchiczne
  gr <- cutree(dend,k) # przycinamy aby otrzymac k grup
  dane <- dend
  ok <- T
 }
 if ((typ == 'hie_sp')||(typ == 'hie'))
 {
  d = dist(m[,opis], method = "euclidean") # wektor odleg³osci
  dend <- hclust(d,method = "average") # grupowanie hierarchiczne
  gr <- cutree(dend,k) # przycinamy aby otrzymac k grup
  dane <- dend
  ok <- T
 }
 if (ok == T) wynik = list(grupy=as.factor(as.character(gr)),info=dane, metoda=typ, ile=k)

}

# czarny, czerwony, zielony, granatowy, niebieski, ró¿owy, ¿ó³ty

grupuj <- function(typ, m, k, opis, dec, opisp, pokazuj)
{
  # Grupowanie z prezentacj¹ wyników na wykresie punktowym
  #  jeœli dec>0 drukuje tak¿e macierz kontyngencji z artybutmem dec.
  #
  # typ - metoda grupowania ("ksrednich","hie_pp","hie_cp","hie_sp")
  # m - macierz danych (data frame) 
  # k - liczba klas
  # opis - atrybuty opisuj¹ce do grupowania
  # dec - atrybut decyzyjny
  # opisp - atrybuty opisuj¹ce wyœwietlane na wykresie
  # pokazuj - czy pokazywaæ dendrogram
  # 
  # na wyjœciu: grupy wynikowe,
  #
  if (missing(opis))
   {opis <- 1:(ncol(m)-1)}
  if (missing(dec))
   {dec <- ncol(m)}
  if(missing(opisp))
   { opisp <- opis }
  if (missing(k))
   {k <- length(levels(m[,dec]))}
  if (missing(pokazuj))
   {pokazuj <- T}
  if (!(is.data.frame(m) & testuj_opis(m,opis) & testuj_opis(m,opisp))) stop("B³êdne parametry") 
  g <- grupowanie(typ,m,k,opis)
  m1 <- m
  m1$gr <- g$grupy
  pokaz(m1, 0, opisp, ncol(m1)) 
  if (dec != 0)
  {
   table(m1[,dec],m1[,ncol(m1)])
  }
  if ((pokazuj == T) & (typ != "ksrednich"))
    {
     dev.new()
     plot(g$info)
    }
  grupuj <- g$grupy
}

doklej <- function(m,nowyatrybut)
{
 # dokleja nowy atrybut do macierzy (ramki) danych m
  m1 <- m
  m1$nowy <- nowyatrybut
  m1
}

wczytaj_pakiety()