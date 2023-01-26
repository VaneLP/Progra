package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer2 {
    /*Realizar un programa que tenga una función a la que se le pasa un entero y devuelva un ArrayList con todos sus divisores*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Dime un numero y te dire sus divisores");
        int n= entrada.nextInt();

        System.out.println(divisores(n));

    }

    public static ArrayList divisores(int numero){
        ArrayList lista=new ArrayList();

        for (int i=1;i<=numero;i++){
            if(numero%i==0)
                lista.add(i);
        }
        return lista;
    }
}
