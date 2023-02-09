Algoritmo ejer17
	Escribir "piensa un numero del 1 al 100"
	inicial = 50
	calculo = 25
	Mientras adivinar == 0 Hacer
		Escribir "Es tu numero ", inicial
		Leer pregunta
		Si pregunta == "si" Entonces
			adivinar = 1
		SiNo
			Escribir "Tu numero es mayor que ", inicial , "?"
			Leer pregunta
			Si pregunta == "si" Entonces
				inicial = inicial + calculo
			SiNo
				inicial = inicial-calculo
			FinSi
			calculo = trunc(calculo/2)
			Si calculo==0 Entonces
				calculo = 1
			FinSi
		FinSi
	FinMientras
	Escribir "Tu numero es ", inicial
FinAlgoritmo
