package LaTiendaDelBarrio;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {

    }
    public void menu(){
        Scanner entrada= new Scanner(System.in);
        int n=0, id, cant;

        do{
            System.out.printf("%n_______________________________"+
                    "%nSeleeciona la operacion que deseas realizar:"+
                    "%n1. Mostrar articulos."+
                    "%n2. Venta a cliente."+
                    "%n3. Comprar a proveedor."+
                    "%n4. Gestionar articulos."+
                    "%n5. Salir."+
                    "%n_______________________________"+
                    "%n Opcion: ");
            n=entrada.nextInt();
            System.out.println("_______________________________");

            switch (n){
                case 1:
                    System.out.printf("1. Mostrar articulos"+
                                    "/n=======================");

                    break;

                case 2:
                    System.out.printf("2. Venta a cliente"+
                                    "/n======================="+
                                    "/nIntroduce el identificador del producto (ID): ");
                    id = entrada.nextInt();

                    System.out.print("Introduce la canridad de articulos deseados: ");
                    cant= entrada.nextInt();



                    break;

                case 3:
                    System.out.printf("3. Compra a proveedor"+
                                    "/n=========================");

                    break;

                case 4:
                    System.out.printf("4. Gestionar articulos"+
                                    "/n=========================");
                    do{
                        System.out.printf("/nSeleccione la operacion que desea realizar: "+
                            "/n1. Añadir articulo"+
                            "/n2. Editar articulo"+
                            "/n3. Eliminar articulo"+
                            "/n4. Volver"+
                            "%n_______________________________"+
                            "/nOpcion: ");
                    n=entrada.nextInt();
                    System.out.println("_______________________________");

                        switch (n){
                            case 1:
                                System.out.printf("1. Añadir articulo"+
                                        "/n============");

                                break;

                            case 2:
                                System.out.printf("2. Editar articulo"+
                                        "/n============");

                                break;

                            case 3:
                                System.out.printf("3. Eliminar articulo"+
                                        "/n============");

                                break;

                            case 4:
                                System.out.printf("4. Volver"+
                                                "/n============"+
                                                "/nVolviendo al menu principal...");
                                break;
                        }
                    }while(n!=4);

                    break;

                case 5:
                    System.out.printf("5. Salir"+
                                    "/n============"+
                                    "/nSaliendo...");
                    break;

            }

        }while(n!=5);
    }
}
