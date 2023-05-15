package swing.ejer5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class NumAle extends JFrame {
    //atributos
    private JPanel panelPrincipal;
    private JSlider sliderMax;
    private JButton botonAle;
    private JLabel JLabelValor;
    private JLabel sliderValor;

    //constructor
    public NumAle(String cadena){
        super(cadena);
        setBounds(100,100,500,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);
        setVisible(true);

        botonAle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numAle = ThreadLocalRandom.current().nextInt(0,sliderMax.getValue());

                JLabelValor.setText(String.valueOf(numAle));
            }
        });
        sliderMax.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sliderValor.setText(String.valueOf(sliderMax.getValue()));
            }
        });
    }

    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                NumAle ventana = new NumAle("Numero aleatorio");

            }
        });
    }
}
