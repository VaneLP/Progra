package swing.ejer1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ParOImpar extends JFrame{
    //atributos
    private JTextField textFieldValor;
    private JButton botonParOImpar;
    private JLabel JLabelMostrar;
    private JPanel panelPrincipal;

    //constructor
    public ParOImpar(String cadena){
        super(cadena);

        //seleccionamos donde queremos que apareza nuestra ventana
        setLocation(100,100);
        //seleccionamos que tamaño queremos que tenga nuestra ventana
        setSize(500,400);

        //seleccionamos nuestro .form que queremos que se muestre por nuestra ventana
        setContentPane(panelPrincipal);

        //le indicamos que cuando pulsemos la "X" se cierre automaticamente
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //hacemos visible la ventana
        setVisible(true);


        //---- LISTENERS ----
        botonParOImpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton botonPulsado=(JButton)e.getSource();
                parOImpar(Integer.parseInt(textFieldValor.getText()));
            }
        });

    }

    //metodo
    public void parOImpar(int num){
        if(num % 2 == 0)
            JLabelMostrar.setText("PAR");
        else
            JLabelMostrar.setText("IMPAR");
    }

    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    //como ejercicio extiende de JFrame no nos hace falta crear un nuevo JFrame
                    //entonces solo tenemos que crear un nuevo objeto de la clase
                    ParOImpar ventana = new ParOImpar("¿Par o impar?");
                    ventana.setResizable(false);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }


}
