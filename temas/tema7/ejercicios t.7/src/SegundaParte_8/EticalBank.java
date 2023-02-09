package SegundaParte_8;

import java.util.Scanner;

public class EticalBank {
    public static void main(String[] args) {
        //crearmos una cuenta bancaria
        CuentaBancaria c= crear();

        //llamamos al menu
        EticalBank.menu(c);

    }
    
    /**
     * Funcion para mostrar un menu por pantalla con diferentes opciones
     * @param c Cuenta bancaria
     *          Nos devuelve segun la opcion seleccionada
     */
    public static void menu(CuentaBancaria c){

        Scanner entrada =new Scanner(System.in);
        int n=0, dinero;
        String continuar;

        do{
            System.out.printf("%n_______________________________"+
                    "%nSeleeciona la operacion que deseas realizar:"+
                    "%n1. Datos de la cuenta."+
                    "%n2. IBAN."+
                    "%n3. Titular."+
                    "%n4. Saldo."+
                    "%n5. Ingreso."+
                    "%n6. Retirar."+
                    "%n7. Salir."+
                    "%n_______________________________"+
                    "%n Opcion: ");
            n=entrada.nextInt();

            System.out.println("_______________________________");

            switch (n){
                case 1:
                    System.out.printf("1. Datos de la cuenta"+
                                    "%n======================"+
                            "%nIBAN: "+ c.getIban()+
                            "%nTitular: "+ c.getTitular()+
                            "%nSaldo: "+ c.getSaldo()+
                            "%n");
                    break;

                case 2:
                    System.out.printf("2. IBAN"+
                            "%n======================"+
                            "%nIBAN: "+ c.getIban()+
                            "%n");
                    break;

                case 3:
                    System.out.printf("3. Titular"+
                            "%n======================"+
                            "%nTitular: "+ c.getTitular()+
                            "%n");
                    break;

                case 4:
                    System.out.printf("4. Saldo"+
                            "%n======================"+
                            "%nSaldo: "+ c.getSaldo()+
                            "%n");
                    break;

                case 5:
                    System.out.printf("5. Ingreso"+
                            "%n======================"+
                            "%n¿Que cantidad de dinero desea ingresar?"+
                            "%nCantidad: ");
                    dinero= entrada.nextInt();

                    while (dinero<0){
                        System.err.println("ERROR al introducir la cantidad de dinero");

                        System.out.printf("Vuelve a introducir la cantidad"+
                                "%nCantidad: ");
                        dinero= entrada.nextInt();
                    }

                    c.ingreso(dinero);
                    break;

                case 6:
                    System.out.printf("6. Retirada"+
                            "%n======================"+
                            "%n¿Que cantidad de dinero desea retirar?"+
                            "%nCantidad: ");
                    dinero= entrada.nextInt();


                    c.retiradas(dinero);
                    break;

                case 7:
                    System.out.printf("7. Salir"+
                            "%n======================");
                    break;
            }

            if(n!=7) {
                System.out.printf("¿Deseas realizar otra operacion? (Escriba T/t o F/f)"+
                        "%nRespuesta: ");
                continuar = entrada.next();
                if (continuar.equals("F") || continuar.equals("f")) {
                    n = 7;
                }
            }

        }while(n!=7);

        System.out.printf("_______________________________"+
                "%nFin del programa");
    }

    /**
     * Funcion para crear una nueva cuenta bancaria, que nos comprueba si el IBAN es correcto o no
     * @return devuelve la nueva cuenta bancaria con el IBAN y el titular
     */
    public static CuentaBancaria crear(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%n_______________________________"+
                        "%nCreacion de una nueva cuenta bancaria"+
                        "%nIntroduce el IBAN: ");
        String iban = entrada.nextLine();
        while (!iban.matches("[A-Za-z]{2}\\d{22}")) {
            System.err.println("ERROR al intruducir el IBAN");

            System.out.print("Vuelva a introducir el IBAN: ");
            iban = entrada.nextLine();
        }

        System.out.print("Introduce el nombre del titular: ");
        String titular = entrada.nextLine();

        CuentaBancaria c=new CuentaBancaria(iban,titular);

        return c;
    }
}
