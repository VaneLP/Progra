package examen_2Oportunidad;

public class Electrodomestico extends Producto {
    //atributos
    private Consumos consumoEnergetico;

    //constructor
    public Electrodomestico(String nombre, double precio, Consumos consumoEnergetico) throws Exception {
        super(nombre, precio);
        this.consumoEnergetico = consumoEnergetico;
    }

    //metodo heredado
    @Override
    public double calcularDescuento() {
        //si el consumo energetico es A o B descuento 20%
        if(Consumos.A.equals(consumoEnergetico) || Consumos.B.equals(consumoEnergetico)){
            return getPrecio()*0.2;
        }
        //si es otro descuento 10%
        else
            return  getPrecio()*0.1;

    }

    @Override
    public String toString() {

        return "Electrodomestico{" +
                "consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}
