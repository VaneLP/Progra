Algoritmo ejer22
	Leer n1
	Leer n2
	Si n1>n2 Entonces
		nsup = n1-1
		ninf = n2
	SiNo
		nsup = n2-1
		ninf = n1
	FinSi
	Mientras nsup>ninf Hacer
		Si nsup MOD 3 ==0 Entonces
			Escribir nsup
		FinSi
		nsup = nsup-1
	FinMientras
FinAlgoritmo
