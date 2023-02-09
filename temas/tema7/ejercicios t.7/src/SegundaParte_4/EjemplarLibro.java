package SegundaParte_4;

import java.time.LocalDate;

/*Implementar una clase llamada EjemplarLibro que se va a usar en una biblioteca y que
tiene los siguientes atributos:
    • Título de libro (se le pone en el momento del alta)
    • Fecha de adquisición (es la fecha del sistema en el momento del alta) (Usa
        LocalDate.now() para obtener la fecha del sistema como cadena de texto, nos
        devuelve un objeto de tipo LocalDate mas información sobre fechas en java)
    • Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene varios
        ejemplares)
    • Prestado (sí /no).

Inicialmente no está prestado.Además, tiene los siguientes métodos:
    • Constructor 1: cuando es el primer ejemplar de un determinado título, se le
        pasa como parámetro solo el título del libro. El resto de datos los puede
        calcular él.
    • Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos
        salvo el número de ejemplar que será 1 más el del libro pasado.
    • Prestar(): si no está prestado lo marca como prestado y devuelve true ̧ si está
        prestado no hace nada y devuelve false.
    • Devolver(): si está prestado lo marca como no prestado y devuelve true ̧ si no
        está prestado no hace nada y devuelve false.
    • toString(): Genera un String con el nombre, la fecha entre paréntesis y el
        número de ejemplar entre corchetes. Este método se usará para sacar por
        pantalla de forma cómoda los datos de un libro.

Haz un main() que cree 4 libros (probando ambos constructores), que realice algún
préstamo y devolución, y finalmente muestre los libros -con toString()-.*/
public class EjemplarLibro {
    //atributos
    private String tituloLibro, fechaAdquisicion;
    private int nEjemplar;
    private boolean prestado=false;

    //constructor
    public EjemplarLibro (String tituloLibro){
        this.tituloLibro=tituloLibro;
        fechaAdquisicion = LocalDate.now().toString();
        nEjemplar= 1;
    }

    public EjemplarLibro(EjemplarLibro libro){
        this.tituloLibro= libro.tituloLibro;
        this.fechaAdquisicion=libro.fechaAdquisicion;
        this.nEjemplar= libro.nEjemplar+1;
    }

    //metodos
    public boolean prestar(){
        if(!prestado) {
            prestado = true;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean devolver(){
        if(prestado){
            prestado=false;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Titulo del libro: " + tituloLibro + '\n' +
                "Fecha de adquisicion (" + fechaAdquisicion +")"+ '\n' +
                "Numero del ejemplar {" + nEjemplar + '}';
    }

}
