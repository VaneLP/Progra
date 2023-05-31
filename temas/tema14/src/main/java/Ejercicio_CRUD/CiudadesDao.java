package Ejercicio_CRUD;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class CiudadesDao implements DAO<Ciudades>{
    //para obtener las conexiones con la base de datos
    private DataSource dataSource;

    //constructor
    public CiudadesDao() {
        //creamos el objeto properties
        Properties datos = new Properties();

        //cargamos el properties
        try (InputStream configStream = CiudadesDao.class.getClassLoader().getResourceAsStream("dataBase.properties")) {
            //en el objeto de properties "datos" metemos toddos los datos que tiene el fichero
            datos.load(configStream);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //creamos un basicDataSource
        BasicDataSource basicDataSource = new BasicDataSource();

        //le asignamos la URL con los datos que tenemos en el fichero properties
        basicDataSource.setUrl("jdbc:mysql://" + datos.getProperty("db.servidor") + ":3306/" + datos.getProperty("db.baseDatos"));
        //le asignamos el usuario y la clave con los datos del fuchero properties
        basicDataSource.setUsername(datos.getProperty("db.usuario"));
        basicDataSource.setPassword(datos.getProperty("db.clave"));

        this.dataSource = basicDataSource;
    }


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
