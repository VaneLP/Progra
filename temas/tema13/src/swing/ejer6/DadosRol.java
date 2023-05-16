package swing.ejer6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class DadosRol extends JFrame {
    //atributos
    private JPanel panelPrincipal;
    private JButton botonD8;
    private JButton botonD20;
    private JButton botonD6;
    private JButton botonD12;
    private JButton botonD10;
    private JLabel jLabelResultado;

    //constructor
    public DadosRol(String cadena){
        super(cadena);
        setBounds(100,100,800,700);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        botonD6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d6= ThreadLocalRandom.current().nextInt(1,6+1);
                jLabelResultado.setText(String.valueOf(d6));
            }
        });


        botonD8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d8= ThreadLocalRandom.current().nextInt(1,8+1);
                jLabelResultado.setText(String.valueOf(d8));
            }
        });

        botonD10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d10= ThreadLocalRandom.current().nextInt(1,10+1);
                jLabelResultado.setText(String.valueOf(d10));
            }
        });

        botonD12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d12= ThreadLocalRandom.current().nextInt(1,12+1);
                jLabelResultado.setText(String.valueOf(d12));
            }
        });

        botonD20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d20= ThreadLocalRandom.current().nextInt(1,20+1);
                jLabelResultado.setText(String.valueOf(d20));
            }
        });
    }


    //---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DadosRol ventana= new DadosRol("Dados de rol");
            }
        });
    }
}
