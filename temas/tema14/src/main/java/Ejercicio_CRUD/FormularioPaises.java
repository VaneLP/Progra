package Ejercicio_CRUD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        //hacemos un modelo de tabla al cual le pasamos el nombre de las columnas
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID","Nombre","Distrito","Pobalacion"});
        //le asignamos a nuestra tabla el modelo que hemos definido
        tabla.setModel(modelo);
        //para que no se puedan mover las columnas (buscado en internet)
        tabla.getTableHeader().setReorderingAllowed(false);

        //BOTON ACTUALIZAR
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //BOTON BORRAR
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //BOTON INSERTAR
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
