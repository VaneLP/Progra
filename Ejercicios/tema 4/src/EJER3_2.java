import java.util.Scanner;

public class EJER3_2 {
    /*
    3.2. Escribe un programa que recibe como datos de entrada una hora expresada en
          horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que
          serán, transcurrido un segundo.
     */
    public static void main(String[] args) {

        System.out.println("Dime una hora en horas, minutos y segundos");
        int h;
        int min;
        int seg;

        Scanner entrada = new Scanner(System.in);
        h = entrada.nextInt();
        min = entrada.nextInt();
        seg = entrada.nextInt();

        seg = seg+1;
        if (seg == 60) {
            seg =  0;
            min = min+1;
        }

        if (min>=60) {
            min = 0;
            h =  h+1;
        }


        if (h>=24) {
            h = 0;
        }

        System.out.println(h + ":" + min + ":" + seg);
    }
}
