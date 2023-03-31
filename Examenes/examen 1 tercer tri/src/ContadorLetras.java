import java.util.TreeMap;

public class ContadorLetras {
    public static void main(String[] args) {
        //creamos un TreeMap en el que la llave va a ser un Char y el valor un entero
        TreeMap<Character,Integer> contadorDeLetras= new TreeMap<>();

        String frase="Decir que Java es estupendo porque funciona con todos los sistemas operativos es como decir que el sexo anal es estupendo porque funciona con todos los géneros (Alanna)";


        //mostramos
        for (Character character : contadorDeLetras.keySet()) {
            System.out.println(character+":"+contadorDeLetras.values());
        }
    }

}
