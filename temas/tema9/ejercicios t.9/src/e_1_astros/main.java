package e_1_astros;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Astros> lista = new ArrayList<>();


    }

    public void menu(){
        Scanner entrada= new Scanner(System.in);

        do{
            System.out.printf("Menu"+
                            "---------"+
                            "1. Añadir planita"+
                            "2. Añadir satelite"+
                            "3. Mostrar"+
                            "Opcion: ");
            int num = entrada.nextInt();

        }while(num != 4);
    }

}
