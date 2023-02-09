import java.util.Scanner;

public class EJER1_5 {
    /*
    5. Haz un programa que pregunte al usuario por un número de días y nos muestre
        los segundos, minutos y horas que son ese número de dias
     */
    public static void main(String[] args) {

        System.out.println("Dime un dia");
            int dia;

        Scanner entrada = new Scanner(System.in);
            dia = entrada.nextInt();

        int horas=24;
        int min=60;
        int seg=60;

        horas = dia * horas;
        min = horas * min;
        seg = min * seg;

        System.out.println("horas " + horas + ", min " + min + ", seg " + seg);
    }
}
