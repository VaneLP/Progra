package Ejercicio_CRUD;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class PaisDao implements DAO<Pais> {
    //para obtener las conexiones con la base de daros
    private DataSource dataSource;

    //metodos heredados de DAO
    @Override
    public Optional<Pais> obtener(long id) {
        return Optional.empty();
    }

    @Override
    public List<Pais> obtenerTodos() {
        return null;
    }

    @Override
    public void guardar(Pais pais) {

    }

    @Override
    public void actualizar(Pais pais) {

    }

    @Override
    public void borrar(Pais pais) {

    }
}
