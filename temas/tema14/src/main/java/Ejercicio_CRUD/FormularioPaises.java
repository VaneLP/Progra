package Ejercicio_CRUD;

import javax.swing.*;
import java.awt.*;

public class FormularioPaises extends JFrame{
    //atributos
    private JPanel panelPrincipal;
    private JComboBox comboBoxPais;
    private JTextPane textPaneID;
    private JLabel id;
    private JTextPane textPaneNombre;
    private JTextPane textPaneDistrito;
    private JTextPane textPanePoblacion;
    private JButton actualizarButton;
    private JButton borrarButton;
    private JButton insertarButton;
    private JTable tabla;

    //contructor
    public FormularioPaises(String cadena){
        //para pasarle el titulo en el main
        super(cadena);
        setContentPane(panelPrincipal);
        //para que se cierre cuando le damos a la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para que se ajuste solo
        pack();
        //hacemos la ventana visible
        setVisible(true);
    }

    //main
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FormularioPaises ventana = new FormularioPaises("Paises");
            }
        });
    }
}
