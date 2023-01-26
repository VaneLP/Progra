Algoritmo ejer11
	contador <- 100
	Mientras contador<=200 Hacer
		Si contador MOD 2==0 Entonces
			pares <- pares+contador
		SiNo
			impares <- impares+contador
		FinSi
		contador <- contador+1
	FinMientras
	Escribir 'la suma de los pares es ',pares,'. La suma de los impares es ',impares
FinAlgoritmo
