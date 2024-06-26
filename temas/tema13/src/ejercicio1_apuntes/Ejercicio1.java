package ejercicio1_apuntes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ejercicio1 extends JFrame{
    //atributos
    private JSlider r;
    private JSlider g;
    private JSlider b;
    private JPanel color;
    private JPanel panelSelectorColores;
    private JLabel hexadecimal;
    private JLabel rojo;
    private JLabel verde;
    private JLabel azul;
    private JLabel azulNum;
    private JLabel rojoNum;
    private JLabel verdeNum;

    //constructor para poder insertarle un titulo a la ventana
    public Ejercicio1(String cadena) {
        super(cadena);

        //seleccionamos donde queremos que apareza nuestra ventana
        setLocation(100,100);
        //seleccionamos que tamaño queremos que tenga nuestra ventana
        setSize(500,400);

        //seleccionamos nuestro .form que queremos que se muestre por nuestra ventana
        setContentPane(panelSelectorColores);

        //le indicamos que cuando pulsemos la "X" se cierre automaticamente
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //hacemos visible la ventana
        setVisible(true);



        //Listeners
        //Slider rojo
        r.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                color.setBackground(new Color(r.getValue(), g.getValue(),b.getValue()));
                rojoNum.setText(String.valueOf(r.getValue()));

                //pasar a hexadecimal con el 02 mantenemos el 0 a la izquierda y la x lo pasa solo
                // a hexadecimal, no hace falta el toHExString
                String roHex = String.format("%02x",r.getValue());
                String veHex = String.format("%02x",g.getValue());
                String azHex = String.format("%02x",b.getValue());
                String hexa = roHex+veHex+azHex;
                hexadecimal.setText("#"+hexa);
            }
        });

        //Slider verde
        g.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                color.setBackground(new Color(r.getValue(), g.getValue(),b.getValue()));
                verdeNum.setText(String.valueOf(g.getValue()));

                //pasar a hexadecimal
                String roHex = String.format("%02x",r.getValue());
                String veHex = String.format("%02x",g.getValue());
                String azHex = String.format("%02x",b.getValue());
                String hexa = roHex+veHex+azHex;
                hexadecimal.setText("#"+hexa);

            }
        });

        //Slider azul
        b.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                color.setBackground(new Color(r.getValue(), g.getValue(),b.getValue()));
                azulNum.setText(String.valueOf(b.getValue()));

                //pasar a hexadecimal
                String roHex = String.format("%02x",r.getValue());
                String veHex = String.format("%02x",g.getValue());
                String azHex = String.format("%02x",b.getValue());
                String hexa = roHex+veHex+azHex;
                hexadecimal.setText("#"+hexa);
            }
        });






    }


    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    //como ejercicio 1 extiende de JFrame no nos hace falta crear un nuevo JFrame
                    //entonces solo tenemos que crear un nuevo objeto de la clase Ejercicios1
                    Ejercicio1 ventana = new Ejercicio1("Vanessa Lopez Pastor");
                    ventana.setResizable(false);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
