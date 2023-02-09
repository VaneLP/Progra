Algoritmo ejer5
	// 1*2*3..*n-1*n
	Escribir 'introduce un numero'
	Leer n
	f <- 1
	Mientras n>0 Hacer
		f <- n*f
		n <- n-1
	FinMientras
	Escribir f
FinAlgoritmo
