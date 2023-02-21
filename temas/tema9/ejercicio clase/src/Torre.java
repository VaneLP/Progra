import java.awt.*;

public class Torre extends Pieza implements JuegoTablero{
    //constructor

    public Torre(Color color, Point posicion) {
        super(color, posicion);
    }

    //metodos
    @Override
    public void mover(int x, int y) {
        if(x>0 && x<=7 || y>0 && y<=7){
            mover(x,y);
        }
    }

//    @Override
//    public int filas() {
//        return 0;
//    }
//
//    @Override
//    public char columnas() {
//        return 0;
//    }
//
//    @Override
//    public char indiceAPosicion(int indice) {
//        return 0;
//    }
//
//    @Override
//    public int indiceAPosicionN(int indice) {
//        return 0;
//    }
//
//    @Override
//    public int posicionAIndice(char posicion) {
//        return 0;
//    }
//
//    @Override
//    public int posicionAIndice(int posicion) {
//        return 0;
//    }
}
