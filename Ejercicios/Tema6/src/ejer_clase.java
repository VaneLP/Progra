import java.util.concurrent.ThreadLocalRandom;

public class ejer_clase {
    // Sacar 6 numeros aleatorios con arrays y que no se repitan

    public static void main(String[] args) {
        int num[] = new int[6];


        for (int i = 0; i < 6; i++){

            num[i]=ThreadLocalRandom.current().nextInt(1,49 + 1);

        }
        for (int i = 0; i < 6; i++){

            System.out.println(num[i]);

        }
    }
}
