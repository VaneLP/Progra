Algoritmo ejercicio10
	Escribir 'introduce tus horas semanales trabajadas'
	Leer horas_trab
	Escribir "introduce tus horas en una jornada laboral normal"
	Leer horas_nor
	horas_extra <- horas_trab-horas_nor
	Escribir 'tienes ',horas_extra,' horas extras'
	precio_h <- 2
	pago_he <- horas_extra*precio_h*2
	cobro <- pago_he+horas_nor*precio_h
	Escribir "tu salario es de " , cobro , " euros semanales"
FinAlgoritmo
