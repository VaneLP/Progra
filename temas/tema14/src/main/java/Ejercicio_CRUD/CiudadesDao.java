package Ejercicio_CRUD;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class CiudadesDao implements DAO<Ciudades>{
    //para obtener las conexiones con la base de daros
    private DataSource dataSource;


    //metodos herados de DAO
    @Override
    public Optional<Ciudades> obtener(long id) {
        return Optional.empty();
    }

    @Override
    public List<Ciudades> obtenerTodos() {
        return null;
    }

    @Override
    public void guardar(Ciudades ciudades) {

    }

    @Override
    public void actualizar(Ciudades ciudades) {

    }

    @Override
    public void borrar(Ciudades ciudades) {

    }
}
