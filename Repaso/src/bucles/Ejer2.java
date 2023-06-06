package bucles;
//Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.
public class Ejer2 {
    public static void main(String[] args) {

        for(int i=0; i <= 200; i+=2){
            System.out.println(i);
        }

        System.out.println("--------------------");

        int cont=0;
        while(cont<=200){
            System.out.println(cont);
            cont+=2;
        }


    }
}
