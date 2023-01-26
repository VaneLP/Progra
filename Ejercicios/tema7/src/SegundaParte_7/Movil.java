package SegundaParte_7;

public class Movil {
    //atributos
    private final String numeroMovil;
    private float costeEstablecerLlamada, costeMinutoLlamada, costeConsumoMB;
    private float saldo;

    //constructor
    public Movil(String numeroMovil, float saldo, float costeEstablecerLlamada, float costeMinutoLlamada, float costeConsumoMB){
        if (numeroMovil.matches("\\d[0-9]{13}") && saldo<0) {
            this.numeroMovil = numeroMovil;
            this.saldo = saldo;
            this.costeEstablecerLlamada=costeEstablecerLlamada;
            this.costeMinutoLlamada=costeMinutoLlamada;
            this.costeConsumoMB=costeConsumoMB;
        }
        else {
            this.numeroMovil = null;
            this.saldo = 0;
            this.costeEstablecerLlamada = 0;
            this.costeMinutoLlamada = 0;
            this.costeConsumoMB = 0;
        }
    }

    //setters y getters
    //establecer llamadas
    public float getCosteEstablecerLlamada() {
        return costeEstablecerLlamada;
    }
    public void setCosteEstablecerLlamada(float costeEstablecerLlamada) {
        this.costeEstablecerLlamada = costeEstablecerLlamada;
    }

    //Coste minuto llamadas
    public float getCosteMinutoLlamada() {
        return costeMinutoLlamada;
    }
    public void setCosteMinutoLlamada(float costeMinutoLlamada) {
        this.costeMinutoLlamada = costeMinutoLlamada;
    }

    //consumo MB
    public float getCosteConsumoMB() {
        return costeConsumoMB;
    }
    public void setCosteConsumoMB(float costeConsumoMB) {
        this.costeConsumoMB = costeConsumoMB;
    }

    //metdos
    public void efectuarLlamada (int segundos){
        int min=segundos/60;

        this.saldo = saldo-(costeMinutoLlamada*min)+costeEstablecerLlamada;

        if (saldo<0)
            saldo=0;
    }

    public void navegar (int mb){
        this.saldo = saldo-(costeConsumoMB*mb);

        if (saldo<0)
            saldo=0;
    }

    public boolean recargar (int importe){
        if (importe%5==0) {
                this.saldo = saldo + importe;
                return true;
        }
        else
            return false;
    }

    public float consultarSaldo(){
        return this.saldo;
    }

}
