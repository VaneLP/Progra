package e_5_vehiculos;

public class Barcos extends Acuatico{
    //atributos
    private boolean motor;

    //constructor
    public Barcos(String matricula, Modelo modelo, double eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    //getters y setters
    //motor
    public boolean isMotor() {
        return motor;
    }
    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    //metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("\nBarco"+
                "\n--------"+
                "\nMatricula: "+getMatricula()+
                "\nModelo: "+getModelo()+
                "\nEslora: "+getEslora()+
                "\nMotor: "+ motor);
    }
}
