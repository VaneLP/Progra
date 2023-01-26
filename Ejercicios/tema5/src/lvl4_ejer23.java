public class lvl4_ejer23 {
    /*
    23. Realiza un programa que muestre las tablas de multiplicar del 1 al 10
     */
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){

            for (int j =1; j <=10; j++){
              int multi= i* j;
                System.out.println(i+"*"+j+"="+multi);
            }
            System.out.println("-------------------------------------------");
        }

    }
}
