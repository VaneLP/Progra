package swing.ejer10;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.*;
import java.util.Scanner;

public class MiniEditorTexto extends JFrame{
    //atributos
    private JTextArea textAreaEscribir;
    private JButton abrirButton;
    private JButton guardarButton;
    private JSlider slidertamaño;
    private JPanel panelPrincipal;

    //JFileChooser hay que escribirlo para elegir un archivo
    //constructor
    public MiniEditorTexto(String cadena){
        super(cadena);
        setBounds(100,100,500,600);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //ABRIR
        abrirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //creamos un nuevo jfilechooser
                JFileChooser elegirArchivo = new JFileChooser();
                //guardamos en una variable el resultado de abrir una venta de seleccion
                int resultado = elegirArchivo.showOpenDialog(null);
                File archivoElegido = new File("");
                //si a seleccionado correctamente la opcion
                if(resultado==JFileChooser.APPROVE_OPTION) {
                    //devuelve el file
                    archivoElegido = elegirArchivo.getSelectedFile().getAbsoluteFile();
                    leer(archivoElegido);
                }

            }
        });

        //GUARDAR
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreArchivo = JOptionPane.showInputDialog("Escribe el nombre del archivo sin el .txt");
                guardarArchivo(nombreArchivo, textAreaEscribir.getText());
            }
        });

        //EXTRA
        slidertamaño.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textAreaEscribir.setFont(new Font(null,Font.PLAIN,slidertamaño.getValue()));
            }
        });
    }

    //----MAIN----
    public static void main(String[] args) {
        MiniEditorTexto ventana= new MiniEditorTexto("Mini editor de texto");

    }

    /**
     * Metodo para guardar usuarios
     * @param nombreArchivo
     * @param txt
     */
    public void guardarArchivo(String nombreArchivo,String txt) {
        //hacemos un fw para escribir un nuevo doc usuarios.txt
        try (FileWriter fw = new FileWriter("temas/tema13/src/swing/ejer10/"+nombreArchivo+".txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {

              bw.write(txt+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Metodo para leer el archivo
     */
    public void leer(File archivo){
        //hacemos textarea vacio
        textAreaEscribir.setText("");
        //leemos el archivo
        try(Scanner lectura= new Scanner(archivo)){

            //mientras que el archivo tenga una siguiente linea
            while (lectura.hasNextLine()){
                //escribimos en el text area el archivo
                textAreaEscribir.append(lectura.nextLine()+"\n");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
