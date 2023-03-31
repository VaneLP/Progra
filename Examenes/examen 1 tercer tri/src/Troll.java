public class Troll extends Personaje{
    //Atributos
    private static int contador;


    //constructor
    public Troll() {

        setFuerzaAleatoria();
    }

    @Override
    public boolean retirarse() throws Exception {//un troll no puede retirarse
        throw new Exception("Un troll no puede retirarse"); //lanza una excepcion con el mensaje
    }


}
