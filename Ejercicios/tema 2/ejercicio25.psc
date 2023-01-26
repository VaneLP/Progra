Algoritmo ejer25
	Escribir 'introduce una cantidad de dinero'
	Leer n
	Si n>=500 Entonces
		b500 <- n/500
		b500 <- trunc(b500)
		n <- n-500*b500
		Escribir b500,' billetes de 500'
	FinSi
	Si n>=200 Entonces
		b200 <- trunc(n/200)
		n <- n-200*b200
		Escribir b200,' billetes de 200'
	FinSi
	Si n>=100 Entonces
		b100 <- trunc(n/100)
		n <- n-100*b100
		Escribir b100,' billetes de 100'
	FinSi
	Si n>=50 Entonces
		b50 <- trunc(n/50)
		n <- n-50*b50
		Escribir b50,'billetes de 50'
	FinSi
	Si n>=20 Entonces
		b20 <- trunc(n/20)
		n <- n-20*b20
		Escribir b20,'billetes de 20'
	FinSi
	Si n>=10 Entonces
		b10 <- trunc(n/10)
		n <- n-10*b10
		Escribir b10,'billetes de 10'
	FinSi
	Si n>=5 Entonces
		b5 = trunc(n/5)
		n = n-5*b5
		Escribir b5, "billetes de 5"
	FinSi
FinAlgoritmo
