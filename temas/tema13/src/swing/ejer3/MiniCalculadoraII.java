package swing.ejer3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculadoraII extends JFrame{
    //atributos
    private JLabel JLabelValor;

    private JRadioButton radioButtonSumatorio;
    private JRadioButton radioButtonProductorio;
    private JRadioButton radioButtonExponencial;

    private JPanel panelPrincipal;
    private JTextField textFieldNum1;
    private JTextField textFieldnum2;
    private JButton botonCalcula;

    //constructor
    public MiniCalculadoraII(String cadena) {
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
        botonCalcula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(textFieldNum1.getText());
                int num2=Integer.parseInt(textFieldnum2.getText());
                int resultado=0;

                if(radioButtonSumatorio.isSelected()){
                    for (int i = num1; i<=num2; i++){
                        resultado +=i;
                    }
                    JLabelValor.setText(String.valueOf(resultado));

                } else if (radioButtonExponencial.isSelected()) {
                    resultado = (int) Math.pow(num1,num2);

                    JLabelValor.setText(String.valueOf(resultado));

                } else if (radioButtonProductorio.isSelected()) {
                    resultado=1;

                    for (int i = num1; i<=num2; i++){
                        resultado = resultado * i;
                    }
                    JLabelValor.setText(String.valueOf(resultado));
                }
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
                    MiniCalculadoraII ventana = new MiniCalculadoraII("Mini Calculadora II");


                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
