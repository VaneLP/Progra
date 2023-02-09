public class lvl3_ejer11 {
    /*
    11. Realiza un programa que suma independientemente los pares y los impares de los
números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
     */

    public static void main(String[] args) {

        int cont = 100,par = 0, impar=0;;

//        while (cont <= 200) {
//        if (cont % 2 == 0) {
//
//            par = par + cont;
//        }
//        else {
//
//            impar = impar + cont;
//        }
//        cont++;
//    }


        for (cont = 100; cont <= 200; cont++){
            if (cont % 2 == 0) {

            par = par + cont;
        }
        else {

            impar = impar + cont;
        }
        }

        System.out.println("La suma de los pares es "+par+". La suma de los impares es "+impar);
    }
}
