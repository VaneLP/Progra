
import java.util.Scanner;

public class Entornos12 {
    /*
    La aplicación mostrará la nueva hora con el incremento, de modo que si, por ejemplo,  el usuario introduce
    la hora 13, el minuto 59, el segundo 56 y el incremento 12, el programa imprimirá que la hora resultante
    es 14:00:08 (busca en la red un método que te permita expresar la hora, los minutos y los segundos con
    dos cifras).*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int dia=0;

        System.out.print("Dime la hora = ");
        int hora= entrada.nextInt();

        System.out.print("Los minutos = ");
        int min= entrada.nextInt();

        System.out.print("Los segundos = ");
        int seg= entrada.nextInt();

        System.out.printf("Cuantos segundos deseas incrementar la hora introducida  %02d : %02d : %02d \n",hora,min,seg);
        int segIncrementados= entrada.nextInt();

        seg=seg+segIncrementados;

        while (seg>=60){
            seg=seg-60;
            min=min+1;
        }

        while(min>=60) {
            min=min-60;
            hora= hora+1;
        }

        while(hora>=24) {
            hora = hora-24;
            dia=dia+1;
        }

        System.out.printf("La hora con los segundos incrementados es: %02d : %02d : %02d . Y han pasado: %d dias", hora, min,seg,dia);
    }
}
