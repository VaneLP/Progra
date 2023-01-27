package ArrayList;

public class LineaFactura {
    //atributos
    private final String descripcionProducto;
    private final int cantidadUnidades,porcentajeDescuento;
    private final double precioUnitario, importeTotal;

    //constuctor
    public LineaFactura(String descripcionProducto, double precioUnitario, int cantidadUnidades) {
        this.descripcionProducto = descripcionProducto;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
        this.porcentajeDescuento=(cantidadUnidades>10)?5:0;
        this.importeTotal = cantidadUnidades*precioUnitario-(cantidadUnidades*precioUnitario*porcentajeDescuento/100);
    }

    //getter
    public double getImporteTotal(){
        return importeTotal;
    }

    //metodos
    @Override
    public String toString() {
        return String.format("%-40s %.2f %3d %1d %.2f", descripcionProducto, precioUnitario,cantidadUnidades,porcentajeDescuento,importeTotal);
//        return "LineaFactura" +
//                "descripcionProducto='" + descripcionProducto + '\'' +
//                ", precioUnitario=" + precioUnitario +
//                ", cantidadUnidades=" + cantidadUnidades +
//                ", importeTotal=" + importeTotal +
//                ", porcentajeDescuento=" + porcentajeDescuento;
    }

}
