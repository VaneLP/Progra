import java.util.Scanner;

public class EJER4_4 {
    /*
   4.4. Escribe un programa que calcule la nota de un trimestre de la asignatura
        Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos
        primeros exámenes. Si la media de los dos exámenes da un número mayor o igual a
        5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un
        número menor que 5, el alumno habrá tenido que hacer el examen de recuperación
        que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha
        sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación
        es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.

Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5
Ejemplo 2:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5
Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5
    */
    public static void main(String[] args) {

        /*
        Introducimos una cadena de texto en el que pedimos dos notas y creamos dos variables, para que luego despues
        de introducirlas por pantalla se guarden
         */
        System.out.println("Introduce las notas de los dos examenes");
        double n1 , n2;

        Scanner entrada= new Scanner(System.in);
        n1= entrada.nextDouble();
        n2= entrada.nextDouble();

        // hacemos la operacion matematica de la media con los dos numero introducidos
        double media= (n1+n2)/2;

        //hacemos un condicional en el que si la media es mayor o igual a un 5 diga que estamos aprobados y nuestra media
        if (media >= 5) {
            System.out.println("Aprobado, tu media es "+ media);
        }
        // y si nuestra media no es mayor o igual a 5 preguntaremos si la nota del examen de recuperacion es apta o no apta
        else {
            System.out.println("Intrpduce la nota del examen de recuperacion (apto/no apto)");

            //Esto sirve para poder limpiar el codigo despues de poner numeros, para poder poner una cadena de texto y que nos deje escribir
            entrada.nextLine();
            String ap = entrada.nextLine();

            //si la nota media es apta la media cambia a 5 y mostramos la media y si es no apto mostraria la media anterior
            if (ap.equals("apto")) {
                media=5;
            }
            System.out.println("Tu nota media es "+ media);
        }
    }
}
