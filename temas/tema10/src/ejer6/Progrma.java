package ejer6;

public class Progrma {
    public static void main(String[] args) {
        System.out.println("PRUEBA 1");
        try {
            Gato g1 = new Gato("io", 1);
            System.out.println(g1);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("PRUEBA 2");
        try {
            Gato g1 = new Gato("manchitas", 12);
            System.out.println(g1);
            g1.setNombre("io");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("PRUEBA 3");
        try{
            Gato g1 = new Gato("manchitas", 12);
            System.out.println(g1);
            g1.setEdad(-5);
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
