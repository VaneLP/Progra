public class ejer34 {
    /*
34.Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo.
Usando la función del programa anterior, haz un programa que muestre la suma de los números primos comprendidos entre 1 y 1000
     */

    //-----------FUNCION 1---------------

    /**
     * Funcion que te devuelve la suma de los numero primos compredidos entre el 1 y el 1000
     * @return devuelve la suma de los primos
     */
    public static int sumaPrimo() {
        int suma = 0;

        for (int i = 1; i <= 1000; i++) {
            int primo = cantidadDivisores(i);
            if (primo == 2)
                suma = suma + i;
        }

        return suma;
    }
    //-----------FUNCION 2---------------

    /**
     * Funcion que te devuelve la cantidad de divisores que tiene un numero introducido por el usuario
     * @param number
     * @return devuelve la cantidad de divisores
     */
    public static int cantidadDivisores(int number) {
        int cont = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                cont++;
        }

        return cont;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //mostrar
        System.out.println("la suma de los numero primos comprendidos entre el 1 y el 1000 es = " + sumaPrimo());
    }

}
