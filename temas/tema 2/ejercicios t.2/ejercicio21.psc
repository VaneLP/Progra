Algoritmo ejer21
	Escribir "Escribe tu nombre"
	Leer n
	Escribir 'Introduce las horas trabajadas semanales'
	Leer ht
	Escribir 'Dime el precio/hora'
	Leer ph
	Si ht>35 Entonces
		he <- ht-35
		pagohn = 35*ph
		pagohe = he*(1.5*ph)
		salariob = pagohe+pagohn
	SiNo
		salariob <- ph*ht
	FinSi
	Si salariob>500 Entonces
		Si salariob>900 Entonces
			cant = salariob-900
			tasa2 = cant*45/100
			salarion = 500+(400-100)+(cant-tasa2)
			tasas = 100 + tasa2
		SiNo
			cant = salariob-500
			tasa1 = cant*25/100
			salarion = 500+(cant-tasa1)
			tasas = tasa1
		FinSi
	SiNo
		salarion = salariob
		tasas = 0
	FinSi
	Escribir "El usuario con nombre ", n, ". Tiene un salario brudo de ", salariob, " euros y pagado unas tasas de ", tasas, " euros, tendria un salario neto de ", salarion, " euros"
FinAlgoritmo
