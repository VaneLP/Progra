package swing.casoPractico;

import javax.swing.*;
import java.awt.*;

public class BurgerMenuApp extends JFrame{
    //Atributos
    private JPanel panelPrincipal;
    private JRadioButton repartirADomicilioRadioButton;
    private JRadioButton recogidaEnLocal20RadioButton;
    private JButton calcularButton;
    private JTextField textFieldPrecio;
    private JTextField textFieldIva;
    private JTextField textFieldPVP;
    private JRadioButton polloRadioButton;
    private JSpinner spinnerKetchup;
    private JSpinner spinnerBarbacoa;
    private JSpinner spinnerMostaza;
    private JSpinner spinnerThai;
    private JCheckBox hamburguesaDobleCheckBox;
    private JCheckBox extraQuesoCheckBox;
    private JCheckBox extraPatatasCheckBox;
    private JRadioButton veganaRadioButton;
    private JRadioButton terneraRadioButton;
    private JRadioButton cerdoRadioButton;
    private JRadioButton normalRadioButton;
    private JRadioButton integralRadioButton;
    private JRadioButton centenoRadioButton;
    private JRadioButton fritasRadioButton;
    private JRadioButton gajoRadioButton;
    private JRadioButton caserasRadioButton;
    private JRadioButton colaRadioButton;
    private JRadioButton cervezaRadioButton;
    private JRadioButton aguaRadioButton;
    private JRadioButton limonRadioButton;
    private JRadioButton naranjaRadioButton;

    //constructor
    public BurgerMenuApp (String cadena){
        super(cadena);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);
        pack();
        setVisible(true);

    }

    //----MAIN----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BurgerMenuApp ventana = new BurgerMenuApp("Burger Menu APP");
            }
        });
    }
}
