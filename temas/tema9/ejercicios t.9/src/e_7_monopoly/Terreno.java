package e_7_monopoly;

public class Terreno extends Propiedad{
    //atributos
    private static ColorTerreno colorTerreno;
    private static int precioAlquiler;

    public Terreno(String nombre, int precio, int hipoteca,ColorTerreno colorTerreno,int precioAlquiler) {
        super(nombre,precio,hipoteca);
        this.colorTerreno=colorTerreno;
        this.precioAlquiler= precioAlquiler;
    }

    public static ColorTerreno getColorTerreno() {
        return colorTerreno;
    }

    public static void setColorTerreno(ColorTerreno colorTerreno) {
        Terreno.colorTerreno = colorTerreno;
    }

    public static int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public static void setPrecioAlquiler(int precioAlquiler) {
        Terreno.precioAlquiler = precioAlquiler;
    }

    @Override
    public int getAlquiler(int modificacion) {
        int suplemento = precioAlquiler*modificacion;
        precioAlquiler= precioAlquiler+suplemento;
        if(modificacion > 4)
            return precioAlquiler*10;
        else
            return precioAlquiler;
    }
}
