public class lvl3_ejer14 {
    /*
    14. Realiza un programa que muestre los números del 860 al 460 contando de 10 en 10
hacia atrás. Muestralo 3 veces, con el bucle while, con el bucle do-while y con el bucle
for.
     */

    public static void main(String[] args) {

        int num= 860;

        while (num >=460){
            System.out.println(num);
            num=num-10;
        }
        num = 860;
        System.out.println("------");

        //-----------------------

        do{
            System.out.println(num);
            num=num-10;
        }
        while (num >=460);
        System.out.println("------");

        //------------------------

        for (num=860;num>=460;num=num-10){
            System.out.println(num);
        }
    }
}
