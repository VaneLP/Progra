package SegundaParte_1;
/*Crea una clase Triangulo. Sus atributos son los 3 puntos de sus vértices
Crea un constructor al que se le pasan los tres vértices (recuerda que son Puntos)
Crea un método que devuelva la longitud del perímetro del triángulo.*/
public class Triangulo {
    //atributos
    //creamos los vertices como un Punto ya que necesitamos X e Y, y esta clase nos los proporciona
    private Punto vertice1,vertice2,vertice3;

    //constructor
    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3){
        this.vertice1=vertice1;
        this.vertice2=vertice2;
        this.vertice3=vertice3;
    }

    //metodos
    public int perimetro(){
        /*Dentro de la clase punto tenemos el metodo creado de calcular la distancia entre dos puntos que esto
        nos facilita la obtencion del perimetro, ya que calculamos la distancia entre los puntos y los sumamos
        para obtener el perimetro*/
        return vertice1.distancia(vertice2) + vertice2.distancia(vertice3) + vertice3.distancia(vertice1);
    }

}
