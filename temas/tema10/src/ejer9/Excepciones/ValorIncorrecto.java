package ejer9.Excepciones;

public class ValorIncorrecto extends Exception{
    //atributo
    private final String nuevo;

    //constructor
    public ValorIncorrecto(String nuevo) {
        this.nuevo = nuevo;
    }

}
