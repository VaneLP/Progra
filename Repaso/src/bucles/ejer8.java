package bucles;

import java.util.Scanner;

//Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún
// número negativo, cuantos positivos y cuantos negativos.
public class ejer8 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("dime numeros. 0salir");
        int n,contn=0,contpos=0;
        boolean sdfsdf=false;

        do {
            n= entrada.nextInt();

            if(n<0) {
                contn++;
                sdfsdf = true;
            }else
                contpos++;

        }while(n==0);
        System.out.println(sdfsdf+"neg"+contn+"pos"+contpos);
    }
}

