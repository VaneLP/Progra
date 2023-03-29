package ejerAgendaTelefonica;

import java.util.ArrayList;

public class Agenda {
    //atributos
    //la hacemos static para poder llamarlo atraves de su clase sin tener que crear un objeto
    static ArrayList<Registro> listaAgenda;

    public Agenda() {
        listaAgenda=new ArrayList<>();
    }


}
