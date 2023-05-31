package Ejercicio_CRUD;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CiudadesDao implements DAO<Ciudades>{
    //para obtener las conexiones con la base de daros
    private DataSource dataSource;


    //metodos herados de DAO
    @Override
    public Optional<Ciudades> obtener(long id) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("SELECT id, name, district, population FROM city")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    @Override
    public List<Ciudades> obtenerTodos() {
        return null;
    }

    @Override
    public void guardar(Ciudades ciudades) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizar(Ciudades ciudades) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void borrar(Ciudades ciudades) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
