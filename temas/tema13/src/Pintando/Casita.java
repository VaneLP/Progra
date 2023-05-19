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



        //circulo (SOL)
        g2.setColor(Color.YELLOW);
        g2.fillOval(-40,-40,100,100);



    }
}