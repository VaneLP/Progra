Algoritmo sin_titulo
	primern = 0
	segn = 1
	Leer n
	Si n<=0 Entonces
		Escribir "no valido"
	SiNo
		Si n=1 Entonces
			Escribir primern
		SiNo
			Si n=2 Entonces
				Escribir primern
				Escribir segn
			SiNo
				Escribir primern
				Escribir segn
				Para cont<-0 Hasta n+3 Hacer
					suma = primern+segn
					primern = segn
					segn = suma
					Escribir suma
				FinPara
			FinSi
		FinSi
	FinSi
FinAlgoritmo
