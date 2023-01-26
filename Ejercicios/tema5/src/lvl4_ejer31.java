import java.util.Scanner;

public class lvl4_ejer31 {
    /*
    31. Día de la semana
Existen varios algoritmos para calcular el día de la semana en que cae una fecha
cualquiera. El que se utiliza en este ejercicio lo cuenta el danés Claus Tøndering en su
web The Calendar FAQ.
Escriba un programa que calcule el día de la semana en que cae una fecha cualquiera
posterior a 1582 (es decir, desde que se utiliza el calendario gregoriano) mediante el
siguiente algoritmo:

     */
    public static void main(String[] args) {



        Scanner entrada= new Scanner(System.in);
        //--
        System.out.println("dia");
        int dia= entrada.nextInt();
        //--
        System.out.println("mes");
        int mes= entrada.nextInt();
        //--
        System.out.println("año (a partir de 1583)");
        int ano = entrada.nextInt();

        //-----------------------------------------

        if(ano >= 1583){

            int a = (14-mes)/12;
            int b= ano - a ;
            int c= mes + (a*12) -2;
            int d= b/4;
            int e= b/100;
            int f= b/400;
            int g= (c*31)/12;
            int h= dia + b + d - e + f + g;
            int i= h%7;

            System.out.println("el dia "+dia+" del mes "+mes+ " de "+ ano+" es ");

            switch (i){
                case 0:
                    System.out.println("Domingo");
                    break;

                case 1:
                    System.out.println("Lunes");
                    break;

                case 2:
                    System.out.println("Martes");
                    break;

                case 3:
                    System.out.println("Miercoles");
                    break;

                case 4:
                    System.out.println("Jueves");
                    break;

                case 5:
                    System.out.println("Viernes");
                    break;

                case 6:
                    System.out.println("Sabado");
                    break;
            }

        }
        else{
            System.out.println("¡Le he pedido un año posterior a 1582!");
        }



     //--
    }
}
/*
• A es el cociente de la división de 14 menos el mes entre 12,
• B es el año menos A
• C es el mes más doce veces A menos 2
• D es el cociente de la división de B entre 4
• E es el cociente de la división de B entre 100
• F es el cociente de la división de B entre 400
• G es el cociente de 31 veces C entre 12
• H es el día más B más D menos E más F más G
• I es el resto de la división de H entre 7
• Si I es 0, el día cae en Domingo; si I es 1, el día cae en Lunes; si I es 2, el día cae en
Martes, etc
El programa no tiene por qué comprobar que se escribe una fecha correcta (más allá de
que el año sea posterior a 1582)

CÁLCULO DEL DÍA DE LA SEMANA
Escriba el número de día: 15
Escriba el número de mes: 2
Escriba el número de año (a partir de 1583): 1564
¡Le he pedido un año posterior a 1582!

CÁLCULO DEL DÍA DE LA SEMANA
Escriba el número de día: 1
Escriba el número de mes: 1
Escriba el número de año (a partir de 1583): 1583
El día 1 del mes 1 de 1583 es sábado

CÁLCULO DEL DÍA DE LA SEMANA
Escriba el número de día: 24
Escriba el número de mes: 2
Escriba el número de año (a partir de 1583): 2017
El día 24 del mes 2 de 2017 es viernes

CÁLCULO DEL DÍA DE LA SEMANA
Escriba el número de día: 31
Escriba el número de mes: 7
Escriba el número de año (a partir de 1583): 1990
El día 31 del mes 7 de 1990 es martes
 */