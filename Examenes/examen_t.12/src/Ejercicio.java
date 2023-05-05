import java.io.*;
import java.util.*;

public class Ejercicio {
    /*
    -Crea una estructura de tipo conjunto para almacenar los pokemon. Las
    clases deben estar preparadas para ser almacenas en una estructura de
    tipo conjunto (V)
    - Lee los datos del fichero csv e introduce a los pokemon válidos en
    la estructura. (V)
    - Ahora debes escribir a todos los objetos pokemon, no a la estructura
    que los contiene, en un fichero de nombre pokemon_ordenados.ser dentro del
    directorio recursos que debes crear dentro del directorio del proyecto.
    Debemos guardarlos de forma ordenada por el tipo, y a igualdad de tipo,
    por el nombre. Recuerda, almacenamos objetos.
    */
    public static void main(String[] args) {
        //creamos una estructura de tipo conjunto para almacenar los pokemons
        HashSet<Pokemon> conjuntoPokemon = new HashSet<>();

        //guardamos la ruta de pokemon
        File rutaPokemon = new File("C:\\Users\\Vanessa\\Desktop\\examen_t.12\\pokemon.csv");

        //guardamos la ruta donde los vamos a guardar
        File guardadoPokemon = new File("C:\\Users\\Vanessa\\Desktop\\examen_t.12\\recursos\\pokemon_ordenador.ser");

        //hacemos un try-for-resources
        //leemos el fichero de pokemon.csv
        try(Scanner lectura = new Scanner(rutaPokemon)){

            //hacemos un while del Scanner en el cual mientras que quedan lineas se hace
            while(lectura.hasNextLine()){
                String linea = lectura.nextLine();//para pasar a la siguiente linea

                //hacemos un array de string para poder pasarle luego las partes y le indicamos el caracter de serparion
                //que separa a los pokemons, que en este caso es una ","
                String[] partes = linea.split(",");

                //por si acaso no hay un Pokemon que tenga nombre, lvl, salud y tipo hacemos un if para que no
                //no lo añada
                if(partes.length==4){
                    //y a nuestro conjunto de Pokemons, le hacemos un nuevo pokemon con todos sus atributos
                    //teniendo que pasar dos de ellos a enteros
                    conjuntoPokemon.add(new Pokemon(partes[0],Integer.parseInt(partes[1]),Integer.parseInt(partes[2]),partes[3]));
                }

            }

            //pasamos nuestro conjunto a un arrayList para ordenarlos :)
            ArrayList<Pokemon> arrayPokemon = new ArrayList<>(conjuntoPokemon);
            //ordenarlos con una clase anonima
            // 1º TIPO 2º Nombre
            arrayPokemon.sort(new Comparator<Pokemon>() {
                @Override
                public int compare(Pokemon p1, Pokemon p2) {
                    //si el pokemon 1 tiene el MISMO tipo que el pokemon 2 devuelve 0
                    if(p1.getTipo().compareToIgnoreCase(p2.getTipo()) == 0)
                        //por tanto se ordena por nombre
                        return p1.getNombre().compareToIgnoreCase(p2.getNombre());

                        //si no son el mismo se ordenan por tipo
                    else
                        return p1.getTipo().compareToIgnoreCase(p2.getTipo());
                }
            });


            //prueba mostrar
            for (Pokemon pokemon : arrayPokemon) {
                System.out.println(pokemon);
            }


            //guardamos el fichero serializado por el .ser
            try(FileOutputStream fos = new FileOutputStream(guardadoPokemon);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)
            ){
                //recorremos la lista y los escribirmos en el nuevo fichero
                for (Pokemon pokemon : arrayPokemon) {
                    oos.writeObject(pokemon);
                }
            }
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
