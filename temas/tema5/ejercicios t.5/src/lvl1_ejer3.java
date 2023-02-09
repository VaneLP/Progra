public class lvl1_ejer3 {
    /*
    3. Realiza un programa que muestre los números pares comprendidos entre el 1 y el
        200. Esta vez utiliza un contador sumando de 1 en 1.
     */

    public static void main(String[] args) {
        int cont;

        for (cont=0; cont<=200; cont++) {

           if (cont % 2 == 0){
               System.out.println(cont);
           }

        }
    }
}
