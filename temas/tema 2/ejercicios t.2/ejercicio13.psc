Algoritmo ejer13
	Escribir 'Dime dos numeros	'
	Leer n1
	Leer n2
	Si n2=0 Entonces
		suna <- n1+n2; resta <- n1-n2; multiplicacion <- n1*n2
		Escribir 'El resultado de la suma es ',suma,'. El resultado de la resta es ',resta,'. El resultado de la multiplicacion es ',multiplicacion,'. No se puede realizar la division entre 0'
	SiNo
		suma <- n1+n2; resta <- n1-n2; multiplicacion <- n1*n2; division <- n1/n2
		Escribir 'el resultado de la suma es ',suma,'. El resultado de la resta es ',resta,'. El resultado de la multiplicacion es ',multiplicacion,'. El resultado de la division es ',division
	FinSi
FinAlgoritmo
