import java.util.Scanner;

public class ejer1 {
    //Realizar un programa al que  se  le  introduzca  una  cadena por  teclado  y  haga lo siguiente:

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String s1;
        System.out.println("Dime un texto");
        s1 = entrada.nextLine();


        System.out.println("a.Mostrar   por   pantalla   el   contenido   de   la   cadena   pasada   a   mayúsculas   y minúsculas.");
        System.out.println(s1.toUpperCase());
        //minus
        System.out.println(s1.toLowerCase());

        //---------------
        System.out.println("b.Decir si en la cadena aparece el carácter ‘x’.");
        if (s1.lastIndexOf("x") < 0)
            System.out.println("No hay una x");
        else
            System.out.println("Si hay una x");

        //---------------
        System.out.println("c.Decir si la cadena tiene más de 10 posiciones.");
        if (s1.length() > 10)
            System.out.println("Tiene mas de 10 posiciones");
        else
            System.out.println("No hay 10 posiciones");

        //---------------
        System.out.println("d.Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.");
        if (s1.substring(4).lastIndexOf("x") >= 0)
            System.out.println("contiene una x");
        else
            System.out.println("No contiene una x");

        //---------------
        System.out.println("e.Crear una cadena formada por las 5 primeras posiciones de la cadena.");
        System.out.println(s1.substring(0, 5));

        //---------------
        System.out.println("f.Crear una cadena formada por las 5 últimas posiciones de la cadena.");
        int var = s1.length() - 5;
        System.out.println(s1.substring(var));

        //---------------
        System.out.println("g.Decir si la cadena es igual a la cadena “hola”.");
        String s2 = "Hola";
        if (s1 == s2)
            System.out.println("La cadena es igual a hola");
        else
            System.out.println("La cadena no es igual a hola");

        //otra manera de hacerlo
//        System.out.println(s1.equals("hola")?"la palabra es igual a hola": "la palabra NO es igual a hola");

        //---------------
        System.out.println("h.Convertir la cadena de entrada a una variable de tipo int, suponiendo que dichacadena es un número, esto es, contiene solo dígitos decimales (del 0 a 9)");
        if (s1.matches("[0-9]+[^.,]")) {
            System.out.println(Integer.parseInt(s1));
        } else{
            System.out.println("no es valido");
        }

        //---------------
        System.out.println("i.Convertir la cadena de entrada a una variable de tipo int, suponiendo que dichacadena   es   un   número   hexadecimal,   esto   es,   contiene   solo dígitos   decimales(del 0 a 9) y letras de la A a F.");
        if (s1.matches("[0-9]+[^.,]+[A-F]]")) {
            System.out.println(Integer.parseInt(s1,16));
        } else{
            System.out.println("no es valido");
        }

        //---------------
        System.out.println("j.Si se encuentra con en su interior con “prueva” sustituir por “prueba”.");
        System.out.println(s1.replace("prueva","prueba"));
        // para guardarla s1=s1.replace

        //---------------
        System.out.println("k.Decir si la primera posición de la cadena es igual a la última.");
        int var2 = s1.length() - 1;

        if (s1.substring(0, 1).equals(s1.substring(var2)))
            System.out.println("La primera posicion de la cadena es igual a la ultima");
        else
            System.out.println("La primera posicion de la cadena no es igual a la ultima");

        //---------------
        System.out.println("l.Decir cuántos dígitos numéricos hay en la cadena.");


        //---------------
        System.out.println("m.Decir  si   la  cadena  es   un   palíndromo   (se   lee  igual   hacia  adelante   como   haciaatrás)");
        String cadenaReves= new String();

        for (int i = s1.length()-1; i>=0; i++)
            cadenaReves= cadenaReves+ s1.charAt(i);
        System.out.println("Cadena: "+s1+ " cadena al reves: "+cadenaReves+"="+ s1.equals(cadenaReves));

        //---------------
        System.out.println("n.Crear una cadena que sea igual a la introducida, pero con la primera y últimaposiciones intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.");


    }
}
