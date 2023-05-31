package Ejercicio_CRUD;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PaisDao implements DAO<Pais> {
    //para obtener las conexiones con la base de datos
    private DataSource dataSource;

    //metodos heredados de DAO
    @Override
    public Optional<Pais> obtener(long id) {
         //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    @Override
    public List<Pais> obtenerTodos() {
        return null;
    }

    @Override
    public void guardar(Pais pais) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizar(Pais pais) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void borrar(Pais pais) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
