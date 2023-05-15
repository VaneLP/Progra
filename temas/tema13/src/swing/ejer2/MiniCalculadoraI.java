package swing.ejer2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculadoraI extends JFrame{
    //atributos
    private JLabel JLabelValor;
    private JButton botonSumatorio;
    private JButton botonResta;
    private JButton botonProductorio;
    private JButton botonExponencial;
    private JPanel panelPrincipal;
    private JTextField textFieldNum1;
    private JTextField textFieldnum2;
    private JLabel signo;

    //constructor
    public MiniCalculadoraI(String cadena) {
        super(cadena);

        //seleccionamos donde queremos que apareza nuestra ventana
        setLocation(100, 100);
        //seleccionamos que tamaño queremos que tenga nuestra ventana
        setSize(800, 400);

        //seleccionamos nuestro .form que queremos que se muestre por nuestra ventana
        setContentPane(panelPrincipal);

        //le indicamos que cuando pulsemos la "X" se cierre automaticamente
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //hacemos visible la ventana
        setVisible(true);

        //---- LISTENERS ----
        //SUMA
        botonSumatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(textFieldNum1.getText());
                int num2=Integer.parseInt(textFieldnum2.getText());

                signo.setText("+");
                JLabelValor.setText(String.valueOf(num1+num2));
            }
        });

        //RESTA
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(textFieldNum1.getText());
                int num2=Integer.parseInt(textFieldnum2.getText());

                signo.setText("-");
                JLabelValor.setText(String.valueOf(num1-num2));
            }
        });

        //MULTIPLICACION
        botonProductorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(textFieldNum1.getText());
                int num2=Integer.parseInt(textFieldnum2.getText());

                signo.setText("x");
                JLabelValor.setText(String.valueOf(num1*num2));
            }
        });

        //DIVISION
        botonExponencial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(textFieldNum1.getText());
                int num2=Integer.parseInt(textFieldnum2.getText());

                signo.setText(":");
                JLabelValor.setText(String.valueOf(num1/num2));
            }
        });
    }



    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    //como ejercicio extiende de JFrame no nos hace falta crear un nuevo JFrame
                    //entonces solo tenemos que crear un nuevo objeto de la clase
                    MiniCalculadoraI ventana = new MiniCalculadoraI("Mini Calculadora");

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
