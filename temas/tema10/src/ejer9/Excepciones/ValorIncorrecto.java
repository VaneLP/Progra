package ejer9.Excepciones;

public class ValorIncorrecto extends Exception{
    //atributo
    private int nuevo;

    //constructor
    public ValorIncorrecto(int nuevo) {
        this.nuevo = nuevo;
    }

}
