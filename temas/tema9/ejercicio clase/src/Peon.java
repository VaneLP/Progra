import java.awt.*;

public class Peon extends Pieza{
    //constructor
    public Peon(Color color, Point posicion) {
        super(color, posicion);
    }

    //metodos
    @Override
    public void mover(int x, int y) {
        if(x>0 && x<=7 || y>0 && y<=7){
            mover(x,y);
        }
    }

}
