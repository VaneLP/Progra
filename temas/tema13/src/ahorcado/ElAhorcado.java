package ahorcado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ElAhorcado {
    //____MAIN____
    public static void main(String[] args) {
        new ElAhorcado().iniciar();
    }

    //declaramos de la clase Ventana, nuestra ventana
    Ventana ventana;

    //metodo iniciar
    private void iniciar(){
        //creamos la nueva ventana
        ventana= new Ventana();
        //y le decimos que no haga nada cuando se pulse la X
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //creamos nuestro listener del adaptador ventana
        ventana.addWindowListener(new AdaptadorVentana());
    }

    //Clase Ventana
    class Ventana extends JFrame{
        //constructor
        public Ventana(){
            //redimensionamos la ventana
            setBounds(350,300,600,800);
            //selecionamos un titulo porque hereda de JFrame y lo podemos hacer :D
            setTitle("Juego del Ahorcado");

            //creamos un nuevo objeto panel para poder añadirlo a la ventana
            PanelPrincipal panelPrincipal = new PanelPrincipal();
            add(panelPrincipal);

            //lo hacemos visible, siempre tiene que estar abajo para que se visualice toddo lo de arriba
            setVisible(true);
        }
    }

    //Clase Panel para contener los elementos de la interfaz
    class PanelPrincipal extends JPanel{
        //atributos que vamos a usar en el PanelPrincipal
        private JLabel imagen,respuesta;
        private JPanel panelLetras;
        //atributo de la palabra secreta que usaremos en formarLetrasSecretas y en el panelPrincipal
        private String secreta;

        //constructor
        public PanelPrincipal(){
            //para establecer la disposicion del panel
            setLayout(new BorderLayout());

            //____PANEL TITULO____
            //creamos un nuevo JPanel de un panel para la respuesta
            JPanel panelTitulo = new JPanel();
            //añadimos un color de fondo al panel de las respuestas
            panelTitulo.setBackground(new Color(159, 114, 175));

            //____TITULO____
            //Creamos una etiqueta con JLabel
            JLabel titulo = new JLabel("DAM IES Thiar");
            //color
            titulo.setForeground(new Color(255,255,200));
            //añadimos una fuente
            titulo.setFont(new Font("Ubuntu",Font.BOLD,24));
            //añadimos un icono para la etiqueta
            titulo.setIcon(new ImageIcon("temas/tema13/src/ahorcado/archivos/ahorcado.png"));
            //al panel del titulo, le añadimos el titulo
            panelTitulo.add(titulo);
            //lo añadimos al panel principal y declaramos la posicion
            add(panelTitulo,BorderLayout.PAGE_START);

            //____PANEL CENTRAL____
            //creamos un nuevo JPanel de un panel para la respuesta
            JPanel panelCentral = new JPanel();
            panelCentral.setLayout(new BorderLayout());

            //____PANEL IMAGEN____
            //creamos un nuevo JPanel de un panel para la respuesta
            JPanel panelImagen = new JPanel();

            //____IMAGEN____
            //habemos un nuevo JLabel de la imagen
            imagen=new JLabel();
            //le ponemos la imagen
            imagen.setIcon(new ImageIcon("temas/tema13/src/ahorcado/archivos MIOS/Hangman-0.png"));
            //añadimos al panel de la imagen la imagen y la centramos
            panelImagen.add(imagen,BorderLayout.CENTER);
            //añadimos al panel de la imagen la imagen
            panelCentral.add(panelImagen,BorderLayout.PAGE_START);

            //____PANEL LETRAS____
            //creamos un nuevo JPanel de panel letras
            panelLetras=new JPanel();
            //llamamos al metodo para poner los botones
            ponerBotones();
            panelCentral.add(panelLetras);

            //añadimos al Panel PRINCIPAL el panel central
            //lo añdimos al panel principal
            add(panelCentral,BorderLayout.CENTER);


            //____PANEL RESPUESTA____
            //creamos un nuevo JPanel de un panel para la respuesta
            JPanel panelRespuesta = new JPanel();
            //añadimos un color de fondo al panel de las respuestas
            panelRespuesta.setBackground(new Color(159, 114, 175));

            //____RESPUESTA____
            //creamos un nuevo JLabel de respuesta y le ponemos un titulo
            respuesta=new JLabel("Palabra");
            //le ponemos una fuente
            respuesta.setFont(new Font("Ubuntu", Font.BOLD,48));
            //le ponemos un color
            respuesta.setForeground(new Color(102,0, 255));
            //añadimos al panel de la respuesta la respuesta
            panelRespuesta.add(respuesta);
            //lo añadimos al panel principal y le declaramos la disposicion
            add(panelRespuesta,BorderLayout.PAGE_END);

            //a la palabra secreta le asignamos una palabra, en este caso selecciona una de
            //nuestro diccionario
            secreta = palabraDiccionario();
            System.out.println(secreta);
            //llamaos al metodo para que nos muestre la palabra con _ en vez de con letras
            formarLetrasSecretas();
        }



        //Metodo para añadir botones
        public void ponerBotones(){
            JButton boton1,botonÑ,boton2;
            //para enlazar la tecla pulsada con los botons que creamos, necesitamos hacer
            //un objeto de esta
            TeclaPulsada pulsada= new TeclaPulsada();

            for (char i='A'; i<='N';i++){
                //creamos el boton
                boton1=new JButton(""+ i);
                //añadimos el listener
                boton1.addActionListener(pulsada);
                //lo añadimos
                panelLetras.add(boton1);
            }

            botonÑ=new JButton(""+'Ñ');
            //añadimos el listener
            botonÑ.addActionListener(pulsada);
            panelLetras.add(botonÑ);

            for (char i='O'; i<='Z';i++){
                //creamos el boton
                boton2=new JButton(""+ i);
                //añadimos el listener
                boton2.addActionListener(pulsada);
                //lo añadimos
                panelLetras.add(boton2);
            }
        }

        //meotodo para formar letras secretas
        public void formarLetrasSecretas(){
            String formaSecreta="";
            for(int i =0;i<secreta.length();i++){
                formaSecreta+="_ ";
            }
            //trim() quita espacios delante y detras de la palabra
            respuesta.setText(formaSecreta.trim());
        }


        //clase para pulsar los botones
        class TeclaPulsada implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //creamos un nuevo JButton
                //e.getSource() obtenemos el boton que se a pulsado
                JButton botonPulsado=(JButton)e.getSource();
                //deshabilitamos el boton para que no se pueda volver a pulsar
                botonPulsado.setEnabled(false);
                //e.getActionCommand nos duelve el texto del boton (una letras)
                comprobarLetra(e.getActionCommand());
            }
        }

        //atributos usados en comprobarLetra
        private int fallo=0;
        private final int max_fallos=6;
        private ArrayList<Character> lestrasPulsadas=new ArrayList<>();
        //metodo comprobar letras
        public void comprobarLetra(String c){
            //para saber si la palabra esta completa
            boolean acertada=true;
            //añadimos la letra a una lista
            lestrasPulsadas.add(c.charAt(0));

            //si la palabra secreta contiene el caracter
            if(secreta.toUpperCase().contains(c)){
                String formaSecreto="";

                //recorremos la palabra secreta
                for(int i =0; i<secreta.length();i++){
                    //si la letra que pulsamos esta contenida en la paralabra secra en el caracter i
                    if(lestrasPulsadas.contains(secreta.toUpperCase().charAt(i)))
                        //a nuestra forma secreta le añadimos ese caracter, en esa posicion
                        formaSecreto=formaSecreto+secreta.toUpperCase().charAt(i)+" ";
                    else{
                        //si no, decimos que acertada pasa a false
                        acertada=false;
                        //seguimos dejando el caracter no acertado con _
                        formaSecreto+="_ ";
                    }
                }
                //devolvemos la cadena de texto
                //trim() quita espacios delante y detras de la palabra
                respuesta.setText((formaSecreto.trim()));
            }
            //si la palabra secretra no contiene el caracter
            else {
                //sumamos el contador de fallos
                fallo++;
                //cambiamos el acertada a falso
                acertada= false;
                //usamos el numero de fallos para cambiar la imagen
                imagen.setIcon(new ImageIcon("temas/tema13/src/ahorcado/archivos MIOS/Hangman-"+fallo+".png"));
            }
            //si acertada = true
            if (acertada) {
                //Introducimos un texto
//            System.out.println("has ganado");

                //desactivamos los botones cuando perdemos
                Component[] botonesLetras = panelLetras.getComponents();
                for (Component botoncin : botonesLetras) {
                    botoncin.setEnabled(false);
                }

                //mostramos un mensaje al usuario
                JOptionPane.showMessageDialog(null,"Has ganado!");
            }
            //si fallos es = al numero maximo de fallos
            if(fallo==max_fallos) {
                //introducimos un texto
//            System.out.println("AHORCADO");

                //desactivamos los botones cuando perdemos
                Component[] botonesLetras = panelLetras.getComponents();
                for (Component botoncin : botonesLetras) {
                    botoncin.setEnabled(false);
                }

                //mostramos un mensaje al usuario
                JPanel panel=new JPanel();
                JOptionPane.showMessageDialog(panel,"lo siento, has perdido","AHORCADO",JOptionPane.INFORMATION_MESSAGE);
                int opcion=JOptionPane.showConfirmDialog(panel,"¿Deseas continuar?","AHORCADO",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_OPTION){
                    //cerramos con el dispose() la ventana anterior
                    ventana.dispose();
                    //iniciamos una nueva
                    iniciar();
                }
                else{
                    //cerramos el programa (buscado en internet)
                    System.exit(0);
                }
            }

        }

        //metodo para elegir una palabra del diccionario del Tema 12
        public String palabraDiccionario(){
            //ponemos el fichero
            File f = new File("temas/tema13/src/ahorcado/diccionario.txt");
            ArrayList<String> lista= new ArrayList<>();

            //lo leemos
            try(Scanner lectura = new Scanner(f)){
                //recorremos las palabras
                while (lectura.hasNext()) {
                    String palabra=lectura.next();

                    //si la palabra es mayor o igual a 4 y quitamos los acentos con el matches
                    if(palabra.length()>=4 && palabra.matches("[A-Za-z]*"))
                        //la guardamos
                        lista.add(palabra);
                }
                //generamos un numero aleatorio del 0 al maximo del array
                int numAle = ThreadLocalRandom.current().nextInt(0, lista.size());
                //devolvemos esa palabra aleatoria
                return lista.get(numAle);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AdaptadorVentana extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            super.windowClosing(e);
            //creamos un panel nuevo
            JPanel panel=new JPanel();
            int opcion=JOptionPane.showConfirmDialog(panel,"¿Realmente deseas salir?","AHORCADO",JOptionPane.YES_NO_OPTION);
            if(opcion==JOptionPane.YES_OPTION){
                //cerramos el programa (buscado en internet)
                System.exit(0);
            }

        }
    }

}
