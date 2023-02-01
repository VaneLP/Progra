package LaTiendaDelBarrio;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner entrada= new Scanner(System.in);
        int n=0, id, cant;
        double precioTotal;
        String nombre;

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

                    for (int i =0;i<Articulo.getListaArticulos().size();i++){
                        System.out.println(Articulo.getListaArticulos().get(i));
                    }
                    break;

                case 2:
                    System.out.printf("2. Venta a cliente"+
                                    "/n======================="+
                                    "/nIntroduce el identificador del producto (ID): ");
                    id = entrada.nextInt();

                    System.out.print("Introduce la canridad de articulos deseados: ");
                    cant= entrada.nextInt();

                    System.out.println("Introduce tu nombre: ");
                    nombre= entrada.next();

                    //precio total
                    for (Articulo articulo : Articulo.getListaArticulos()) {
                        if (id==articulo.getId()){
                            System.out.println(articulo.getPrecioVenta()*cant);
                        }
                    }

                    if (confirmar()){
                        System.out.println("Compra realizada con exito");
                    }
                    break;

                case 3:
                    System.out.printf("3. Compra a proveedor"+
                                    "/n========================="+
                                    "/nIntroduce el identificador del producto (ID): ");

                    id = entrada.nextInt();

                    System.out.print("Introduce la canridad de articulos deseados: ");
                    cant= entrada.nextInt();

                    System.out.println("Introduce tu nombre: ");
                    nombre= entrada.next();

                    //precio total
                    for (Articulo articulo : Articulo.getListaArticulos()) {
                        if (id==articulo.getId()){
                            System.out.println(articulo.getPrecioCompra()*cant);
                        }
                    }

                    if (confirmar()){
                        System.out.println("Compra realizada con exito");
                    }
                    break;

                case 4:
                    System.out.printf("4. Gestionar articulos"+
                                    "/n=========================");

                    menu2();
                    break;

                case 5:
                    System.out.printf("5. Salir"+
                                    "/n============"+
                                    "/nSaliendo...");
                    break;

            }
        }while(n!=5);
    }

    public static boolean confirmar () {
        Scanner entrada = new Scanner(System.in);
        String continuar;

        System.out.printf("¿Deseas confirmar el pedido? (Escriba T/t o F/f)" +
                "%nRespuesta: ");
        continuar = entrada.next();

        if (continuar.equals("F") || continuar.equals("f")) {
            return false;
        }

        return true;
    }

    public static void menu2(){
        Scanner entrada= new Scanner(System.in);
        int n, stock, id;
        double precioVenta,precioCompra;
        String nombre;

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
                            "/n============"+
                            "/nIntroduce tu nombre:");
                    nombre= entrada.next();

                    System.out.println("Introduce el precio de venta");
                    precioVenta=entrada.nextDouble();

                    System.out.println("Introduce el precio de compra:");
                    precioCompra= entrada.nextDouble();

                    System.out.println("Introduce el stock:");
                    stock= entrada.nextInt();

                    Articulo.getListaArticulos().add(new Articulo(nombre,precioVenta,precioCompra,stock));
                    break;

                case 2:
                    System.out.printf("2. Editar articulo"+
                            "/n============"+
                            "/nIntroduce la ID del articulo que deseas editar: ");

                   id= entrada.nextInt();

                    for (Articulo articulo : Articulo.getListaArticulos()) {
                        if (id==articulo.getId()){
                            System.out.println("Introduce el precio de venta");
                            precioVenta=entrada.nextDouble();
                            articulo.setPrecioVenta(precioVenta);

                            System.out.println("Introduce el precio de compra:");
                            precioCompra= entrada.nextDouble();
                            articulo.setPrecioCompra(precioCompra);

                            System.out.println("Introduce el stock:");
                            stock= entrada.nextInt();
                            articulo.setStock(stock);
                        }
                    }
                    break;

                case 3:
                    System.out.printf("3. Eliminar articulo"+
                            "/n============"+
                            "/nIntroduce el ID del articulo que deseas eliminar");
                    id=entrada.nextInt();

                    for (Articulo articulo : Articulo.getListaArticulos()) {
                        if (id==articulo.getId()){
                            System.out.println(Articulo.getListaArticulos().remove(articulo));
                        }
                    }
                    break;

                case 4:
                    System.out.printf("4. Volver"+
                            "/n============"+
                            "/nVolviendo al menu principal...");
                    break;
            }
        }while(n!=4);
    }

}
