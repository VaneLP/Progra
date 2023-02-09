package examenVanessaLopez;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class JugadorPokemon {
    //atributos
    private String nombre;
    private ArrayList<Pokemon> mochila=new ArrayList<>();


    //constructor
    public JugadorPokemon(String nombre){
        this.nombre=nombre;
    }


    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodos
    /**
     * Metodo para capturar pokeon
     * @param pokemonCapturar le pasamos el pokemon que queremos capturar
     * @return devuelve verdadero si lo capturamos y falso si no
     */
    public boolean capturarPokemon (Pokemon pokemonCapturar){
        int numeroJugador= ThreadLocalRandom.current().nextInt(0,99+1);
        int numeroPokemon= ThreadLocalRandom.current().nextInt(0,50+1) + pokemonCapturar.getVelocidad();

        if (numeroJugador>numeroPokemon){
            mochila.add(pokemonCapturar);
            return true;
        }
        return false;
    }

    /**
     * Metodo para elgir un pokemon
     * @param pokemonElegir se le pasa el pokemon a elegir
     * @param pokeNom se le pasa el nombre del pokemon
     */
    public void elegirPokemon(String pokemonElegir, Pokemon pokeNom){
        if(pokemonElegir.equals(pokeNom.getNombre())){
            pokeNom.toString();
        }
    }

    /**
     * Metodo para eleminar pokemon
     * @param salud se le pasa la salud
     * @return devuelve un contador de los pokemon eleminados con esa salud
     */
    public int eliminarPokemonBySalud(int salud){
        Iterator<Pokemon> iter = mochila.iterator();
        int cont=0;

        while(iter.hasNext()){
            iter.remove();
            cont++;
        }

        return cont;
    }

    /**
     * Metodo para mostar el nombre del jugador y su mochila
     * @return devuelve una cadena de texto
     */
    public String mostrarMochila(){
        return "Nombre del jugador: "+ nombre +
                "\nMochila: " + mochila;
    }


}
