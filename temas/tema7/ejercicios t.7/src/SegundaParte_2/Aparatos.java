package SegundaParte_2;
/*Escriba un programa para representar el consumo de energía de una instalación
eléctrica. Para ello, se dispondrá de una clase que representa los aparatos conectados en
la instalación. Cada aparato tiene un consumo eléctrico determinado. Al encender un
aparato el consumo eléctrico se incrementa en la potencia de dicho aparato. Al apagarlo,
se decrementa el consumo. Inicialmente los aparatos están todos apagados.
Hacer un programa que declare tres aparatos electricos, una bombilla de 100 watios, un
radiador de 2000 watios y una plancha de 1200 watios. El programa imprimirá el
consumo nada más crear los objetos. Posteriormente, se enciende la bombilla y la
plancha, y el programa imprime el consumo. Luego se apaga la plancha y se enciende el
radiador y se vuelve imprimir el consumo.*/
public class Aparatos {
    //atributos
    private String nombre;
    private boolean encendido=false;
    private int watios;
    private static int consumoTotal=0;

    //constructor
    public Aparatos(String nombre, int watios){
        this.nombre=nombre;
        this.watios=watios;
    }

    //metodo
    public static void imprimeConsumoTotal(){
        System.out.println("EL consumo es de: "+consumoTotal);
    }

    public void encender(){
        if (!this.encendido) {
            encendido = true;
            consumoTotal = consumoTotal + watios;
        }
    }

    public void apagar(){
        if (this.encendido) {
            encendido = false;
            consumoTotal = consumoTotal - watios;
        }
    }

//    public void encenderAndApagar(){
//        if(encendido)
//            encendido=false;
//            consumoTotal=consumoTotal-watios;
//        else
//            encendido=true;
//            consumoTotal=consumoTotal+watios;
//    }

}
