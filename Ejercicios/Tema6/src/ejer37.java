import jdk.jshell.Snippet;

import java.util.Scanner;

public class ejer37 {
    /*
37.Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y“2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno.
Implementa las funciones:
•int menu() // Muestra el menú y devuelve el número elegido
•double pideRadio() // Pide que se introduzca el radio y lo devuelve
•double circunferencia(double r) // Calcula la circunferencia y la devuelve
•double area(double r) // Calcula el área y la devuelve

Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario también
pueda solicitar el cálculo del volumen. Añade la función:
•double volumen(double r) // Calcula el volumen y lo devuelve

Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez y se muestren los
tres cálculos posibles (circunferencia, área y volumen).
Modifica el programa anterior de modo que el proceso se repita una y otra vez
(mostrar menú -> realizar el cálculo -> volver a mostrar  menú). Añade una opción más llamada“Salir” que terminará el
programa si es elegida.
     */

    //-----------FUNCION 1---------------

    /**
     * Funcion que muestra el menu
     * @return devuelve el numero elegido
     */
    public static int menu(){
        Scanner entrada= new Scanner(System.in);
        int op;

        do {
            System.out.printf("-------------------------------------------------------%n" +
                    "                        Menu%n" +
                    "-------------------------------------------------------%n" +
                    "Introduce el numero para la operacion que deseas realizar%n" +
                    "1. Circunferencia%n" +
                    "2. Area%n" +
                    "3. Volumen%n" +
                    "4. Todas%n" +
                    "5. Salir%n" +
                    "-------------------------------------------------------%n" +
                    "Operacion: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    return (int) circunferencia(pideRadio());
                case 2:
                    return (int) area(pideRadio());
                //PARTE 2 EJER
                case 3:
                    return (int) volumen(pideRadio());
                //PARTE 3 EJER
                case 4:
                    todas();
                    return 0;
            }
            //PARTE 4 EJER
        }while (op!=5);
        return 0;
    }

    //-----------FUNCION 2---------------

    /**
     * Funcion que pide que se introduzca el radio
     * @return devuelve el radio
     */
    public static double pideRadio(){
        Scanner entrada= new Scanner(System.in);

        System.out.print("Introduce el radio que deseas para poder realizar la operacion ");
        return entrada.nextDouble();
    }

    //-----------FUNCION 3---------------

    /**
     * Funcion que calcula la circunferencia
     * @param r
     * @return devuelve la circunferencia
     */
    public static double circunferencia(double r){
        System.out.println("La circunferencia es de: ");
        return 2*Math.PI*r;
    }

    //-----------FUNCION 4---------------

    /**
     * Funcion que calcula el area
     * @param r
     * @return devuelve el area
     */
    public static double area(double r){
        System.out.println("El area del circulo es: ");
        return Math.PI*Math.pow(r, 2);
    }

    //-----------FUNCION 5---------------
    // PARTE 2 EJER
    /**
     * Funcion que calcula el volumen
     * @param r
     * @return devuelve el volumen
     */
    public static double volumen(double r){
        System.out.println("El volumen del cilindro es: ");
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    //-----------FUNCION 6---------------
    // PARTE 3 EJER
    public static void todas(){
        double all=pideRadio();
        System.out.println(circunferencia(all));
        System.out.println(area(all));
        System.out.println(volumen(all));

    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //llamar menu
        System.out.println(menu());



    }
}
