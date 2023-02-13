package e_2_mascotas;


import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {

        ArrayList<Mascotas> lista = new ArrayList<>();

        //Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
        for (Mascotas mascota : lista) {
            System.out.println(mascota.getNombre()+" "+mascota.getClass());
        }

        //Mostrar todos los datos de un animal concreto.
        String nombre="Yako";

        for (Mascotas mascota : lista) {
            mascota.getNombre().equals(nombre);
        }

        //Mostrar todos los datos de todos los animales.
        for (Mascotas mascota : lista) {
            mascota.muestra();
        }

        //Insertar animales en el inventario.
        Mascotas perro =new Perro("Yako","12/12/2017", Estado.VIVO,6, Raza.CHIHUAHUA,false);
        Mascotas gato= new Gato("Misifu","6/7/2022", Estado.VIVO,1, ColorGato.PARDO,false);
        Mascotas loro= new Loro("Paco", "1/2/2000", Estado.VIVO,23,true,Pico.CORTO,"argentina",true);
        Mascotas canario= new Canario("Pollo","2/2/2012", Estado.MUERTO, 5,false,Pico.CORTO,ColorCanario.AMARILLOS,false);

        //Eliminar animales del inventario.
        lista.remove(2);

        //Vaciar el inventario.
        lista.removeAll(lista);

    }
}
