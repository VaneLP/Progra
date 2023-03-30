import java.util.Scanner;

public class Entornos13 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.printf("Calculador de area o volumen de un cono"+
                        "\n--------------------------------------------\n");
        System.out.println("Dime la altura: ");
        double altura= entrada.nextDouble();

        System.out.println("Dime el radio: ");
        double radio= entrada.nextDouble();

        System.out.printf("Menu"+
                            "\n---------"+
                            "\n 1. Calcular el area"+
                            "\n 2. Calcular el volumen"+
                            "\nOpcion: ");
        int r= entrada.nextInt();

        switch (r){
            case 1:
                System.out.println(Math.PI*radio*(Math.sqrt(Math.pow(altura,2)*Math.pow(radio,2))+radio));
                                    //3.14*3(v(2^2*3^2)+3
                                    //9.42(9)
                break;
            case 2:
                System.out.println((Math.PI*Math.pow(radio,2)*altura)/3);
                break;
        }

    }
}
