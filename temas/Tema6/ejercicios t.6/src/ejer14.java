public class ejer14 {
    /*
14.Describe que realiza el código siguiente e indica si contiene algún error.

1 java.util.Scanner teclado = new java.util.Scanner(System.in);
 2 System.out.println("Introduce una cadena:");
 3 String cadena = teclado.nextLine();
 4 StringBuilder cadenaSB = new StringBuilder(cadena);
 5 int pos;
 6 do {
 7 pos = cadenaSB.indexOf(" ");
 8 if (pos!=-1) cadenaSB.deleteCharAt(pos);
 9 } while (pos != -1);
10 System.out.println(cadenaSB);
     */
    public static void main(String[] args) {
        /*
        El problema es que esta importando directamente la libreria a la hora de usar la clase
        en vez de importar la libreria al principio y luego llamar a la clase
         */
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();

        StringBuilder cadenaSB = new StringBuilder(cadena);

        int pos;

        do {
            pos = cadenaSB.indexOf(" ");
            if (pos!=-1) cadenaSB.deleteCharAt(pos);

            } while (pos != -1);

        System.out.println(cadenaSB);
    }
}
