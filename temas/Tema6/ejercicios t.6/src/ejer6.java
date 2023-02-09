import java.util.Scanner;

public class ejer6 {
    /*
    6. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
    (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
    diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama
    me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);
        int contA=0, contE=0, contI=0, contO=0, contU=0;

        //introducir frase
        System.out.println("Dime una frase");
        String frase= entrada.nextLine();

        //quitar mayus
        frase = frase.toLowerCase();

        System.out.println("La frase: "+frase+" contiene");

        for(int ini = 0; ini<frase.length();ini++){

            switch (frase.charAt(ini)){
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
            }
        }
        System.out.printf(" Nº de A's: "+ contA +
                        "%n Nº de E's: "+ contE +
                        "%n Nº de I's: "+ contI +
                        "%n Nº de O's: "+ contO +
                        "%n Nº de U's: "+ contU);
    }
}
