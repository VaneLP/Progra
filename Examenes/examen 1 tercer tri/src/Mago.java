public class Mago extends Personaje{
    //No tiene nuevos atributos

    //constructor donde pasamos nombre y fuerza
    public Mago(String nombre, int fuerza) {
        super(nombre);

        if(comprobarFuerza(fuerza))//comprueba la fuerza si es correcto
            this.fuerza=fuerza;//asigna esa fuerza
        else//si no es correcto
            this.fuerza=FUERZA_PORDEFECTO;//asigna la fuerza por defecto
    }

    @Override//implementamos el metodo abstracto de Personaje
    public boolean retirarse() throws Exception {
        if(isHerido() && !isMuerto()){//si el mago esta herido y no esta muerto
            return true;//duvuelve verdadero
        }

        if(isMuerto()){//si esta muerto
            throw new Exception("El mago esta muerto");//lanzamos una excepcion con el mensaje
        }

        if(!isHerido()){//Si no esta herido
            throw new Exception("El mago no esta herido");//lanzara una excepcion con el mensaje
        }

        return false;
    }

}
