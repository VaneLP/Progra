package swing.ejer7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class MonitorSistema extends JFrame{
    //atributos
    private JProgressBar progressBarRAM;
    private JPanel panelPrincipal;
    private JProgressBar progressBarProcesador;
    private JButton botonActualiza;
    private JLabel labelRam;
    private JLabel labelProcesador;

    //constructor
    public MonitorSistema(String cadena){
        super(cadena);
        setBounds(100,100,500,600);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //objeto para obtener info del sistema
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        //con osBean.getSystemCpuLoad() obtenemos la carga del procesador despues de invocarlo
        botonActualiza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //FIXME pregunar al profe porque no funciona, no hay opcion de getSystemCpuLoad()!!!
                progressBarRAM.setValue(50);
                progressBarProcesador.setValue(50);

                labelRam.setText(String.valueOf(progressBarRAM.getValue()));
                labelProcesador.setText(String.valueOf(progressBarProcesador.getValue()));
            }
        });
    }

    //----MAIN----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MonitorSistema ventana = new MonitorSistema("Monitor del sistema");
            }
        });
    }
}
