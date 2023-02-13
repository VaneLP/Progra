package e_3_banco;

public class Main {
    public static void main(String[] args) {
        //Crea varias cuentas bancarias de distintos tipos
        CuentaBancaria c1 =new CuentaCorriente("ES6621000418401234567891", 1000);
        CuentaBancaria c2 =new CuentaCorriente("ES6621000418401234567892",0);
        CuentaBancaria c3 =new CuentaAhorro("ES6621000418401234567893", 100);

        //prueba a realizar ingresos
        c1.ingresar(200);
        c3.ingresar(500);

        //retiradas
        c3.retirar(100);

        //transferencias
        c1.traspasar(c2);

        //calcula los intereses

        //muéstralos por pantalla
        c1.consultar();
        c2.consultar();
        c3.consultar();

    }
}
