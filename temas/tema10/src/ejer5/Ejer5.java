package ejer5;

public class Ejer5 {
    public static void main(String[] args) throws Exception {

        try {
            imprimePositivo(5);
            imprimePositivo(-5);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            imprimeNegativo(-5);
            imprimeNegativo(5);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void imprimePositivo(int p) throws Exception{
        if (p<0)
            throw new Exception("El numero es negativo");
        else
            System.out.println(p);
    }

    public static void imprimeNegativo (int n) throws Exception{
        if (n>=0)
            throw new Exception("El numero es positivo");
        else
            System.out.println(n);
    }



}
