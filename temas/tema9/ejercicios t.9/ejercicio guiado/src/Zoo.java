import java.util.ArrayList;

public class Zoo {
    //atributos
    private ArrayList<Animal> listaAnimales;

    //onstructor
    public Zoo() {
        listaAnimales=new ArrayList<>();
    }

    //metodos
    public boolean añadirAnimal(Animal a) {
        if (listaAnimales.contains(a))
            return false;
        else
            listaAnimales.add(a);
        return true;
    }


    public boolean eliminarAnimal(String nombre) {
        int indice=buscarAnimal(nombre);
        if (indice!=-1) {
            listaAnimales.remove(indice);
            return true;
        }
        else
            return false;
    }


    int buscarAnimal(String nombre) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (listaAnimales.get(i).getNombre().equals(nombre))
                return i;
        }
        return -1;
    }

    public void listaAnimales() {
        System.out.println("Animales en el Zoo");
        for (Animal a: listaAnimales) {
            System.out.println(a);
        }
    }


}
