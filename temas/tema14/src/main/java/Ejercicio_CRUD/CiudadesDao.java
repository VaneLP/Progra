package Ejercicio_CRUD;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
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
            e.printStackTrace();
        }

        //creamos un basicDataSource
        BasicDataSource basicDataSource = new BasicDataSource();

        //le asignamos la URL con los datos que tenemos en el fichero properties
        basicDataSource.setUrl("jdbc:mysql://" + datos.getProperty("db.servidor") + ":3306/" + datos.getProperty("db.baseDatos"));
        //le asignamos el usuario y la clave con los datos del fuchero properties
        basicDataSource.setUsername(datos.getProperty("db.usuario"));
        basicDataSource.setPassword(datos.getProperty("db.clave"));

        //al dataSource le asignamos el basicDataSource
        this.dataSource = basicDataSource;
    }


    //metodos herados de DAO
    /**
     * Para OBTENER las ciudades necesitamos un SELECT
     * @param id
     */
    @Override
    public Optional<Ciudades> obtener(String id) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement ptmt = conn.prepareStatement("SELECT countrycode, id, name, district, population FROM city WHERE id = ?")){

            //le asignamos 1 al indice porque tenemos un solo interrogante, para poder distinguirlos
            ptmt.setString(1,id);

            try(ResultSet rs = ptmt.executeQuery()){
                //mientras que rs tenga una siguiente linea
                while (rs.next()){
                    //guardamos en variables los parametros seleccionados en la consulta sql
                    String countryCode = rs.getString("countrycode");
                    String nombre = rs.getString("name");
                    String distrito = rs.getString("district");
                    long poblacion = rs.getLong("population");

                    //asignamos los parametros a una nueva ciudad
                    Ciudades ciudad = new Ciudades(countryCode,nombre,distrito,id,poblacion);
                    //devolvemos esa ciudad
                    return Optional.of(ciudad);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    /**
     * Para OBTENER TODOS los registros SELECT
     * @return la lista de las ciudades
     */
    @Override
    public List<Ciudades> obtenerTodos() {
        //creamos una lista para guardar todas las ciudades
        List<Ciudades> listaCiudades = new ArrayList<>();

        //comprobamos la conexion
        try(Connection conn = dataSource.getConnection();
            //creamos un statement
            Statement stmt = conn.createStatement();
            //se lo asignamos al resultset con la consulta sql
            ResultSet rs = stmt.executeQuery("SELECT countrycode, id, name, district, population FROM city")){

            //mientras que nuestro rs tenga una siguiente linea
            while (rs.next()){
                //asignamos a variables los parametros de la consulta sql
                String countryCode = rs.getString("countrycode");
                String id = rs.getString("id");
                String nombre = rs.getString("name");
                String distrito = rs.getString("district");
                long poblacion = rs.getLong("population");

                //creamos un nuevo objeto ciudad
                Ciudades ciudad = new Ciudades(countryCode, nombre, distrito, id, poblacion);
                //añadimos la ciudad a la lista
                listaCiudades.add(ciudad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //devolvemos la lista
        return listaCiudades;
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
            PreparedStatement ptmt = conn.prepareStatement("INSERT INTO city(name, district, population) VALUES(?,?,?)")){

            //al preparedStatmet le asignamos a cada ? la obtencion lo que le corresponda
            ptmt.setString(1, ciudades.getNombre());
            ptmt.setString(2, ciudades.getDistrito());
            ptmt.setLong(3, ciudades.getPoblacion());

            //actualizamos el preparedStatment
            ptmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
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
            PreparedStatement ptmt = conn.prepareStatement("UPDATE city SET name=?, district=?, population=? WHERE id=?")){

            //al preparedStatmet le asignamos a cada ? la obtencion lo que le corresponda
            ptmt.setString(1, ciudades.getNombre());
            ptmt.setString(2, ciudades.getDistrito());
            ptmt.setString(3, ciudades.getId());
            ptmt.setLong(4, ciudades.getPoblacion());

            //actualizamos el preparedStatment
            ptmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
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
            PreparedStatement ptmt = conn.prepareStatement("DELETE FROM city WHERE id=?")){

            //al preparedStatmet le asignamos a la ? la obtencion del id
            ptmt.setString(1,ciudades.getId());

            //actualizamos el preparedStatment
            ptmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
