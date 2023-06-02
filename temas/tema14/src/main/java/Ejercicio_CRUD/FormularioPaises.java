package Ejercicio_CRUD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class FormularioPaises extends JFrame{
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
    public FormularioPaises(String cadena){
        //para pasarle el titulo en el main
        super(cadena);
        setContentPane(panelPrincipal);
        //para que se cierre cuando le damos a la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para que se ajuste solo
        pack();


        //hacemos un modelo de tabla al cual le pasamos el nombre de las columnas
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID","Nombre","Distrito","Pobalacion"});
        //le asignamos a nuestra tabla el modelo que hemos definido
        tabla.setModel(modelo);
        //para que no se puedan mover las columnas (buscado en internet)
        tabla.getTableHeader().setReorderingAllowed(false);



        //llamamos a la funcion para llenar el comboBox
        rellenarComboBoxPais();



        //hacemos la ventana visible
        setVisible(true);

        //BOTON ACTUALIZAR
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //UPDATE city SET name=?, district=?, population=? WHERE id=?
//                daoCiudades.actualizar();
            }
        });

        //BOTON BORRAR
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //DELETE FROM city WHERE id=?
//                daoCiudades.borrar();
            }
        });

        //BOTON INSERTAR
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //INSERT INTO city(name, district, population) VALUES(?,?,?)
//                daoCiudades.guardar();
            }
        });


        //COMBO BOX
        comboBoxPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //*-*-*-*-* ¡¡¡PRUEBAAAAS!!! *-*-*-*-*
                ArrayList<Ciudades> listaCiudades = new ArrayList<>(daoCiudades.obtenerTodos());

                //Creamos un vector de tipo para poder añadirlo luego al modelo
                Vector<String> fila = new Vector<>();
                String pCode = ((Pais) comboBoxPais.getSelectedItem()).getCode();

                    for (Ciudades listaCiu : listaCiudades) {
                        if(listaCiu.getCountrycode().equals(pCode)) {
                            fila.add(listaCiu.getId());
                            fila.add(listaCiu.getNombre());
                            fila.add(listaCiu.getDistrito());
                            fila.add(String.valueOf(listaCiu.getPoblacion()));
                        }

                        modelo.addRow(fila);
                    }





            }
        });
    }

    /**
     * Metodo para rellenar el combo box con todos los paises
     */
    public void rellenarComboBoxPais(){
        //lista para coger todos los paises
        ArrayList<Pais> listapais = new ArrayList<>(daoPais.obtenerTodos());

        //lo recorremos para mostrarlo
        for (Pais lista : listapais) {
            //añadimos al combo box el nombre del pais
            comboBoxPais.addItem(lista);
        }
    }


    public void rellenarTabla(){

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
