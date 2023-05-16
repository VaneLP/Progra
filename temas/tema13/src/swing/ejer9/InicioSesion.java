package swing.ejer9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//FIXME MUCHOS FALLOS, SE CREAN USERS REPES, HASTA LOS HUEVOS
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

                System.out.println("INICIAR");
                System.out.println(guardado);

                // !!!!!
                //FIXME: No hay breaks, asi que sigue comprobando todos los usuarios aunque ya haya encontrado uno. 
                // Hay que tener la opcion de contra incorrecta fuera del bucle (y algun boolean para ver 
                // si ya lo hemos encontrado y salirse del 'for')
                
                //llamamos al metodo y le pasamos el usuario y la contraseña
                for (Map.Entry<String, String> entry : guardado.entrySet()) {
                    if(entry.getKey().equalsIgnoreCase(user) && entry.getValue().equalsIgnoreCase(String.valueOf(contraseña)))
                        JOptionPane.showMessageDialog(null, "Iniciando Sesion");
                    else
                        JOptionPane.showMessageDialog(null, "La contraseña o el usurio que has introducido son incorrectos");
                }
            }
        });

        //EXTRA
        //CREAR USUARIO
        crearCuentaNuevaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                System.out.println("CREAR");
                System.out.println(guardado);

                if (opcion)
                    JOptionPane.showMessageDialog(null, "Usuario creado con exito");
                else
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
     *
     * @param usuario
     * @param contraseña
     */
    public void guardarUsuarios(String usuario, String contraseña) {
        //hacemos un fw para escribir un nuevo doc usuarios.txt
        try (FileWriter fw = new FileWriter("temas/tema13/src/swing/ejer9/usuario.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {

        opcion=false;

            if (guardado.size() == 0) {
                guardado.put(usuario, contraseña);
                bw.write(usuario + "," + contraseña+"\n");
                opcion=true;
            }
            else {
                
                // !!!!!
                //FIXME: Bug parecido. Como el break solo esta en caso de que sean diferentes,
                // siempre que sean iguales, va a seguir dentro del bucle.
                // Como sigue dentro del bucle hasta que encuentra uno diferente, 
                // siempre va a crear una copia de mas en el archivo de texto
               
                //hacemos un iter para recorrer nuestro mapa
                for (String s : guardado.keySet()) {
                    //si el uduario introducido no es igual al usuario que estamos recorriendo
                    if (!usuario.equalsIgnoreCase(s)) {
                        //lo añadimos al mapa
                        guardado.put(usuario, contraseña);
                        //y lo añadimos al txt
                        bw.write(usuario + "," + contraseña+"\n");
                        opcion = true;
                        break;
                    }

                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leer(){
        try(Scanner lectura= new Scanner(new File("temas/tema13/src/swing/ejer9/usuario.txt"))){

            while (lectura.hasNextLine()){
                String seperacion=lectura.nextLine();

                String[] partes=seperacion.split(",");

                if(partes.length==2)
                    guardado.put(partes[0],partes[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
