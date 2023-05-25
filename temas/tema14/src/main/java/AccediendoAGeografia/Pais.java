package AccediendoAGeografia;

/*
codigo - Code String 3 letras
nombre - Name String
continente - Continenet String
superficie - SurfaceArea double
poblacion - Population int
*/
public class Pais {
    //atributos
    String codigo, nombre, continente;
    double superficie;
    int population;

    //constructor
    public Pais(String codigo, String nombre, String continente, double superficie, int population) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.continente = continente;
        this.superficie = superficie;
        this.population = population;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //hacemos el toString de Pais para poder ver luego los paises
    @Override
    public String toString() {
        return "Pais {" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", superficie=" + superficie +
                ", population=" + population +
                '}';
    }
}
