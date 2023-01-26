Algoritmo ejer26
	Escribir "Introduce las notas de los 2 examenes"
	Leer n1, n2
	m = (n1+n2)/2
	Si m >=5 Entonces
		Escribir "aprobado, tu media es de: ", m
	SiNo
		Escribir "introduce la nota del examen de recuperacion"
		Leer n3
		Si n3>=5 Entonces
			Escribir "apto"
		SiNo
			Escribir "no apto"
		FinSi
	FinSi
FinAlgoritmo
