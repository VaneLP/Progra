package SegundaParte_7;

public class main {
    public static void main(String[] args) {
        Movil m1=new Movil("1234567890123",30,2,4,2);
        Movil m2=new Movil("0123456701234",0,5,2,3);

//        Movil.setCosteMinutoLlamada(2);
//        Movil.setCosteConsumoMB(3);
//        Movil.setCosteEstablecerLlamada(2);

        //llamadas
        m1.efectuarLlamada(120);
        System.out.println(m1.consultarSaldo());
        System.out.println("---------------------");

        //navegar
        m1.navegar(8);
        System.out.println(m1.consultarSaldo());
        System.out.println("---------------------");

        //recarga
        m2.recargar(10);
        System.out.println(m2.consultarSaldo());
        System.out.println("---------------------");

    }
}
