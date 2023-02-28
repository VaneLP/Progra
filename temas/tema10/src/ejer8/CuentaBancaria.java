package ejer8;

import java.util.ArrayList;

public class CuentaBancaria {
    //atributos
    private final String iban, titular;
    private int saldo = 0;
    private ArrayList<Integer> movimientos = new ArrayList<>();

    //constructor
    public CuentaBancaria(String iban, String titular) {
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
    public void ingreso(int dinero) throws AvisarHaciendaExcepcion, CuentaExcepcion {
        if (dinero<=0)
            throw new CuentaExcepcion("ERROR NO ES POSIBLE REALIZAR ESA ACCION");
        else
            saldo = saldo + dinero;

        if (dinero > 3000) {
            movimientos.add(dinero);
            throw new AvisarHaciendaExcepcion("AVISO: NOTIFICAR A HACIENDA");
        }

        movimientos.add(dinero);
    }

    public void retiradas(int dinero) throws AvisarHaciendaExcepcion, CuentaExcepcion {

        if (saldo >= -50 && saldo < 0) {
            throw new CuentaExcepcion("AVISO: SALDO NEGATIVO");
        }

        if (saldo < -50) {
            throw new CuentaExcepcion("ERROR NO ES POSIBLE REALIZAR ESA ACCION");
        }

        if (dinero > 3000) {
            movimientos.add(-dinero);
            throw new AvisarHaciendaExcepcion("AVISO: NOTIFICAR A HACIENDA");
        }

        saldo = saldo - dinero;
        movimientos.add(-dinero);

    }

    public void mostrar() {
        System.out.println(movimientos);
    }

}
