package Pintando;

import javax.swing.*;
import java.awt.*;

public class Casita extends JFrame {
    //main
    public static void main(String[] args) {
        Casita ventana = new Casita();
    }

    //constructor
    public Casita(){
        setBounds(400,200,400,400);
        setTitle("vanessa lopez");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Lamina());
        setVisible(true);

    }
}

class Lamina extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D)g;

        //Cuadrado (CIELO)
        g2.setColor(Color.CYAN);
        g2.fillRect(0,0,400,400);

        //circulo (SOL)
        g2.setColor(Color.YELLOW);
        g2.fillOval(-40,-40,100,100);

        //rectangulo (SUELO)
        g2.setColor(Color.GREEN);
        g2.fillRect(0,330,400,50);

        //cuadrado (CASA)
        g2.setColor(Color.PINK);
        g2.fillRect(120,150,180,180);

        //rectangulo (PUERTA)
        g2.setColor(new Color(0xA35224));
        g2.fillRect(160,240,40,90);

        //cuadrado ventana
        g2.setColor(Color.WHITE);
        g2.fillRect(230,180,50,50);

        //rectangulo (CHIMENEA)
        g2.setColor(Color.BLACK);
        g2.fillRect(250,50,40,90);

        //triangulo (TEJADO)
        g2.setColor(Color.RED);
        //para hacer un poligono necesitamos un int[] x, un int[] y y los puntos que va a tener
        int[] x = {120,210,300};
        int[] y = {150,50,150};

        g2.fillPolygon(x,y,3);

    }
}