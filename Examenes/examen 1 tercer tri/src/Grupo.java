import java.util.*;

public class Grupo {
    //atributos
    //usamos un HashSet
    private static HashSet<Personaje> miembrosGrupo = new HashSet<>();

    //metodos
    /**
     * Insertará el personaje en el grupo.
     * @param personaj
     * @return Devolverá si se ha introducido o no
     *
     *  Dos personajes son iguales si tienen el mismo nombre sin
     *  tener en cuenta si está en mayúsculas o minúsculas.
     */
    public boolean incluirPersonaje(Personaje personaj){
        if(miembrosGrupo.add(personaj))
            return true;
        else
            return false;

    }

    /**
     * @param nombre
     * @return devolverá el Personaje con ese nombre (sin importar mayúsculas
     * o minúsculas) del grupo o null si no existe
     */
    public Personaje getMiembro(String nombre){
        for (Personaje personaje : miembrosGrupo) {
            if(personaje.getNombre().equalsIgnoreCase(nombre))
                return personaje;
        }

        return null;
    }

    /**
     * @return devolverá una lista de los magos del grupo
     */
//    public List<Mago> dameMagos(){
//        List<Mago> listaMagos = new ArrayList<>();
//        for (Personaje personaje : miembrosGrupo) {
//            if(miembrosGrupo.getClass())
//        }
//
//            return listaMagos;
//    }

    /**
     * pondrá en retirada a todos los miembros del grupo. Mostrando por pantalla
     * si se han retirado o si no se han retirado el mensaje del motivo.
     */
    public void retirada(){
        for (Personaje personaje : miembrosGrupo) {
            try {
                personaje.retirarse();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * mostrará por pantalla todos los miembros del grupo junto con el valor
     * de sus atributos. Al final mostrará la fuerza del grupo, que se calcula
     * como la suma de las fuerzas de sus integrantes.
     */
    public void mostrar(){
        int sumaFuerza=0;
        for (Personaje personaje : miembrosGrupo) {
            System.out.println(personaje +" con fuerza "+ personaje.getFuerza());
            sumaFuerza = sumaFuerza + personaje.getFuerza();
        }

        System.out.println("Fuerza del grupo = "+sumaFuerza/miembrosGrupo.size());
    }

    /**
     * eliminará todos aquellos Trolls que están muertos.
     * @return Devolverá el número de Trolls que ha eliminado.
     */
//    public int limpiarGrupo(){
//
//    }

    /**
     * mostrará por pantalla todos los miembros del grupo junto con el valor
     * de sus atributos ordenados por el nombre, que es la ordenación natural.
     */
    public void mostrarGrupo(){

    }

    /**
     * mostrará por pantalla todos los miembros del grupo junto con el valor de
     * sus atributos ordenados por la fuerza, de mayor a menor.
     */
    public void mostrarGrupoXFuerza(){

    }

}
