package Ejercicio_CRUD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;

public class FormularioPaises extends JFrame {
    //atributos
    CiudadesDao daoCiudades = new CiudadesDao();
    PaisDao daoPais = new PaisDao();


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
    public FormularioPaises(String cadena) {
        //para pasarle el titulo en el main
        super(cadena);
        setContentPane(panelPrincipal);
        //para que se cierre cuando le damos a la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para que se ajuste solo
        pack();
        setLocationRelativeTo(null);

        //llamamos a la funcion para llenar el comboBox
        rellenarComboBoxPais();

        //hacemos la ventana visible
        setVisible(true);

        //fixme BOTON ACTUALIZAR
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //para que no se nos modifique cualquier ciudad necesitamos el id
                    //para ello cogemos el valor de la fila que hayamos seleccionado y la columna 0 que es la del id
                    String id = String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0));
                    //tambien necesitamos el codigo
                    String code = ((Pais) comboBoxPais.getSelectedItem()).getCode();

                    //creamos el panel
                    PanelActualizar actualizo = new PanelActualizar(code, id);

                    generarTabla();
                }catch (ArrayIndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(null,"No puedes realizar esa accion");
                }
            }
        });

        //fixme BOTON BORRAR
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //para que no se nos modifique cualquier ciudad necesitamos el id
                    //para ello cogemos el valor de la fila que hayamos seleccionado y la columna 0 que es la del id
                    String id = String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0));

                    //creamos un nuevo jpanel
                    JPanel panel = new JPanel();
                    //mostramos un joptionpane para que nos diga si de verdad quiere eleminar la ciudad
                    int opcion = JOptionPane.showConfirmDialog(panel, "¿Estas seguro de que quieres eliminar esta ciudad?", "Borrar", JOptionPane.YES_NO_OPTION);

                    if (opcion == JOptionPane.YES_OPTION) {
                        daoCiudades.borrar(new Ciudades("", "", "", id, 0));
                    }

                    generarTabla();
                }catch (ArrayIndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(null,"No puedes realizar esa accion");
                }

            }
        });

        //fixme BOTON INSERTAR
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //para que no se nos cree la ciudad en cualquier sitio, le pasamos el codigo del pais en el que estamos
                    //ya que es igual al countryCode de la ciudad
                    String code = ((Pais) comboBoxPais.getSelectedItem()).getCode();

                    //creamos el panel
                    PanelGuardar guardado = new PanelGuardar(code);

                    generarTabla();
                }catch (ArrayIndexOutOfBoundsException ex){
                    JOptionPane.showMessageDialog(null,"No puedes realizar esa accion");
                }

            }
        });


        //COMBO BOX
        comboBoxPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarTabla();
            }
        });

        //hacemos que ningun textpane sea editable
        textPaneID.setEditable(false);
        textPaneNombre.setEditable(false);
        textPaneDistrito.setEditable(false);
        textPanePoblacion.setEditable(false);


        //listener para que cuando pulsamos una fila de la tabla se nos rellenen los campos
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textPaneID.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 0));
                textPaneNombre.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
                textPaneDistrito.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 2));
                textPanePoblacion.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 3));

            }
        });


    }

    /**
     * metodo para generar la tabla
     */
    private void generarTabla() {
        //hacemos un modelo de tabla al cual le pasamos el nombre de las columnas
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID", "Nombre", "Distrito", "Pobalacion"}) {
            //sobreescribimos el metodo que tiene la clase defaulttablemodel
            //para hacer que las celdas no puedan ser modificadas
            @Override
            public boolean isCellEditable(int row, int column) {
                //devolvemos siempre falso
                return false;
            }
        };
        //le asignamos a nuestra tabla el modelo que hemos definido
        tabla.setModel(modelo);
        //para que no se puedan mover las columnas (buscado en internet)
        tabla.getTableHeader().setReorderingAllowed(false);


        //hacemos un array de las ciudades obteniendolas todas
        ArrayList<Ciudades> listaCiudades = new ArrayList<>(daoCiudades.obtenerTodos());

        //Creamos un vector de tipo para poder añadirlo luego al modelo
        Vector<String> fila = new Vector<>();

        //en una variable guardamos el codigo del pais para poder compararlo luego
        String pCode = ((Pais) comboBoxPais.getSelectedItem()).getCode();

        //recorremos todas las ciudades
        for (Ciudades listaCiu : listaCiudades) {
            //si el codigo de la ciudad es igual al codigo del pais

            if (listaCiu.getCountrycode().equals(pCode)) {
                //reseteamos el vector porque si no siempre se guarda la misma ciudad
                fila = new Vector<>();
                //añadimos a cada columna lo que le corresponde
                fila.add(listaCiu.getId());
                fila.add(listaCiu.getNombre());
                fila.add(listaCiu.getDistrito());
                fila.add(String.valueOf(listaCiu.getPoblacion()));
                //añadimos a nuestro modelo de tabla la fila
                modelo.addRow(fila);

            }
        }
    }

    /**
     * Metodo para rellenar el combo box con todos los paises
     */
    public void rellenarComboBoxPais() {
        //lista para coger todos los paises
        ArrayList<Pais> listapais = new ArrayList<>(daoPais.obtenerTodos());

        //ordenamos los paises
        listapais.sort(new Comparator<Pais>() {
            @Override
            public int compare(Pais p1, Pais p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });

        //lo recorremos para mostrarlo
        for (Pais lista : listapais) {
            //añadimos al combo box el nombre del pais
            comboBoxPais.addItem(lista);
        }
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
