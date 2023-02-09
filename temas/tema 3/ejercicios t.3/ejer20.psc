Algoritmo ejer20
	nfibo <- 0
	nant <- 1
	Leer nrep
	Para calculo<-0 Hasta nrep Hacer
		Escribir nfibo
		temp <- nfibo
		nfibo <- nfibo+nant
		nant <- temp
	FinPara
FinAlgoritmo
