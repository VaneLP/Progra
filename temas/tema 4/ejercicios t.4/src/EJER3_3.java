import java.util.Scanner;

public class EJER3_3 {
    /*
   3.3. Escribe un programa que calcula el salario neto semanal de un trabajador en
        función del número de horas trabajadas y la tasa de impuestos de acuerdo a las
        siguientes hipótesis:
            • Las primeras 35 horas se pagan a tarifa normal.
            • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
            • Las tasas de impuestos son:
            • Los primeros 500 euros son libres de impuestos.
            • Los siguientes 400 tienen un 25% de impuestos.
            • Los restantes un 45% de impuestos.
        Escribir nombre, salario bruto, tasas y salario neto.

Ejemplo de salida
Introduce el nombre: Pepito
Introduce las horas trabajadas: 45
Introduce el precio de la tarifa normal: 25
Informe del empleado Pepito:
Salario bruto: 890.0€
Salario neto: 792.5€
Impuestos: 97.5€
Introduce el nombre: Juanito
Introduce las horas trabajadas: 50
Introduce el precio de la tarifa normal: 40
Informe del empleado Juanito:
Salario bruto: 1422.5€
Salario neto: 1087.375€
Impuestos: 335.125€
    */
    public static void main(String[] args) {
        int hExt;
        int pagoHNor=0;
        double pagoHExt;
        double salarioB;
        double salarioN=0;
        double tasas;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre;
        nombre = entrada.nextLine();


        System.out.println("introduce las horas trabajadas semanales");
        int hTrab;
        hTrab = entrada.nextInt();

        System.out.println("Dime el precio/hora");
        int precioH;
        precioH = entrada.nextInt();

        if (hTrab>35) {
            hExt= hTrab-35;
            pagoHNor= 35 * precioH;
            pagoHExt = hExt*(1.5*precioH);
            salarioB = pagoHExt+pagoHNor;
        }
        else {
            salarioB = precioH * pagoHNor;
        }

        if (salarioB>500) {

            if (salarioB>900) {
                double cant = salarioB -900;
                double tasa2 = cant*45/100;
                salarioN = 500+(400-100)+(cant-tasa2);
                tasas=100+tasa2;
            }
            else{
                double cant= salarioB-500;
                double tasa1 = cant*25/100;
                double salrioN=500+(cant-tasa1);
                tasas= tasa1;
            }
        }
        else {
            salarioN= salarioB;
            tasas = 0;
             }

        System.out.println("El usuario con nombre "+nombre+". Tiene un salario bruto de "+salarioB+" euros y pagado unas tasas de "+tasas+" euros, tendria un salario neto de "+salarioN+" euros");
        }
    }
