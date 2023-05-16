package swing.ejer7;

import javax.swing.*;
import java.awt.*;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class MonitorSistema extends JFrame {
    //atributos
    private JProgressBar progressBarRAM;
    private JPanel panelPrincipal;
    private JProgressBar progressBarProcesador;
    private JButton button1;
    private JButton button2;

    //constructor
    public MonitorSistema(String cadena){
        super(cadena);
        setBounds(100,100,500,600);
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //objeto para obtener info del sistema
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        //con Bean.getSystemCpuLoad() obtenemos la carga del procesador despues de invocarlo
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
