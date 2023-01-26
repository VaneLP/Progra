Algoritmo ejer8
	Escribir "dime un numero"
	Leer numero
	respuesta = "no"
	Mientras numero<>0 Hacer
		Si numero>0 Entonces
			contadorpos = contadorpos+1
		SiNo
			contadorneg = contadorneg+1
			respuesta = "si"
		FinSi
		Escribir "dime otro numero"
		Leer numero
	FinMientras
	Escribir respuesta, " hay numeros negativos"
	Escribir "hay ",contadorneg, " numeros negativos, y hay ",contadorpos," numeros positivos"
FinAlgoritmo
