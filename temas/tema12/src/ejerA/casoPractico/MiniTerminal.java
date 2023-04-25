package ejerA.casoPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MiniTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String comando, txt, rutaString;
        MiniFileManager fm = new MiniFileManager();

        do {
            System.out.print("""
                             Si necesitas ayuda escribe 'help'.
                             Si deseas salirte escribe 'exit'.
                             
                             Pon el comando que deseas utilizar:
                             
                             """);
            txt = entrada.next();

            //guardamos el comando
            comando = txt.substring(0, txt.indexOf(' ')-1);

            //guardamos la ruta
            rutaString = txt.substring(txt.indexOf(' ')+1);

            System.out.println("-----------------------------------");

            switch (comando){
                case "pwd":

                    try {
                        fm.mostrarCarpetaActu();
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //--------------
                case "cd":

                    File ruta= new File(rutaString);

                    try {
                        fm.cambiaCarpetaActuADir(ruta);
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //--------------
                case "ls":

                    try {
                        fm.mostrarListaDirecYArchi();
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //--------------
                case "ll":

                    try {
                        fm.mostrarTamanyoYFecha();
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //--------------
                case "mkdir":

                    //guardamos la ultima palabra que sera el nombre del archivo que queremos crear
                    String archivo = rutaString.substring(rutaString.lastIndexOf('/')+1);
                    fm.creaeDirec(archivo);
                    break;
                //--------------
                case "rm":

                    try {
                        fm.borrar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //--------------
                case "mv":
                    String ruta1String = txt.substring(txt.indexOf(' ')+1);
                    File f1 = new File(ruta1String);

                    String ruta2String = txt.substring(txt.lastIndexOf(' ')+1);
                    File f2 = new File(ruta2String);

                    try {
                        fm.mueveORenombra(f1,f2);
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //--------------
                case "help":
                    System.out.print("""
                                     Los comandos que puedes utiliar son:
                                     
                                     - pwd: Mostrara la carpeta actual.
                                     - cd <DIR>: Cambiara la carpeta actual a 'DIR'. Con .. cambiara a una carpeta sueperior.
                                     - ls: Mostrara una lista de directorios y archivos de la carpeta actual.
                                     - ll: Mostrara una lista de directorios y archivos de la carpeta actual con el tamaño y la fecha de ultima modificacion.
                                     - mkdir <DIR>: Crea un directorio 'DIR' en la carpeta actual.
                                     - rm <FILE>: Borrara 'FILE'.
                                     - mv <FILE1> <FILE2>: Movera o renombrara 'FILE1' a 'FILE2'.
                                     - exit: Salir.
                                     """);
                    break;
            }

        }while(!comando.equals("exit"));

        System.out.println("Programa finalizado");
    }
}
