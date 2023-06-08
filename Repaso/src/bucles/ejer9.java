package bucles;
// Realiza un programa que suma independientemente los pares y los impares de los números comprendidos entre 100 y 200,
// y luego muestra por pantalla ambas sumas
public class ejer9 {
    public static void main(String[] args) {
        int pares=0,impares=0;

        for (int i=100;i<=200;i++){
            if(i%2==0)
                pares+=i;
            else
                impares+=i;
        }

        System.out.println("pares"+pares+"impar"+impares);
    }
}
