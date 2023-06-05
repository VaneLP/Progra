package final1_VanesaLopez;

import java.io.*;

public class Programa {
    public static void main(String[] args) {
        //creamos un nuevo File al que le pasamos el fichero
        File f = new File("estudiantes.dat");

        //creamos un array de estudiantes con un tamaño de 100
        Estudiante[] estudiante = new Estudiante[100];

        //es un fichero serializado por tanto lo leemos con file imput stram
        try(FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bufis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bufis)) {

            //inicializamos un contador a 0
            int cont =0 ;

            //mientas que nuestro buffered input stream sea mayor a 0
            while(bufis.available()>0){
                //añadimos al array en la posicion del contador el estudiante del fichero
                //que deberemos castear a estudiante
                estudiante[cont] = (Estudiante) ois.readObject();

                //sumamos el contador
                cont++;
                //si el contador > a la longitud de nuestro array salimos;
                if(cont>estudiante.length)
                    break;
            }

            //mostramos los estudiantes que promocionan + nota media
            for (Estudiante estudianteProciona : estudiante) {
                if (estudianteProciona.promociona()) {
                    System.out.println(estudianteProciona);

                }
            }

            //mostramos los estudiantes que NO promocionan + asignaturas que no aprueban + nota
            for (Estudiante estudianteNoPromociona : estudiante) {
                if(!estudianteNoPromociona.promociona()){
                    System.out.println(estudianteNoPromociona);
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
