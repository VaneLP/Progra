package e_3_banco;

public class CuentaAhorro extends CuentaBancaria{
    //atributo
    private final double saldoMinimo=500;

    //constructor
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    //metodos
    @Override
    public void calcularIntereses() {
        if (getSaldo()< saldoMinimo) {
            double divi = CuentaBancaria.getInteresAnualBasico() / 2;
        }
        else{
            double multi= CuentaBancaria.getInteresAnualBasico()*2;
        }

    }


}
