Algoritmo sin_titulo
	Leer num
	numer = num
	i = 0
	mayo = 0
	meno = 0
	media = 0 
	Repetir
		Leer num2
		Si i == 0 Entonces
			mayo = num2
			meno = num2
		SiNo
			Si num2>mayo Entonces
				mayo = num2
			FinSi
			Si num2 < meno Entonces
				meno = num2
			FinSi
		FinSi
		i = i + 1
		media = media + num2
	Hasta Que i >= numer
	mediaA = media/numer
	Escribir mediaA, ".....", meno, ".......", mayo
FinAlgoritmo
