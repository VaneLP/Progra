package e_3_banco;

public class CuentaAhorro extends CuentaBancaria{
    //atributo
    private final double saldoMinimo=0;

    //constructor
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    //metodos
    @Override
    public void calcularIntereses() {

    }


}
