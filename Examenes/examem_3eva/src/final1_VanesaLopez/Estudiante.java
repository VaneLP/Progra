package final1_VanesaLopez;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

//realizamos la clase estudiante
public class Estudiante {
    //atributos privados
    private final String identificador;
    private String nombre,apellidos,correo;
    Map<Asignatura,Double> mapaAsignatura;

    //constructor NO se le pasa asignatura
    public Estudiante(String identificador, String nombre, String apellidos, String correo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;

        //se creara un diccionario no ordenado vacio
        mapaAsignatura= new HashMap<>();

    }

    //metodos

    /**
     *
     * @param numero se le pasa un numero entero como parametro
     * @return devuelve un numero entero largo aleatorio igual al numero del parametro sin repetir sus digitos
     */
    public long obtenerPin(int numero){
        //si el numero introducido es mayor a 10 o no positivo, lo tomaremos como 10
        if(numero>10 || numero<0)
            numero=10;

        int numeroAnterior=0, numeroAle;
        StringBuilder pin= new StringBuilder();

        //hacemos un for que empiece en 1 y termine cuando sea igual al numero introducido
        for (int i=1;i<=numero;i++){
            //guardamos en una variable un numero aleatorio
            numeroAle= ThreadLocalRandom.current().nextInt(0,9+1);

            //si el numero aleatorio es distinto al numero anterior
            if(numeroAle!=numeroAnterior) {
                //guardamos en el numero anterior el numero aleatorio
                numeroAnterior = numeroAle;
                //añadimos el numero aleatorio al pin
                pin.append(numeroAle);
            }

        }
        //devolvemos el pin
        return Long.parseLong(pin.toString());
    }

    /**
     * Metodo sobrecarcado al llamerse sin parametros
     * @return devolvera un pin de 4 digitos
     */
    public long obtenerPin() {
        int numeroAnterior = 0, numeroAle;
        StringBuilder pin = new StringBuilder();

        //hacemos un for que empiece en 1 y termine en 4
        for (int i = 1; i <= 4; i++) {
            //guardamos en una variable un numero aleatorio
            numeroAle = ThreadLocalRandom.current().nextInt(0,9+1);

            //si el numero aleatorio es distinto al numero anterior
            if (numeroAle != numeroAnterior) {
                //guardamos en el numero anterior el numero aleatorio
                numeroAnterior = numeroAle;
                //añadimos el numero aleatorio al pin
                pin.append(numeroAle);
            }
        }
        //devolvemos el pin
        return Long.parseLong(pin.toString());
    }

    /**
     *
     * @param nombre le pasamos el nombre para obtener las 3 primeras letras
     * @param apellido le pasamos el apellido para obtener las 3 primeras letras
     * @return devuelve una cadena de texto formada por las 3 primeras letras del nombre y las 3 primeras letras del apellido
     * en minusculas, si no tiene esa longitud se le añadira lo que se pueda
     */
    public String obetenerLogin(String nombre, String apellido){
        StringBuilder letrasNombre = new StringBuilder(nombre);
        StringBuilder letrasApellido = new StringBuilder(apellido);


        return "";
    }

    /**
     *
     * @param correo se le pasa un correo
     * @return devolvera si el correo es correcto o no
     */
    public boolean esCorreoValido(String correo){
        //modificada la expresion encontrada en internet para que no de fallo
        if(correo.matches( "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-]+$"))
            //si el correo es correcto devolvemos true
            return true;
        else
            //si el correo no es correcto devolvemos false
            return false;
    }

    /**
     *
     * @param asigna se le pasa una asignatura
     * se debe introducir en las asignaturas del alumno con la nota = 0
     */
    public void matricular(Asignatura asigna){
        //dentro de nuesto mapa le metemos la asginatura y la nota =0
        mapaAsignatura.put(asigna, 0.0);
    }

    /**
     *
     * @param codiAsigna se le pasa un codigo de asignatura
     * @param nota y un numero real
     * Modificara la nota en el mapa de asignaturas que corresponda con ese codigo
     * @throws Exception si no esta matriculado lanza una excepcion
     */
    public void cambiarNota(int codiAsigna, double nota)throws Exception{
        //recooremos nuestro mapa de asignaturas
        for (Asignatura asignatura : mapaAsignatura.keySet()) {
            //si el codigo de asginatura obtenido es igual al codigo de asignatura introducido
            if(asignatura.getCodigoAsignatura()== codiAsigna)
                //cambiamos la nota a la asignatura
                mapaAsignatura.replace(asignatura,nota);
            else
                throw new Exception("Alumno no matriculado en la asignatura");
        }
    }

    /**
     * metodo sobrecargado
     * @param nombreasigna se le pasa el nombre de la asignatura
     * @param nota y un numero real
     * Modifica la nota en el mapa de asignaturas que corresponda con ese nombre de asignatura
     * @throws Exception si no esta matriculado lanza una excepcion
     */
    public void cambiarNota(String nombreasigna, double nota)throws Exception{
        //recooremos nuestro mapa de asignaturas
        for (Asignatura asignatura : mapaAsignatura.keySet()) {
            //si el codigo de asginatura obtenido es igual al codigo de asignatura introducido
            if(asignatura.getNombre().equalsIgnoreCase(nombreasigna))
                //cambiamos la nota a la asignatura
                mapaAsignatura.replace(asignatura,nota);
            else
                throw new Exception("Alumno no matriculado en la asignatura");
        }
    }

    /**
     * Pasara de curso si todas las notas de las asignaturas son mayores = a 5
     * @return devuelve si el alumno pasa o no de curso
     */
    public boolean promociona(){
        //inicializamos un contador a 0
        int cont=0;

        //hacemer un bucle que recorra todas los valores de nuestro maapa
        for (Double nota : mapaAsignatura.values()) {
            //si los valores son mayor = a 5
            if(nota>=5)
                //le sumamos 1 a nuestro contador
                cont++;
        }

        //si nuestro contador es = al tamaño de nuestro mapa
        if (mapaAsignatura.size()==cont)
            //devolvemos verdadero, porque todas las asignaturas seran >=5
            return true;
        else
            //si no delvolvemos false porque una o varias asignaturas seran menor a 5
            return false;
    }

    /**
     * Mostrara por pantalla un listado de las asignatuas matriculadas
     * con el codigo y nombre + la nota obtenida
     * ORDENADOS por nombre de la asignatura
     * Salida formateada
     */
    public void mostrarNotas(){
        for (Map.Entry<Asignatura, Double> entry : mapaAsignatura.entrySet()) {
            System.out.printf("codigoAsigntura: %s nombreAsignatura: %s nota:%d.2f", entry.getKey().getCodigoAsignatura(),entry.getKey().getNombre(),entry.getValue());
        }
    }


    //to string para mostrar el estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
