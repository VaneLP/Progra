package ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    //atributos
    private int importeTotal=0;
    private final String fecha,numIdentificador,numCliente;
    private static final int iva=21;
    private ArrayList<LineaFactura> lineas;

    //constructor
    public Factura(String numIdentificador, String numCliente) {
        this.numIdentificador = numIdentificador;
        this.numCliente = numCliente;
        this.fecha= LocalDate.now().toString();
        this.lineas= new ArrayList<>();
    }

    //metodos
    public void anyadirLinea(LineaFactura linea){
        this.lineas.add(linea);
        this. importeTotal+=linea.getImporteTotal();
    }

    public void anyadirLinea(String desc, double precioU, int cantidad){
        anyadirLinea(new LineaFactura(desc,precioU,cantidad));
    }

    public void eliminarLinea(LineaFactura linea){
        this.lineas.remove(linea);
        this. importeTotal-=linea.getImporteTotal();
    }

    public boolean eliminarLinea(int numeroLinea){
        if(numeroLinea>0 && numeroLinea<=lineas.size()) {
            LineaFactura linea = lineas.get(numeroLinea - 1);
            eliminarLinea(linea);
            return true;
        }
        return false;
    }

    public void mostrar(){
        System.out.printf("Factura" +
                "%n-----------------------------"+
                "%nNumIdentificador: " + this.numIdentificador +
                "%nNumCliente: " + this.numCliente +
                "%nImporteTotal: " + this.importeTotal +
                "%nFecha: " + this.fecha);

        for (LineaFactura linea:lineas){
            System.out.println("lineas: "+ lineas);
        }
    }

}
