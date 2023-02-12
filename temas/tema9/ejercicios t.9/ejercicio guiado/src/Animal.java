public abstract class Animal {
    //atributos
    private final String nombre;
    private int numEstancia;

    //constructor

    public Animal(String nombre, int numEstancia) {
        this.nombre = nombre;
        this.numEstancia = numEstancia;
    }

    //setters y getters
    //nombre
    public String getNombre() {
        return nombre;
    }

    //estancia
    public int getNumEstancia() {
        return numEstancia;
    }
    public void setNumEstancia(int numEstancia) {
        this.numEstancia = numEstancia;
    }

    //metodos
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;
        return this.nombre.equals(((Animal)obj).nombre);
    }

    public abstract void ejercicio();

}
