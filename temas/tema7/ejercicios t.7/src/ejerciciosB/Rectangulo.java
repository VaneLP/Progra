package ejerciciosB;
/*
Crea un programa con una clase llamada Rectangulo que representará un rectángulo
mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que la clase deberá tener
cuatro atributos enteros: x1, y1, x2, y2
 */
public class Rectangulo {
    //atributos
    int x1, y1, x2, y2;

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
