package ejerB.ejr9;

import utilidades.Persona;

import java.io.*;
import java.util.ArrayList;

/*En el fichero datos_personas.bin se encuentra serializada
una lista de personas.Recupera los datos, crea otra lista con aquellas personas con edad entre
20 y 29 años y guardala serializada en el fichero datos_veintes.ser*/
public class ejer9 {
    public static void main(String[] args) {
        ArrayList<Persona> listaEdadVeinte =new ArrayList<>();

        //PARA LEER LOS DATOS DE UN ARCHIVO SERIALIZADO
        try(FileInputStream fis= new FileInputStream("temas\\tema12\\DOCS\\datos_personas.bin");
            BufferedInputStream bufis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bufis) ){

            ArrayList<Persona> listaPersonas =new ArrayList<>();
            //mientras que tengamos info disponible hacemos X
            while(bufis.available()>0){
                listaPersonas= (ArrayList<Persona>) ois.readObject();
            }

            for (Persona p : listaPersonas) {
                if(p.getEdad()>=20 && p.getEdad()<=29)
                    listaEdadVeinte.add(p);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //PARA ESCRIBIR LOS DATOS DE FORMA SERIALIZADA EN OTRO ARCHIVO
        try (FileOutputStream fos = new FileOutputStream("temas\\tema12\\DOCS\\datos_veintes.set", false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos) ){

            oos.writeObject(listaEdadVeinte);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
