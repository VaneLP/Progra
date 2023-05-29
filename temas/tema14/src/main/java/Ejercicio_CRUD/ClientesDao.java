package Ejercicio_CRUD;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class ClientesDao implements DAO<Cliente>{
    //para obtener las conexiones con la base de datos
    private DataSource dataSource;

    //metodos heredados de DAO
    @Override
    public Optional<Cliente> obtener(long id) {
        return Optional.empty();
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return null;
    }

    @Override
    public void guardar(Cliente cliente) {

    }

    @Override
    public void actualizar(Cliente cliente) {

    }

    @Override
    public void borrar(Cliente cliente) {

    }
}
