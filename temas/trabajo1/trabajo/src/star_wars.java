import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class star_wars {
    public static void main(String[] args) {

        //Mostramos el texto de inicio y leemos la tecla enter
        System.out.printf(  "                 === STAR WARS CÓDIGOS SECRETOS === %n" +
                            "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke %n" +
                            "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada %n" +
                            "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio %n" +
                            "está construyendo para destruirla. (Presiona Intro para continuar) %n");

        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();

//----------------------------------------------------------------------------------------------
        //asignacion de variables
        int suma = 0, multi = 1, inicio = 0, facto=1, primo = 1, rm=1, rs=1, sumams;
//----------------------------------------------------------------------------------------------
                                        // LVL1
        //asignacion de variables a numero aleatorio entre los rangos establecidos
        int s1 = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        int s2 =  ThreadLocalRandom.current().nextInt(20, 30 + 1);


        //Texto de lvl 1
        System.out.printf(  "                               === NIVEL 1 === %n" +
                            "Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al %n" +
                            "sistema " + s1 + " en el sector " + s2 + ", pero el sistema de navegación está estropeado y el %n" +
                            "computador tiene problemas para calcular parte de las coordenadas de salto. %n" +
                            "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie. %n" +
                            "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que %n" +
                            "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive). %n" +
                            "¿Qué debe introducir? %n");

        //leemos la respuesta que nos introduzca el usuario
        int r1 = entrada.nextInt();

        //hacemos un for para realizar el resultado de la operacion que debera realizar el usuario y para luego poder comprobar si el usuario a dado la respuesta correcta o no
        for (int i = s1; i <= s2; i++) {
            suma = suma + i;
        }
        //comprobacion LVL1
        if (suma==r1) {

//----------------------------------------------------------------------------------------------
                                             //LVL2
            //asignacion de variables a numero aleatorio entre los rangos establecidos
            int p1 = ThreadLocalRandom.current().nextInt(1, 7 + 1);
            int p2 =  ThreadLocalRandom.current().nextInt(8, 12 + 1);

            //texto de lvl 2
            System.out.printf(  "                               === Nivel 2 === %n" +
                                "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella %n" +
                                "de la muerte. Como van en una nave imperial robada se aproximan lentamente con %n" +
                                "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí %n" +
                                "agente de espaciopuerto " + p1 + " contactando con nave imperial " + p2 + ". No están destinados %n" +
                                "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh… %n" +
                                "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para %n" +
                                "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde %n" +
                                "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el %n" +
                                "manual del piloto que estaba en la guantera y da con la página correcta. El código %n" +
                                "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive). %n" +
                                "¿Cuál es el código? %n");

            //leemos la respuesta que nos introduce el usuario
            int r2 = entrada.nextInt();

            //hacemos un for para realizar el resultado de la operacion que debera realizar el usuario y para luego poder comprobar si el usuario a dado la respuesta correcta o no
            for (int i = p1; i <= p2; i++) {
                multi = multi * i;
            }
            //comproba LVL2
            if (multi == r2){

//----------------------------------------------------------------------------------------------
                                                       //LVL3
                //asignacion de variables a numero aleatorio entre los rangos establecidos
                int n = ThreadLocalRandom.current().nextInt(50, 100 + 1);

                //texto de lvl 3
                System.out.printf(  "                               === Nivel 3 === %n" +
                                    "Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se %n" +
                                    "equipan con trajes de soldados imperiales que encuentran en la nave para pasar %n" +
                                    "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + n + " existentes se %n" +
                                    "encuentra el reactor principal. Se dirigen al primer panel computerizado que %n" +
                                    "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita %n" +
                                    "introducir una clave de acceso. Entonces recuerda la información que le proporcionó %n" +
                                    "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10 %n" +
                                    "(redondeando N hacia abajo), donde N es el nº de niveles”. %n" +
                                    "¿Cual es el nivel correcto? %n");

                //leemos la respuesta que nos introduce el usuario
                int r3 = entrada.nextInt();

                //hacemos un for para realizar el resultado de la operacion que debera realizar el usuario y para luego poder comprobar si el usuario a dado la respuesta correcta o no
                    inicio = n /10;
                    for (int i = 1; i <= inicio; i++){
                        facto= facto * i;
                }
                //comprobacion LVL3
                if (facto == r3) {

//----------------------------------------------------------------------------------------------
                                               //LVL 4
                    //asignacion de variables a numero aleatorio entre los rangos establecidos
                    int p = ThreadLocalRandom.current().nextInt(10, 100 + 1);

                    //texto de lvl 4
                    System.out.printf(  "                               === Nivel 4 === %n"+
                                        "Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta %n" +
                                        "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para %n" +
                                        "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita %n" +
                                        "verificar si el número " + p + " es primo o no. Si es primo introduce un 1, si no lo es %n" +
                                        "introduce un 0. %n");

                    //leemos la respuesta que nos introduce el usuario
                    int r4 = entrada.nextInt();

                    //hacemos un for para realizar el resultado de la operacion que debera realizar el usuario y para luego poder comprobar si el usuario a dado la respuesta correcta o no
                    for (int i = 2;i < p; i++){
                         if (p % i == 0){
                             primo = 0;
                         }
                    }
                    //comprobacion LVL4
                    if (primo == r4){

//----------------------------------------------------------------------------------------------
                                                         //LVL5
                        //asignacion de variables a numero aleatorio entre los rangos establecidos
                        int m = ThreadLocalRandom.current().nextInt(5, 10 + 1);
                        int s = ThreadLocalRandom.current().nextInt(5, 10 + 1);

                        //texto de lvl 5
                        System.out.printf(  "                               === Nivel 5 === %n"+
                                            "Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba, %n" +
                                            "programe el temporizador y salir de allí corriendo. Necesita programarlo para que %n" +
                                            "explote en exactamente " + m + " minutos y " + s + " segundos, el tiempo suficiente para escapar %n" +
                                            "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y %n" +
                                            "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto %n" +
                                            "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar %n" +
                                            "el factorial de " + m + " y el factorial de " + s + ". ¿Qué valor debe introducir? %n");

                        //leemos la respuesta que nos introduce el usuario
                        int r5 = entrada.nextInt();

                        //hacemos un for para realizar el resultado de la operacion que debera realizar el usuario y para luego poder comprobar si el usuario a dado la respuesta correcta o no
                        for (int i = 1; i<=m; i++){
                        rm=rm * i;
                        }

                        for (int j = 1; j<=s; j++){
                        rs=rs * j;
                        }

                        //hacemos el sumatorio de ambos for para el resultado final
                        sumams=rm+rs;

                        //comprobacion LVL5
                        if (sumams == r5){
                            System.out.printf(  "Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a %n" +
                                                "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se %n" +
                                                "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea %n" +
                                                "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan %n" +
                                                "observan por la ventana la imagen de la colosal estrella de la muerte explotando en %n" +
                                                "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado %n" +
                                                "imperio. %n" +
                                                "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D %n");
                        }
//----------------------------------------------------------------------------------------------
                    //PERDER LVL5
                        else{
                            System.out.printf(  "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :( %n" +
                                                "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo! %n");
                        }
                    }
//----------------------------------------------------------------------------------------------
                    //PERDER LVL4
                    else{
                        System.out.printf(  "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :( %n" +
                                            "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo! %n");
                    }
                }
//----------------------------------------------------------------------------------------------
                //PERDER LVL3
                else {
                    System.out.printf(  "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :( %n" +
                                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo! %n");
                }
            }
//----------------------------------------------------------------------------------------------
            //PERDER LVL2
            else {
                System.out.printf(  "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :( %n" +
                                    "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo! %n");
            }
        }
//----------------------------------------------------------------------------------------------
        //PERDER LVL1
        else {
            System.out.printf(  "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :( %n" +
                                "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo! %n");
        }
//----------------------------------------------------------------------------------------------
        //FIN
        System.out.println("Gracias por jugar :D");


    }
}
