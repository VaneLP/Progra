package swing.casoPractico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BurgerMenuApp extends JFrame{
    //Atributos
    private JPanel panelPrincipal;
    private JRadioButton repartirDomicilioRadioButton;
    private JRadioButton recogidaLocalRadioButton;
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

        //HAMBURGUESA
        //hacemos un nuevo grupo de botones
        ButtonGroup botonesBurger = new ButtonGroup();
        //añadimos los botones al grupo
        botonesBurger.add(polloRadioButton);
        botonesBurger.add(cerdoRadioButton);
        botonesBurger.add(terneraRadioButton);
        botonesBurger.add(veganaRadioButton);

        //PAN
        //hacemos un nuevo grupo de botones
        ButtonGroup botonesPan = new ButtonGroup();
        //añadimos los botones al grupo
        botonesPan.add(normalRadioButton);
        botonesPan.add(integralRadioButton);
        botonesPan.add(centenoRadioButton);

        //PAPITAS
        //hacemos un nuevo grupo de botones
        ButtonGroup botonesPapitas = new ButtonGroup();
        //añadimos los botones al grupo
        botonesPapitas.add(fritasRadioButton);
        botonesPapitas.add(gajoRadioButton);
        botonesPapitas.add(caserasRadioButton);


        //BEBIDA
        //hacemos un nuevo grupo de botones
        ButtonGroup botonesBebida = new ButtonGroup();
        //añadimos los botones al grupo
        botonesBebida.add(colaRadioButton);
        botonesBebida.add(naranjaRadioButton);
        botonesBebida.add(limonRadioButton);
        botonesBebida.add(aguaRadioButton);
        botonesBebida.add(cervezaRadioButton);

        //RECOGIDA
        //hacemos un nuevo grupo de botones
        ButtonGroup botonesRecogida = new ButtonGroup();
        //añadimos los botones al grupo
        botonesRecogida.add(repartirDomicilioRadioButton);
        botonesRecogida.add(recogidaLocalRadioButton);


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldPrecio.setText(calcularPrecio()+"");
                textFieldIva.setText(iva()+"");
                textFieldPVP.setText(pvp()+"");
            }
        });


    }
    public double calcularPrecio(){
        double precio=8;
        if(terneraRadioButton.isSelected() || veganaRadioButton.isSelected())
            precio+=1;
        if(caserasRadioButton.isSelected())
            precio+=1;
        if(hamburguesaDobleCheckBox.isSelected())
            precio+=2;
        if(extraQuesoCheckBox.isSelected())
            precio+=0.5;
        if(extraPatatasCheckBox.isSelected())
            precio+=1;

        int salsitas = (int) spinnerKetchup.getValue();
        salsitas+=(int) spinnerBarbacoa.getValue();
        salsitas+=(int)spinnerMostaza.getValue();
        salsitas+=(int)spinnerThai.getValue();

        precio+=salsitas*0.5;

        if(recogidaLocalRadioButton.isSelected())
            precio-=0.2*precio;

        return precio;
    }

    public double iva(){
        return calcularPrecio()*0.21;
    }

    public double pvp(){
        return calcularPrecio()+iva();
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
