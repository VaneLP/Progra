package SegundaParte_8;

public class CuentaBancaria {
    //atributos
    private final String iban,  titular;
    private int saldo=0;

    //constructor
    public CuentaBancaria (String iban, String titular){
            this.iban = iban;
            this.titular = titular;
    }

    //setter y getters
    //IBAN
    public String getIban() {
        return iban;
    }

    //titular
    public String getTitular() {
        return titular;
    }

    //saldo
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //metodos
    public int ingreso (int dinero){
            saldo=saldo+dinero;

        if (dinero>3000) {
            System.out.println("AVISO: Notificar a hacienda");
            return saldo;
        }

            return saldo;
    }

    public int retiradas (int dinero){

            saldo = saldo - dinero;

        if (saldo >= -50 && saldo<0){
            System.out.println("AVISO: Saldo negativo");
            return saldo;
        }

        if (saldo < -50){
            System.err.println("ERROR no es posible realizar esa accion");
        }

        if (dinero>3000) {
                System.out.println("AVISO: Notificar a hacienda");
                return saldo;
            }

            return saldo;
    }

}
