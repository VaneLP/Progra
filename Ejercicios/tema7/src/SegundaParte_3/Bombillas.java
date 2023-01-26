package SegundaParte_3;
/*Se desea representar las bombillas que pueda haber en una casa. Cada bombilla tiene
asociada un interruptor y sólo uno. Así mismo, existe un interruptor general de la casa
que en un principio está apagado. Un interruptor tiene dos estados, ON y OFF. Una
bombilla luce si el interruptor general de la casa está en ON y su interruptor asociado
también.
Escriba una clase de nombre Bombilla que permita modelar la información anterior. Para
ello la clase dispondrá de :
• Un método para cambiar el estado del interruptor de al bombilla.
• Un método para cambiar el estado del interruptor general de la casa.
• Un método que determina si una bombilla esta luciendo o no.
Para probarlo, crea un programa que cree una bombilla y se imprima por pantalla si luce
o no, luego se pulsa el interruptor de la bombilla y vuelve a imprimir es estado de la
misma. Por último se pulsa en interruptor general y se vuelve a imprimir el estado de la
bombilla.*/
public class Bombillas {
    //Atributos
    private boolean interruptor=false;
    private static boolean interruptorGeneral=false;

    //Constructor
    public Bombillas(){
    }

    //Metodos
    public void encenderInterruptor(){
        interruptor=true;
    }

    public void apagarInterruptor(){
        interruptor=false;
    }

    public static void encenderInterruptorGeneral(){
        interruptorGeneral=true;
    }

    public static void apagarInterruptorGeneral(){
        interruptorGeneral=false;
    }

    public boolean luciendo(){
        if(interruptor && interruptorGeneral)
            return true;
        else
            return false;
    }

}
