import java.util.Scanner;

public class ejer30 {
    /*
30.Programa que presente un menú y permita calcular repetidas veces
a) el área de círculo (necesitará el radio) ,
b) el área de cuadrado (ecesitará el lado) ,
c) el área de triángulo (necesitará base y altura)
d) Salir.
Usar funciones para cada una de las 3 opciones.
     */

    //-----------FUNCION 1---------------
    /**
     * Funcion para calcular el area de un circulo
     * @param radioFun
     * @return el area del circulo con el radio introducido por el usuario
     */
    public static double areaCirculo(int radioFun){
        return Math.PI*Math.pow(radioFun, 2);
    }

    //-----------FUNCION 2---------------

     /**
     * Funcion para calcular el area de un cuadrado
     * @param ladoFun
     * @return el area del cuadrado con el lado introducido por el usuario
     */
    public static int areaCuadrado(int ladoFun){
        return ladoFun*ladoFun;
    }

    //-----------FUNCION 3---------------

    /**
     * Funcion para calcular el area de un triangulo
     * @param baseFun
     * @param alturaFun
     * @return devuelve el area del triangulo con la base y la altura introducido por el usuario
     */
    public static int areaTriangulo(int baseFun, int alturaFun){
        return (baseFun*alturaFun)/2;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);
        int res;

        //calcular varias veces
        do{
            System.out.printf("-------------------------------------------------------%n"+
                                "                        Menu%n"+
                                "-------------------------------------------------------%n"+
                                "Introduce el numero para la operacion que deseas realizar%n"+
                                "1. El area del circulo%n"+
                                "2. El area del cuadrado%n"+
                                "3. El area del triangulo%n"+
                                "0. Salir%n"+
                                "-------------------------------------------------------%n"+
                                "Operacion: ");
            res= entrada.nextInt();

            switch (res){
                case 1:
                    System.out.println("Para calcular el area del circulo necesitamos el radio, introduce el radio que deseas: ");
                    int radio = entrada.nextInt();
                    System.out.println("El area del circulo es: "+ areaCirculo(radio));
                    break;

                case 2:
                    System.out.println("Para calcular el area del cuadrado necesitamos el lado, introduce el lado que deseas: ");
                    int lado= entrada.nextInt();
                    System.out.println("El area del cuadrado es: "+ areaCuadrado(lado));
                    break;

                case 3:
                    System.out.println("Para calcular el area del tirangulo necesitamos la base y la altura, introduce el base que deseas: ");
                    int base= entrada.nextInt();
                    System.out.println("Ahora indica la altura");
                    int altura= entrada.nextInt();
                    System.out.println("El area del triangulo es: "+areaTriangulo(base,altura));
                    break;
            }
        }while(res!=0);

        System.out.println("Fin del programa");
    }
}
