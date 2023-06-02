package Ejercicio_CRUD;

import javax.swing.*;
import java.awt.event.*;

public class PanelActualizar extends JDialog {
    //atributos
    //hacemos un nuevo dao de ciudades
    private DAO<Ciudades> ciuDao= new CiudadesDao();

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextArea textAreaNombre;
    private JTextArea textAreaDistrito;
    private JTextArea textAreaPoblacion;
    private String countryCode,id;

    public PanelActualizar(String countryCode, String id) {
        this.countryCode=countryCode;
        this.id=id;

        setTitle("Actualizar");
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void onOK() {
        try {
            if(Long.parseLong(textAreaPoblacion.getText())<0){
                JOptionPane.showMessageDialog(null,"Formato de insercion de campos erroneo." +
                        "Los valores no pueden ser negativos");
            }
            else if (!textAreaNombre.getText().matches("[A-Za-z]+") || !textAreaDistrito.getText().matches("[A-Za-z]+")) {
                JOptionPane.showMessageDialog(null,"Formato de insercion de campos erroneo." +
                        "Tienes que rellenar correctamente los campos de nombre y distrito");
            }else {
                //guardsamos la nueva ciudad
                ciuDao.actualizar(new Ciudades(countryCode, textAreaNombre.getText(), textAreaDistrito.getText(), id, Long.parseLong(textAreaPoblacion.getText())));
                // add your code here
                dispose();
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato de insercion de campos erroneo");
        }

    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

}
