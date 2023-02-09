Algoritmo ejer21
	respuesta = "Es primo"
	divisor <- 2
	Leer n
	Mientras divisor<n Hacer
		Si n MOD divisor==0 Entonces
			respuesta = "No es primo"
		FinSi
		divisor <- divisor+1
	FinMientras
	Escribir respuesta
FinAlgoritmo
