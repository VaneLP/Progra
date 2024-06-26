package ejerciciosC;
/*
Crea un programa con una clase llamada Rectangulo que representará un rectángulo
mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que la clase deberá tener
cuatro atributos enteros: x1, y1, x2, y2
 */
public class Rectangulo {
    //atributos
    private int x1, y1, x2, y2;

    //getters and setters
    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        if(x1<this.x2) {
            this.x1 = x1;
        }
        else
            System.err.println("ERROR al instanciar Rectangulo...");
    }
    //-------------------------------
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        if(y1<this.y2) {
            this.y1 = y1;
        }
        else
            System.err.println("ERROR al instanciar Rectangulo...");
    }
    //-------------------------------
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        if(x2>this.x1) {
            this.x2 = x2;
        }
        else
            System.err.println("ERROR al instanciar Rectangulo...");
    }
    //-------------------------------
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        if(y2>this.y1) {
            this.y2 = y2;
        }
        else
            System.err.println("ERROR al instanciar Rectangulo...");
    }

    //añadir un constructor
    public Rectangulo (int x1, int y1, int x2, int y2){
        /*
        dado un eje de coordenadas donde comenzamos en la esquina inferior izquierda que seria (0,0)
        para que se cumpliera la condicion x1 debera ser menor que x2 e igualmente con y1<y2
        */
        if(x1<x2 && y1<y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        else
            System.err.println("ERROR al instanciar Rectangulo...");

    }
}
