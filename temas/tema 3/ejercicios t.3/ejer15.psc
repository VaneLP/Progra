Algoritmo ejer15
	Escribir 'Introduce un numero del 1 al 9'
	Repetir
		Leer num
		Si  NO (num>=1 Y num<=9) Entonces
			Escribir 'El numero introducido no es correcto'
		FinSi
	Hasta Que num>=1 Y num<=9
	Repetir
		contador <- contador+1
		multiplicar <- num*contador
		Escribir multiplicar
	Hasta Que contador==10
FinAlgoritmo
