package SegundaParte_9;

import java.util.concurrent.ThreadLocalRandom;

public class MasterMind {
    //Atributos
    private String combinacion;

    //constructor
    public MasterMind(String combinacion){
        if (combinacion.matches("\\d{4}"))
            this.combinacion=combinacion;
    }

    //metodos
    public void generarNumAleatorio(){
        int n1= ThreadLocalRandom.current().nextInt(0,9+1);

        for (int i=1;i<=4;i++){

        }

    }

    public void validar(){

    }



}
