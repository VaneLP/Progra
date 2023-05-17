package swing.ejer9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InicioSesion extends JFrame {
    //atributos
    private JPanel panelPrincipal;
    private JPasswordField contraseñaPasswordField;
    private JButton crearCuentaNuevaButton;
    private JCheckBox recuerdameCheckBox;
    private JTextField usuarioTextField;
    private JButton iniciarSesionButton;
    boolean opcion = false;
    //hacemos un mapa para guardar nuestros usuarios
    Map<String, String> guardado = new HashMap<>();

    //constructor
    public InicioSesion(String cadena) {
        super(cadena);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para que se ajuste solo
        pack();
        setVisible(true);


        //listener
        //INICIAR SESION
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //metodo para leer el fichero
                leer();

                //hacemos un array de caracteres con la contraseña, porque nos devuelve caracteres
                char[] holi = contraseñaPasswordField.getPassword();

                //creamos un string vacio
                StringBuilder contraseña = new StringBuilder();

                //recorremos el array
                for (char c : holi) {
                    //añadimos los caracteres al string
                    contraseña.append(c);
                }

                //variable para guardar el usuario, si no da fallo
                String user = usuarioTextField.getText();

                //pruebas
                System.out.println("INICIAR");
                System.out.println(guardado);

                //creamos un booleano que nos diga si el usuario a sido encontrado o no
                boolean usuarioEncontrado = false;
                
                //llamamos al metodo y le pasamos el usuario y la contraseña
                for (Map.Entry<String, String> entry : guardado.entrySet()) {
                    if(entry.getKey().equalsIgnoreCase(user) && entry.getValue().equalsIgnoreCase(String.valueOf(contraseña))) {
                        //si lo encuentra pasa a true
                        usuarioEncontrado = true;
                        //salimos del bucle si no crea 80 usuarios
                        break;
                    }
                }

                //comprobamos si el usuario a sido encontrado
                if(usuarioEncontrado)
                    //si lo a encontrado hacemos un joptionpane que enseñe una cadena txt
                    JOptionPane.showMessageDialog(null, "Iniciando Sesion");
                else
                    //si no lo encuentra hace otro joptionpane que enseñe otra cadena de txt
                    JOptionPane.showMessageDialog(null, "La contraseña o el usurio que has introducido son incorrectos");

            }
        });

        //EXTRA
        //CREAR USUARIO
        crearCuentaNuevaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //metodo para leer el archivo
                leer();

                //hacemos un array de caracteres con la contraseña, porque nos devuelve caracteres
                char[] holi = contraseñaPasswordField.getPassword();

                //creamos un string vacio
                StringBuilder contraseña = new StringBuilder();

                //recorremos el array
                for (char c : holi) {
                    //añadimos los caracteres al string
                    contraseña.append(c);
                }
                String user = usuarioTextField.getText();
                //llamamos al metodo y le pasamos el usuario y la contraseña
                guardarUsuarios(user, contraseña.toString());

                //pruebas
                System.out.println("CREAR");
                System.out.println(guardado);

                //si cuando creamos el usuario la opcion es true
                if (opcion)
                    //joptionpane con una cadena de txt de que se a creado con exito
                    JOptionPane.showMessageDialog(null, "Usuario creado con exito");
                else
                    //y si no joptionpane con cadena de txt de que ya existe
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
            }
        });
    }


    //----MAIN----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                InicioSesion ventana = new InicioSesion("Inicio de sesion");
            }
        });
    }

    /**
     * Metodo para guardar usuarios
     * @param usuario
     * @param contraseña
     */
    public void guardarUsuarios(String usuario, String contraseña) {
        //hacemos un fw para escribir un nuevo doc usuarios.txt
        try (FileWriter fw = new FileWriter("temas/tema13/src/swing/ejer9/usuario.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {

        //prueba
        opcion=false;

            //si el tamaño de mi mapa guardado es igual a 0
            if (guardado.size() == 0) {
                //guardamos el primer nuevo usuario
                guardado.put(usuario, contraseña);
                //lo escribimos
                bw.write(usuario + "," + contraseña+"\n");
                //cambiamos la opcion a true para que nos diga luego que se a creado bien
                opcion=true;
            }

            else {
                //booleano para saber si el usuario existe o no
                boolean usuarioExiste= false;
               
                //hacemos un iter para recorrer nuestro mapa
                for (String s : guardado.keySet()) {
                    //si el usuario introducido es igual al usuario que recorremos s
                    if (usuario.equalsIgnoreCase(s)) {
                        //cambiamos el booleano
                        usuarioExiste=true;
                        //salimos si no, se crean 80
                        break;
                    }
                }

                //creamos otro if en el que si el usuario no existe
                if(!usuarioExiste) {
                    //lo añadimos al mapa
                    guardado.put(usuario, contraseña);
                    //y lo añadimos al txt
                    bw.write(usuario + "," + contraseña + "\n");
                    opcion = true;
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Metodo para leer el archivo
     */
    public void leer(){
        //leemos el archivo
        try(Scanner lectura= new Scanner(new File("temas/tema13/src/swing/ejer9/usuario.txt"))){

            //mientras que el archivo tenga una siguiente linea
            while (lectura.hasNextLine()){
                //guardamos la linea en un string
                String seperacion=lectura.nextLine();

                //con un array separamos por 2 partes y le indicamos que se separan con la ","
                String[] partes=seperacion.split(",");

                //si la longitud es de 2
                if(partes.length==2)
                    //se me guardan las partes
                    guardado.put(partes[0],partes[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
