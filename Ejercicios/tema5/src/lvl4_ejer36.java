public class lvl4_ejer36 {
    /*
    36. Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
a.)             b.)         c.)             d.)
0000000000      1           1111111111      9
1111111111      22          222222222       98
2222222222      333         33333333        987
3333333333      4444        4444444         9876
........        ......      .......         .......
     */
    public static void main(String[] args) {
        int i, j;

        //a
        for(i = 0; i <=9;i++){

            for (j=0; j < 10; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-------");

        //b
        for ( i=1; i < 10; i++){

            for (j=0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-------");

        //c
        for (i = 1; i<10;i++){
            for (j=0; j<10-i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-------");

        //d
        for (i=9;i>0;i--){
            for (j=9;j>i-1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-------");
    }
}
