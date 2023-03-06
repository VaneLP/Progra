package ejer9;

import ejer9.Excepciones.PublicationException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    //Atributo
    private ArrayList<Publicacion> listaPublicaciones =  new ArrayList<>();

    //metodos
    public boolean anyadir(Publicacion publi){
        return listaPublicaciones.add(publi);//puede ser void pero mejor ponerlo boolean por si lo llegaramos a usar
    }

    public void anyadirLibro(String isbn, String titulo, Autor autor) {
        try{
            Libro libri= new Libro(isbn, titulo,autor);
        }
        catch (PublicationException pE){
            pE.getMessage();
        }
    }

    public Publicacion buscar(String tituloBuscar) throws Exception{
        for (Publicacion p : listaPublicaciones) { //hacemos un iter para recorrer las publicaciones
            if (p instanceof Libro) {
                if (((Libro) p).getTitulo().contains(tituloBuscar))//tenemos que instanciar para poder obtener el titulo
                    return p;
            }
            else if (((Revista) p).getNombre().contains(tituloBuscar)) {//tenemos que instanciar para obtener el nombre
                return p;
            }
        }
        throw new Exception("El titulo "+tituloBuscar+" no a sido encontrado");
    }

    public boolean buscarLibro(Libro l){
        for (Publicacion p : listaPublicaciones) {
            if(p.equals(l))
                return true;
        }
        return false;
    }

    public ArrayList<Revista> revistasOrdenadas(){
        ArrayList<Revista> revistas= new ArrayList<>();

        for (Publicacion p : revistas) {
            if(p instanceof  Revista)
                revistas.add((Revista)p);
            Collections.sort(revistas);
            return revistas;
        }
        return revistas;
    }

    /*
    para ordenar por orden alfabetico tenemos que usar collections.sort(nombreArrayList);
    Y para que funcione a la clase hay que implements comparable
    */

    public void ordenar(){
        ArrayList<Libro> libros= new ArrayList<>();
        ArrayList<Revista> revistas= new ArrayList<>();

        for (Publicacion p : listaPublicaciones) {
            if(p instanceof Libro)
                libros.add((Libro) p);
            else
                revistas.add((Revista) p);
        }

        Collections.sort(libros);
        Collections.sort(revistas);
        listaPublicaciones.clear();
        listaPublicaciones.addAll(libros);
        listaPublicaciones.addAll(revistas);
    }

    public void mostrarLineas(){
        for (Publicacion listaPublicacion : listaPublicaciones) {
            System.out.println(listaPublicacion);
        }

    }

}
