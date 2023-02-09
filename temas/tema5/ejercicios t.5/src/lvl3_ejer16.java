import java.util.Scanner;

public class lvl3_ejer16 {
    /*
    16. Realiza un programa que pregunte cuántos números se van a introducir, pida esos
números, y escriba el mayor, el menor y la media aritmética. Se recuerda que la media
aritmética de un conjunto de valores es la suma de esos valores dividida por la
cantidad de valor
     */

    public static void main(String[] args) {
     int numMayor=-1000000000, numMenor= 1000000000,introducir, save, num, nuevoNum=0,media;

        System.out.println("Cuanto numero vas a introducir");

        Scanner entrada= new Scanner(System.in);
        introducir=entrada.nextInt();

        save= introducir;

        System.out.println("Pon los numero que quieras introducir");

        do{
            num= entrada.nextInt();

            if(num>numMayor){
                numMayor=num;
            }

            if(num<numMenor){
                numMenor=num;
            }
            nuevoNum=nuevoNum+num;
        }
        while(introducir==0);

        media=nuevoNum/save;

        System.out.println("El numero mayor de los que has introducido es: "+ numMayor+". El numero menor de los que has introducido es: "+numMenor);
        System.out.println("La media de todos los numero que has introducido es: "+media);
    }
}
