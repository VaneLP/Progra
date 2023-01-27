package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ejer3 {
    /*Supongamos una clase Producto con dos atributos:
• String nombre
• int cantidad

Implementa esta clase con un constructor (con parámetros) además de los getters y setters de sus dos atributos. No es necesario comprobar los datos introducidos.
A continuación, en el programa principal haz lo siguiente: */
    public static void main(String[] args) {
        //1. Crea 5 instancias de la Clase Producto.
        Producto p1=new Producto("Galletas",10);
        Producto p2=new Producto("Pizza",1);
        Producto p3=new Producto("Chuches",235);
        Producto p4=new Producto("Cereales",2);
        Producto p5=new Producto("Coca-Cola",6);

        //2. Crea un ArrayList.
        ArrayList<Producto> lista=new ArrayList<>();

        //3. Añade las 5 instancias de Producto al ArrayList.
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        //4. Visualiza el contenido de ArrayList utilizando Iterator.
        Iterator<Producto> iter= lista.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //5. Elimina dos elementos del ArrayList.
        lista.remove(p3);
        lista.remove(p4);

        //6. Inserta un nuevo objeto producto en medio de la lista.
        Producto p6=new Producto("Drogas",2);
        lista.add(3,p6);

        //7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
        System.out.println("------------------------------------");

        //hay que volver a pasarle la lista para que se reinicie
        iter= lista.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //8. Elimina todos los valores del ArrayList.
        lista.clear();

    }
}
