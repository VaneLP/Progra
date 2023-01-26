import java.util.Scanner;

public class ejer11 {
     /*
11.Realiza un programa al que se le introduzca un email y nos devuelva el nombre del
dominio y subdominios si los hubiese, es decir, lo que está entre la arroba y el
punto final (Ejemplo: info@empresas.clientes.mundo-r.com mostraría
empresas.clientes.mundo-r ).
      */
     public static void main(String[] args) {
          //variable
          Scanner entrada= new Scanner(System.in);
          String dominio="";

          //introducir el email
          System.out.println("Introduce tu email");
          String email = entrada.nextLine();

          //Ultima posicion donde aparece
          int arro = email.lastIndexOf("@");
          int punt = email.lastIndexOf(".");

          //bucle que empieza en el @ +1 para no cogerlo y termine en el ultimo .
          for(int i=arro+1;i<punt;i++){
               //variable para determinar que es un caracter
               char carac= email.charAt(i);
               //variable para asignar los caracteres dentro de i en una string y mostrar el texto deseado
               dominio= dominio+carac;
          }

          System.out.println("El dominio y subdominio del email seria: "+dominio);
     }
}
