package SegundaParte_3;

public class main {
    public static void main(String[] args) {
        Bombillas b1=new Bombillas();
        Bombillas b2=new Bombillas();

        //bombilla con interruptor y interruptor general APAGADOS
        System.out.println("b1,b2=APAGADO/APAGADO");
        System.out.println("b1= "+ b1.luciendo());
        System.out.println("b2= "+b2.luciendo());
        System.out.println("--------------------------");

        //bombilla con interruptor APAGADO y interruptor general ENCENDIDO
        Bombillas.encenderInterruptorGeneral();
        b2.encenderInterruptor();
        System.out.println("b1=APAGADO/b2=ENCENDIDO/ENCENDIDO");
        System.out.println("b1= "+b1.luciendo());
        System.out.println("b2= "+b2.luciendo());
        System.out.println("--------------------------");

        //bombilla con interruptor ENCENDIDO y interruptor general ENCENDIDO
        b1.encenderInterruptor();
        System.out.println("b1=ENCENDIDO/b2=ENCENDIDO/ENCENDIDO");
        System.out.println("b1= "+b1.luciendo());
        System.out.println("b2= "+b2.luciendo());
        System.out.println("--------------------------");

        //bombilla con interruptor APAGADO y interruptor general ENCENDIDO
        b1.apagarInterruptor();
        System.out.println("b1=APAGADO/b2=ENCENDIDO/ENCENDIDO");
        System.out.println("b1= "+b1.luciendo());
        System.out.println("b2= "+b2.luciendo());
        System.out.println("--------------------------");

        //bombilla con interruptor y interruptor general APAGADOS
        Bombillas.apagarInterruptorGeneral();
        System.out.println("b1=APAGADO/b2=ENCENDIDO/APAGADO");
        System.out.println("b1= "+b1.luciendo());
        System.out.println("b2= "+b2.luciendo());
    }
}
