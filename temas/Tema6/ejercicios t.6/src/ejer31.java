import java.util.Scanner;

public class ejer31 {
    /*
31.Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes y devuelva los días
que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar un programa al que se le introduzca
una fecha y nos informe de los días pasados desde el 1 de enero de ese año
     */

    //-----------FUNCION 1---------------

    /**
     * Funcion que nos dice si un año es bisiesto o no
     * @param anoFun
     * @return un verdadero o falso, dependiendo de si es verdadero o falso
     */
    public static boolean anoBisiesto (int anoFun){
        return anoFun%400 == 0 || (anoFun%4 == 0 && !(anoFun%100 == 0));
    }

    //-----------FUNCION 2---------------

    /**
     * Funcion para decir cuandos dias tiene un mes
     * @param anoFun
     * @param mesFun
     * @return los dias que tiene ese mes
     */
    public static int calcularDiasMes (int anoFun, int mesFun){

        //para comprobar los dias que tiene un mes
        switch (mesFun){
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;

                case 4, 6, 9, 11:
                    return 30;

                case 2:
                    //llamamos a la funcion de año bisiesto para comprobar si lo es
                    if (anoBisiesto(anoFun))
                        return 29;
                    else
                        return 28;

                default:
                    return 0;
        }
    }

    //-----------FUNCION 3---------------

    /**
     * Funcion para comprobar los dias que han pasdo desde el uno de enero del año introducido hasta el dia del mes introducido
     * @param diasFun
     * @param mesFun
     * @param anoFun
     * @return los dias transcurridos hasta ese mes
     */
    public static int diasPasados (int diasFun, int mesFun, int anoFun){
        //declaramos una variable para guardar el año bisiesto y lo comprobamos
        int mesF;
        if (anoBisiesto(anoFun))
            mesF= 29;
        else
            mesF= 28;

        //decir los dias pasados desde el 1 de enero
        switch (mesFun){
            case 1:
                return diasFun;
            case 2:
                return 31 + diasFun;
            case 3:
                return 31 + mesF + diasFun ;
            case 4:
                return 31 + mesF + 31 + diasFun ;
            case 5:
                return 31 + mesF + 31 + 30 + diasFun ;
            case 6:
                return 31 + mesF + 31 + 30 + 31 + diasFun ;
            case 7:
                return 31 + mesF + 31 + 30 + 31 + 30 + diasFun ;
            case 8:
                return 31 + mesF + 31 + 30 + 31 + 30 + 31 + diasFun ;
            case 9:
                return 31 + mesF + 31 + 30 + 31 + 30 + 31 + 31 + diasFun ;
            case 10:
                return 31 + mesF + 31 + 30 + 31 + 30 + 31 + 31 + 30 + diasFun ;
            case 11:
                return 31 + mesF + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + diasFun ;
            case 12:
                return 31 + mesF + 31 + 30 + 31 + 30 +  31 + 31 + 30 + 31 + 30 + diasFun ;
            default:
                return 0;
        }
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //introducir fecha
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el año: ");
        int ano = entrada.nextInt();
        System.out.print("Introduce el dia: ");
        int dia = entrada.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = entrada.nextInt();

        //comprobamos que el mes sea correcto
        while(mes<1 || mes>12) {
            System.out.print("Mes no valido. Introduce otro: ");
            mes = entrada.nextInt();
        }

        System.out.println("El mes introducido '"+mes+"' tiene " + calcularDiasMes(ano, mes) +" dias");

        //indique dias pasados desde el 1 de enero de ese año
        System.out.println("Los dias transcurridos desde el 1 de Enero del "+ ano +" son: "+diasPasados(dia,mes,ano));
    }
}