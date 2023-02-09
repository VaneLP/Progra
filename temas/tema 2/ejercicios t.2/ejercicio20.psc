Algoritmo ejer20
	Escribir 'Dime la horas, minutos y segundos'
	Leer horas,min,seg
	seg <- seg+1
	Si seg<60 Entonces
		seg = seg
	SiNo
		seg = 0
		min = min+1
	FinSi
	Si min<60 Entonces
		min = min
	SiNo
		min = 0
		horas = horas + 1
	FinSi
	Si horas<24 Entonces
		horas = horas
	SiNo
		horas = 0
	FinSi
	Escribir horas,':',min,':',seg
FinAlgoritmo
