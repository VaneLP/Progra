package ejer9;

import ejer9.Excepciones.PublicationException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    //Atributo
    private ArrayList<Publicacion> listaPublicaciones =  new ArrayList<Publicacion>();

    //metodos
    public void anyadir(Publicacion publi){
        listaPublicaciones.add(publi);
    }

    public void anyadirLibro(String isbn, String titulo, Autor autor) {
        try{
            Libro libri= new Libro(isbn, titulo,autor);
        }
        catch (PublicationException pE){
            pE.getMessage();
        }
    }

    public void buscar(String tituloBuscar) throws Exception{

            throw new Exception("El titulo "+tituloBuscar+" no a sido encontrado");
    }

    public boolean buscarLibro(Libro l){
        for (Publicacion listaPublicacion : listaPublicaciones) {
            if(l.equals(listaPublicacion))
                return true;
            else
                return false;
        }
        return false;
    }

    public ArrayList<Revista> revistasOrdenadas(){
        Collections.sort(revistasOrdenadas());

        return revistasOrdenadas();
    }

    public void ordenar(){

    }
    /*
    para ordenar por orden alfabetico tenemos que usar collections.sort(nombreArrayList);
    Y para que funcione a la clase hay que implements comparable
    */

    public void mostrarLineas(){
        for (Publicacion listaPublicacion : listaPublicaciones) {
            System.out.println(listaPublicacion);
        }

    }

}
