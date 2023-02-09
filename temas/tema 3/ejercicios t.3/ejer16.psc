Algoritmo ejer16
	nmayor <- -100000000000000
	nmenor <- 10000000000000
	Escribir 'Cuantos numero vas a introducir'
	Leer introducir
	save <- introducir
	Escribir 'Pon los numeros que quieras introducir'
	Repetir
		Leer num
		introducir <- introducir-1
		Si num>nmayor Entonces
			nmayor <- num
		FinSi
		Si num<nmenor Entonces
			nmenor <- num
		FinSi
		nuevonum <- nuevonum+num
	Hasta Que introducir==0
	media <- nuevonum/save
	Escribir "El numero mayor de los que has introducido es: ", nmayor,'. El numero menor de los que has introducidor es: ',nmenor
	Escribir "La media de todos los numeros que has introducido es: ",media
FinAlgoritmo
