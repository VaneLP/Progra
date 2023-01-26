import java.util.Scanner;

public class lvl4_ejer22 {
    /*
    22. Realiza un programa que lea dos números y muestre los números múltiplos de 3
comprendidos entre ambos.
     */
    public static void main(String[] args) {

        int mayo=0,meno=0;

        System.out.println("dime dos num");
        Scanner entrada = new Scanner(System.in);
        int num1= entrada.nextInt();
        int num2= entrada.nextInt();



        if (num2>num1){
            mayo= num2;
            meno= num1;
        }
        else{
            mayo= num1;
            meno= num2;

        }

        for (int i =meno;i <= mayo;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }

    }
}
