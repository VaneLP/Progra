package cadenas_txt;

public class ejr1 {
    public static void main(String[] args) {
        //a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
        String txt = "hola";

        System.out.println(txt.toUpperCase() + " . " + txt.toLowerCase() + " . " +
                "hola".toLowerCase() + " . " + "hola".toUpperCase());

        //b. Decir si en la cadena aparece el carácter ‘x’.
        txt = "holax";
        if (txt.lastIndexOf('x') < 0)
            System.out.println("si");
        else
            System.out.println("no");

        //c. Decir si la cadena tiene más de 10 posiciones.
        if (txt.length()>10)
            System.out.println("si");
        else
            System.out.println("no");

        //d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        if(txt.substring(3).contains("x"))
            System.out.println("si");
        else
            System.out.println("no");

        //e. Crear una cadena formada por las 5 primeras posiciones de la cadena.
        txt.substring(0,5);

        //f. Crear una cadena formada por las 5 últimas posiciones de la cadena.
        txt.substring(txt.length()-5);

        //g. Decir si la cadena es igual a la cadena “hola”.
        String c = "hola";
        if(txt.equals(c))
            System.out.println("si");
        else
            System.out.println("ño");

        //h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena es un número, esto es,
        // contiene solo dígitos decimales (del 0 a 9)
        txt="1234";
        int n;
        n= Integer.parseInt(txt);

        //i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena es un número
        // hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de la A a F.
        n= Integer.parseInt(txt,16);

        //j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
        txt="prueva";
        if(txt.equalsIgnoreCase("prueva"))
            txt.replace('v','b');

        //k. Decir si la primera posición de la cadena es igual a la última.
        if(txt.charAt(0)==txt.charAt(txt.length()-1))
            System.out.println("si");
        else
            System.out.println("no");

        //l. Decir cuántos dígitos numéricos hay en la cadena.
        int con=0;
        for(int i = 0;i<=txt.length();i++){
            if ((txt.charAt(i)+"").matches("[0-9]"))
                con++;
        }
        System.out.println(con);

        //m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
        txt="radar";

        StringBuilder sb = new StringBuilder(txt);

        if(sb.equals(sb.reverse()))
            System.out.println("chi");
        else
            System.out.println("ño");

        //n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones intercambiadas.
        // Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
        char cc=txt.charAt(0);
        char cc2=txt.charAt(txt.length()-1);

        StringBuilder s2=new StringBuilder(txt);
        s2.setCharAt(0,cc2);
        s2.setCharAt(s2.length()-1,cc);

        s2.toString();


    }
}
