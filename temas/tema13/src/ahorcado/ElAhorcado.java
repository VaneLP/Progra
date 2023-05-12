package ahorcado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ElAhorcado {
    //____MAIN____
    public static void main(String[] args) {
        new ElAhorcado().iniciar();
    }

    //metodo iniciar
    private void iniciar(){
        //creamos una nueva ventana porque es una clase
        Ventana ventana = new Ventana();
        //y le decimos que se cierre cuando pulsamos la X
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Clase Ventana
    class Ventana extends JFrame{
        //constructor
        public Ventana(){
            //redimensionamos la ventana
            setBounds(350,300,600,500);
            //selecionamos un titulo porque hereda de JFrame y lo podemos hacer :D
            setTitle("Juego del Ahorcado");

            //creamos un nuevo objeto panel para poder añadirlo a la ventana
            PanelPrincipal panelPrincipal = new PanelPrincipal();
            add(panelPrincipal);

            //añadimos los botos a la ventana
            //add(new PanelBotones());

            //lo hacemos visible, siempre tiene que estar abajo para que se visualice toddo lo de arriba
            setVisible(true);
        }
    }

    //atributos que vamos a usar en el PanelPrincipal
    private JLabel imagen,respuesta;
    private JPanel panelLetras;

    //Clase Panel para contener los elementos de la interfaz
    class PanelPrincipal extends JPanel{
        //constructor
        public PanelPrincipal(){
            //para establecer la disposicion del panel
            setLayout(new BorderLayout());



            //____PANEL TITULO____
            //creamos un nuevo JPanel de un panel para la respuesta
            JPanel panelTitulo = new JPanel();
            //añadimos un color de fondo al panel de las respuestas
            panelTitulo.setBackground(new Color(150,150,150));

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
            imagen.setIcon(new ImageIcon("temas/tema13/src/ahorcado/archivos/Hangman-0.png"));
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
            panelRespuesta.setBackground(new Color(150,150,150));

            //____RESPUESTA____
            //creamos un nuevo JLabel de respuesta y le ponemos un titulo
            respuesta=new JLabel("Palabra");
            //le ponemos una fuente
            respuesta.setFont(new Font("Ubuntu", Font.BOLD,48));
            //le ponemos un color
            respuesta.setForeground(new Color(255,0,0));
            //añadimos al panel de la respuesta la respuesta
            panelRespuesta.add(respuesta);
            //lo añadimos al panel principal y le declaramos la disposicion
            add(panelRespuesta,BorderLayout.PAGE_END);

            //a la palabra secreta le asignamos una palabra, en este caso Thiar
            secreta="thiar";
            //llamaos al metodo para que nos muestre la palabra con _ en vez de con letras
            formarLetrasSecretas();
        }
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

    //atributo de la palabra secreta que usaremos en formarLetrasSecretas y en el panelPrincipal
    private String secreta;
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
            imagen.setIcon(new ImageIcon("temas/tema13/src/ahorcado/archivos/Hangman-"+fallo+".png"));
        }
        //si acertada = true
        if (acertada) {
            //Introducimos un texto
            System.out.println("has ganado");

        }
        //si fallos es = al numero maximo de fallos
        if(fallo==max_fallos) {
            //introducimos un texto
            System.out.println("AHORCADO");

        }
    }


    //Clase para los botones
    class PanelBotones extends JPanel{
        //constructor
        public PanelBotones(){
            //Creamos los botones
//            add(new JButton("Uno", new ImageIcon("temas/tema13/src/ahorcado/archivos/ahorcado.png")));
//            add(new JButton("Dos"));
//            add(new JButton("Tres"));

            //tambien 2 bucles y añadir la ñ en medio
        }
    }


}
