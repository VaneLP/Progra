import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApuntesClase extends JFrame { //tiene que extender de JFrame (ventana)

    public ApuntesClase(String cadena) { //constructor
        super(cadena); //para poder introducirle un nombre
        // tambien podria hacerse con setTitle("")

        /*
        setSize(w,h); //dimensiones de la ventana ancho y alto
        setLocation(x,y); //posicion en la que quiero la ventana
        Thread.sleep(long); //para ponerle los milisegundos
        */
        //Creacion de la ventana
        setBounds(500,0,500,300); //coordenadas en X,Y, altura y anchura
        setDefaultCloseOperation(EXIT_ON_CLOSE); //para que al cerrar la ventana finalice el programa
        setVisible(true); //para hacer la ventana visible

        JPanel panelPrincipal=new JPanel(); //para crear un panel
        panelPrincipal.setBackground(new Color(200,0,0)); //para seleccionar un color RGB
        this.setContentPane(panelPrincipal); //para asignar el panel a la venta
        /*
        this.add(panelPrincipal); //para añadirle el color
        panelPrincipal.setLayout(null); //para ponerle un layaout
        */

        //componentes
        JLabel etiq = new JLabel("Componente de texto"); //creacion de la etiqueta y su nomnbre
        panelPrincipal.add(etiq); //añadimos la etiqueta al panel

        JLabel etiq2 = new JLabel("componente de texto 2");
        etiq2.setForeground(new Color(255,255,255));
        panelPrincipal.add(etiq2);

        //etiq.setBounds(0,0,0,0); //Si tenemos un layout, le indicamos donde colocar la etiquera. Si no, no hace nada

        JButton boton = new JButton("pulsame"); //creacion de un boton
        panelPrincipal.add(boton); //añadimos un boton

        JButton boton2 = new JButton("pulsame 2");
        panelPrincipal.add(boton2);

        //con clase anonima
        boton.addActionListener(new ActionListener() {//capturamos el evento de pulsar el boton y le decimos lo que tenemos que hacer
            @Override
            public void actionPerformed(ActionEvent e) {
                etiq.setForeground(Color.cyan);
            }
        });

    }


    JLabel etiq;

    private void pulsarBoton1() {
        etiq.setForeground(Color.MAGENTA);
    }


            // ____MAIN____ //
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

//con una clase para capturar el evento de pulsar el boton
class  ImplentarAccion implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent){
        System.out.println(actionEvent.getSource().getClass());
        //getSource nos devuelve un objeto

        JButton boton = (JButton) actionEvent.getSource();
        boton.setBackground(Color.CYAN);
    }
}
