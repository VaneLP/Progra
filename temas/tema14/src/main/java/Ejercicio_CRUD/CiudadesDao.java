package Ejercicio_CRUD;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CiudadesDao implements DAO<Ciudades>{
    //para obtener las conexiones con la base de datos
    private DataSource dataSource;

    //metodos herados de DAO
    /**
     * Para OBTENER las ciudades necesitamos un INSERT
     * @param id
     */
    @Override
    public Optional<Ciudades> obtener(long id) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement stmt = conn.prepareStatement("")){


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    /**
     * Para OBTENER TODOS los registros
     * @return
     */
    @Override
    public List<Ciudades> obtenerTodos() {
        return null;
    }

    /**
     * Para GUARDAR las ciudades necesitamos un INSERT
     * @param ciudades el cual necesitamos pasarle una ciudad que
     *                 tienen el nombre, distrito, id, poblacion
     */
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

    /**
     * Para ACTUALIZAR las ciudades necesitamos un UPDATE
     * @param ciudades el cual necesitamos pasarle una ciudad que
     *                 tienen el nombre, distrito, id, poblacion
     */
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

    /**
     * Para BORRAR las ciudades necesitados DELETE
     * @param ciudades el cual necesitamos pasarle una ciudad que
     *                 tienen el nombre, distrito, id, poblacion
     */
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
