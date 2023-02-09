package examenVanessaLopez;

public class Pokemon {
    //atributos
    private final String nombre;
    private int id;
    private final int identificador;
    private int salud;
    private int ataque;
    private int defensa;
    private int velocidad;
    private final int tipo;
    private boolean defendiendo;


    //constructor
    public Pokemon(String nombre, int identificador, int salud, int ataque, int defensa, int velocidad, String tipo){
        //todos estos atributos tienen que ser siempre positivos
        if(salud>0 && ataque>0 && defensa>0 && velocidad>0) {
            this.nombre = nombre;
            this.identificador = identificador;
            id =identificador+1;
            this.salud = salud;
            this.ataque = ataque;
            this.defensa = defensa;
            this.velocidad = velocidad;
            defendiendo=false;

            if(tipo.equals("TIPO_PLANTA")) {
                this.tipo = 1;
            }
            else if (tipo.equals("TIPO_VENENO")) {
                this.tipo = 2;
            }
            else if (tipo.equals("TIPO_FUEGO")) {
                this.tipo = 3;
            }
            else if (tipo.equals("TIPO_AGUA")) {
                this.tipo = 4;
            }
            else if (tipo.equals("TIPO_TIERRA")) {
                this.tipo = 5;
            }

        }
        //si no se cumple el if los declaramos a null o con los valores establecidos
        else{
            this.nombre=null;
            this.identificador=0;
            this.tipo=0;
            this.salud=1;
            this.ataque=1;
            this.defensa=1;
            this.velocidad=1;
        }
    }


    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }

    //identificador
    public int getIdentificador() {
        return identificador;
    }

    //salud
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }

    //ataque
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    //defensa
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    //velocidad
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //tipo
    public int getTipo() {
        return tipo;
    }

    //defendiendo
    public boolean isDefendiendo() {
        return defendiendo;
    }
    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }


    //metodos
    /**
     * Metodo para mostrar la informacion del pokemon
     * @return una cadena de texto con los valores asignados
     */
    @Override
    public String toString() {
        return "'nombre_del_pokemon'" + nombre + '\'' +
                "[id:" + identificador +
                ", ps:" + salud +
                ", pa:" + ataque +
                ", pd:" + defensa +
                ", pv:" + velocidad +
                "] tipo:" + tipo +
                ", defendiendo=" + defendiendo;
    }

    /**
     * metodo para poder atacar a otro pokemon
     * @param p se le paso el pokemon
     * @return la vida restante
     */
    public int atacar(Pokemon p){
        if(defendiendo){
            defendiendo=false;
            return salud-(ataque/2);
        }
        return salud;
    }

}
