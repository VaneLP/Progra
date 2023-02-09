package ejerciciosE;

import java.util.concurrent.ThreadLocalRandom;

/*
Crea un programa con una clase llamada Punto que representará un punto de dos
dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y
(coordenadas).
 */
public class Punto {
    private int x, y;

    /*
    Añade un constructor con parámetros que copie las coordenadas
    pasadas como argumento a los atributos del objeto
     */
    public Punto (int x, int y){
        this.x=x;
        this.y=y;
    }

    //generamos getters y setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //añadir metodos
    public void imprime(){
        System.out.println("(" + this.x+ ", " + this.y + ")");
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }

    public void desplaza (int dx, int dy){
        this.x=this.x+dx;
        this.y=this.y+dy;
        //tambien podriamos usar setX(getX()+dx)
    }

    public int distancia (Punto p){
        double d;
        d= Math.sqrt(Math.pow((p.getX() - this.x),2) + Math.pow((p.getY() -  this.y),2));
        return (int) d;
    }

    public static Punto crePuntoAleatorio(){
       int azarX= ThreadLocalRandom.current().nextInt(-100,100+1);
       int azarY= ThreadLocalRandom.current().nextInt(-100,100+1);
       return new Punto(azarX,azarY);
    }
}
