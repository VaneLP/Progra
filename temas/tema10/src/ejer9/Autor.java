package ejer9;

public record Autor(String nombre, String psudonimo) {
    //el record es equivalente a lo de abajo, pero en registro

    /*
    //atributos
    private final String nombre;
    private final String psudonimo;

    //constructor
    public Autor(String nombre, String psudonimo) {
        this.nombre = nombre;
        this.psudonimo = psudonimo;
    }

    //getters
    //nombre
    public String getNombre() {
        return nombre;
    }

   //psudonimo
    public String getPsudonimo() {
        return psudonimo;
    }
    */

}
