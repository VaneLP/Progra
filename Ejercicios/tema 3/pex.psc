Algoritmo sin_titulo
	// divisores propios de un numero
	Leer num
	primo = verdadero
	Para i<-2 Hasta num/2+1 Hacer
		Si num MOD i =0 Entonces
			primo = falso
			i = num
		FinSi
	FinPara
	Escribir primo
FinAlgoritmo
