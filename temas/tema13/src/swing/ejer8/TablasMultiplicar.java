package swing.ejer8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablasMultiplicar extends JFrame {
    //atributos
    private JTable tabla;
    private JPanel panelPrincipal;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JButton multiplicarButton;
    private JButton generarTablasButton;

    //constructor
    public TablasMultiplicar(String cadena) {
        super(cadena);
        setBounds(100, 100, 1500, 460);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //si EXISTE tableModel pero hay que escribirlo
        //DefaultTableModel modeloTabla = new DefaultTableModel(null, new String[]{}) para ponerle nombre a las columnas
        //setModel()

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(textFieldA.getText());
                int b=Integer.parseInt(textFieldB.getText());


//                tabla = new JTable(10,(b-a)+1);

                for (int i = 0; i <= 9; i++) {
                    //recorremos las columnas
                    for (int j = 0; j <= 9; j++) {
                        //le ponemos el valor
                        tabla.setValueAt("",i,j);
                    }
                }

                //extra 2
                //recorremos las filas con el valor A y el valor B
                for (int i = a; i <= b; i++) {
                    //recorremos las columnas
                    for (int j = 1; j <= 10; j++) {
                        //le ponemos el valor
                        tabla.setValueAt(i + " x "+j+" = "+i*j,j-1,i-a);
                    }
                }
                tabla.setVisible(true);
                //repaint();

            }
        });

        //extra 1
        generarTablasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mostramos la tabla
                tabla.setVisible(true);
                //llamamos al metodo
                createUIComponents();

            }
        });
    }

    //----MAIN----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TablasMultiplicar ventana = new TablasMultiplicar("Tablas de multiplicar");
            }
        });
    }


    //normal
    //con esto hacemos un componente customizado
    private void createUIComponents() {
        //creamos una nueva tabla con 10 filas y 10 columnas (esto es como si fuera un array)
        tabla = new JTable(10, 10);

        //hacemos la tabla invisible
//        tabla.setVisible(false);

        //recorremos las filas
        for (int i = 0; i <= 9; i++) {
            //recorremos las columnas
            for (int j = 0; j <= 9; j++) {
                //le ponemos el valor
                tabla.setValueAt((1+i) + " x "+(1+j)+" = "+(i+1)*(j+1),i,j);
            }
        }

    }

}

