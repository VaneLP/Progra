package e_3_banco;

public class CuentaCorriente extends CuentaBancaria{
    //constructor
    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    //metodos
    @Override
    public void calcularIntereses() {
        double suma= getSaldo()+CuentaBancaria.getInteresAnualBasico();
    }

}
