package ejerB.ejr6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejer6B {
    public static void main(String[] args) {
        File pi =new File("temas\\tema12\\DOCS\\pi-million.txt");

        Scanner entrada= new Scanner(System.in);

        System.out.println("Dime un numero");
        String num = entrada.nextLine();

        try (Scanner lectura= new Scanner(pi)){
            String numeroPi = lectura.nextLine();

            for (int i = 0; i+num.length()<=numeroPi.length();i++ ){
                String trozoPi = numeroPi.substring(i,num.length()+i);

                if(trozoPi.equals(num)) {
                    System.out.println("Aparece");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
