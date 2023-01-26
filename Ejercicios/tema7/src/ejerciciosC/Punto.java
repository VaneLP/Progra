package ejerciciosC;
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
}
