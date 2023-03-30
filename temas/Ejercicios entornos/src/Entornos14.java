import java.util.Scanner;

public class Entornos14 {
    /*Realiza un programa en VS Code utilizando el lenguaje Java en el cual se solicite al usuario cuántos números
    desea introducir, seguidamente solicite la introducción de los números enteros y finalmente muestre la media
    aritmética de los números positivos, la media aritmética de los números negativos y la cantidad de
    ceros introducida. */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int pos=0,neg=0,cero=0,sumaPos=0, sumaNeg=0;

        System.out.println("Cuantos numeros deseas introducir");
        int n= entrada.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dime los numeros que deseas introducir");
            int n2= entrada.nextInt();

            if(n2>0) {
                pos++;
                sumaPos=sumaPos+n2;
            }
            if(n2<0) {
                neg++;
                sumaNeg=sumaNeg+n2;
            }
            if(n2==0) {
                cero++;
            }
        }

        if(pos!=0)
            System.out.println("La media aritmetica de los numeros positivos introducidos es: "+(sumaPos/pos));
        if(neg!=0)
            System.out.println("La media aritmetica de los numeros negativos introducidos es: "+(sumaNeg/neg));

        System.out.println("La cantidad de ceros introducidos es de: "+cero);

    }
}
