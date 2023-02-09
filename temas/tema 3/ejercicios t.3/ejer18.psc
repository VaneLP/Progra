Algoritmo sin_titulo
	Escribir "Introduce una cantidad de dinero"
	Leer dinero
	Mientras dinero>=500 Hacer
		dinero = dinero-500
		b500 = b500+1
	FinMientras
	Escribir b500, " billetes de 500e"
	Mientras dinero>=200 Hacer
		dinero = dinero-200
		b200 = b200+1
	FinMientras
	Escribir b200, " billetes de 200e"
	Mientras dinero>=100 Hacer
		dinero = dinero-100
		b100 = b100+1
	FinMientras
	Escribir b100, " billetes de 100e"
	Mientras dinero>=50 Hacer
		dinero = dinero -50
		b50 = b50+1
	FinMientras
	Escribir b50, " billetes de 50e"
	Mientras dinero>=20 Hacer
		dinero = dinero-20
		b20 = b20+1
	FinMientras
	Escribir b20, " billetes de 20e"
	Mientras dinero>=10 Hacer
		dinero <- dinero-10
		b10 <- b10+1
	FinMientras
	Escribir b10, " billetes de 10e"
	Mientras dinero>=5 Hacer
		dinero = dinero-5
		b5 = b5 +1
	FinMientras
	Escribir b5, " billetes de 5e"
FinAlgoritmo
