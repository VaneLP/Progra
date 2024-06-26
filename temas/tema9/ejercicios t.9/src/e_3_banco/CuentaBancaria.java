package e_3_banco;

public abstract class CuentaBancaria {
    //atributos
    private String iban;
    private double saldo;
    private static final double interesAnualBasico=20;

    //constructor
    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    //getters y setters
    //iban
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    //saldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //interes anual basico
    public static double getInteresAnualBasico(){
        return interesAnualBasico;
    }

    //metodos
    public void consultar(){
        System.out.println("Saldo: "+saldo);
    }

    public  double ingresar(double dinero){
        return this.saldo+dinero;
    }

    public  double retirar(double dinero){
        return this.saldo-dinero;
    }

    public  double traspasar (CuentaBancaria nueva){
        nueva.setSaldo(this.saldo);
        this.saldo=0;
        return nueva.saldo;
    }

    public abstract void calcularIntereses();
}
