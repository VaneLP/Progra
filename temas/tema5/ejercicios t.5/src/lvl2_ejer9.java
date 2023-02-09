public class lvl2_ejer9 {
    /*
    9. Realiza un programa que calcula y escribe la suma y el producto de los 10 primeros
números naturales
    */

    public static void main(String[] args) {

        int contador,suma = 0, multi = 1;

        for (contador = 1; contador <= 10; contador++) {
            suma = contador + suma;
            multi = contador * multi;
        }

        System.out.println("la suma es " + suma + ". La multiplicacion es " + multi);

    }
}
