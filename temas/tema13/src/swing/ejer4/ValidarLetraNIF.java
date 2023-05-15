package swing.ejer4;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class ValidarLetraNIF extends JFrame{
    //atributos
    private JPanel panelPrincipal;
    private JFormattedTextField formattedTextFieldNIF;
    private JButton validarButton;
    private JLabel letra;

    //constructor
    public ValidarLetraNIF(String cadena){
        super(cadena);
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);
        setVisible(true);


        try {
            //BUSCADO EN INTERNET
            //con el maskformatter hacemos un matches donde le inficamos con # la cantidad de numero que vamos
            //a introducir {8} y con la U mayuscula le indicamos que tiene que indicar una letra mayuscula
            MaskFormatter formato = new MaskFormatter("########U");
            //esto aplicara automaticamente el formato definido anteriormente
            formattedTextFieldNIF.setFormatterFactory(new DefaultFormatterFactory(formato));

        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }


        validarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //guardamos el numero del nif en una variable
                int numeroNIF = Integer.parseInt(formattedTextFieldNIF.getText().substring(0,8));

                //comprobamos atraves del metodo que hemos realizado si la letra es igual
                //pues el nif es correcto o no
                if(validarNIF(numeroNIF) == formattedTextFieldNIF.getText().charAt(8))
                    letra.setText("V");
                else
                    letra.setText("F");

            }
        });
    }

    //metodo para comprobar el nif
    public Character validarNIF(int num){
        //sacamos el resto del numero del nif / 23
        int resto=num%23;

        //cadena con las letras
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";

        //devoolvemos la letra
        return letras.charAt(resto);
    }

    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    ValidarLetraNIF ventana=new ValidarLetraNIF("Validar NIF");

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
