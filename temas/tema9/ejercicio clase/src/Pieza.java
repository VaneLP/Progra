import java.awt.*;

public abstract class Pieza implements JuegoTablero{
    //atributos
    private Color color;
    private Point posicion;
    private boolean comida;

    /*constructor 1 recibirá los valores del color, de la posición X y de la Y. Asignará los valores a
    los atributos correspondientes y comprobará que los valores de las posiciones son correctos.
    Si lo son pondrá comida a falso, si no son correctos pondrá comida a verdadero.*/
    public Pieza(Color color, Point posicion) {
        this.color = color;
        if (comprobarPosicion(getPosicion().x) && comprobarPosicion(getPosicion().y)){
            this.comida=false;
        }
        else
            this.comida=true;
    }

    /*constructor 2, que deberá usar el primero, no recibirá ningún parámetro y creará una nueva
    Pieza en la posición 10, 10 y de color BLANCO.*/
    public Pieza(){
        mover(10,10);
        this.color = Color.BLANCO;
    }

    /*contructor 3, que usará el primero, recibe como parámetro una Pieza, y copiará sus atributos a la
    nueva Pieza*/
    public Pieza (Pieza p){

        this.color=color;
        this.posicion= posicion;
        this.comida= comida;
    }

    //getters y setters
    //color
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    //posicion
    public Point getPosicion() {
        return posicion;
    }
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    //comida
    public boolean isComida() {
        return comida;
    }
    public void setComida(boolean comida) {
        this.comida = comida;
    }

    //metodos
    public void equals(Pieza p){
        this.posicion = p.posicion;
        this.color=p.color;
    }

    public static boolean comprobarPosicion(int p){
        if(p>0 && p<=7)
            return true;
        else
            return false;
    }

    public abstract void mover(int x, int y);

    //motodos interfaz
    @Override
    public char indiceAPosicion(int indice) {
        String cadena="abcdefgh";
        return cadena.charAt(indice);
    }

    @Override
    public int indiceAPosicionN(int indice) {
        return indice+1;
    }

    @Override
    public int posicionAIndice(char posicion) {
        if(String.valueOf(posicion).matches("[a-h]"))
            return "abcdefgh".indexOf(posicion);
        else
            return -1;
    }

    @Override
    public int posicionAIndice(int posicion) {
        if (posicion>=1 && posicion<=8)
            return posicion-1;
        else
            return -1;
    }

}
