package Ejercicio_CRUD;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class PaisDao implements DAO<Pais> {
    //para obtener las conexiones con la base de datos
    private DataSource dataSource;

    //constructor
    public PaisDao() {
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
     * Para OBTENER los paises necesitamos un SELECT
     * @param code
     */
    @Override
    public Optional<Pais> obtener(String code) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement ptmt = conn.prepareStatement("SELECT code, name FROM country WHERE code = ?")){

            //le asignamos 1 al indice porque tenemos un solo interrogante, para poder distinguirlos
            ptmt.setString(1,code);

            try(ResultSet rs = ptmt.executeQuery()){
                //mientras que rs tenga una siguiente linea
                while (rs.next()){
                    //guardamos en variables los parametros seleccionados en la consulta sql
                    String nombre = rs.getString("name");

                    //asignamos los parametros a una nueva ciudad
                    Pais pais = new Pais(code,nombre);
                    //devolvemos esa ciudad
                    return Optional.of(pais);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    /**
     * Para OBTENER TODOS los registros SELECT
     * @return la lista de los paises
     */
    @Override
    public List<Pais> obtenerTodos() {
        //creamos una lista para guardar todas las ciudades
        List<Pais> listaPaises = new ArrayList<>();

        //comprobamos la conexion
        try(Connection conn = dataSource.getConnection();
            //creamos un statement
            Statement stmt = conn.createStatement();
            //se lo asignamos al resultset con la consulta sql
            ResultSet rs = stmt.executeQuery("SELECT code, name FROM country")){

            //mientras que nuestro rs tenga una siguiente linea
            while (rs.next()){
                //asignamos a variables los parametros de la consulta sql
                String code = rs.getString("code");
                String nombre = rs.getString("name");

                //creamos un nuevo objeto ciudad
                Pais pais = new Pais(code,nombre);
                //añadimos la ciudad a la lista
                listaPaises.add(pais);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Conexion fallida");
        }

        //devolvemos la lista
        return listaPaises;
    }

    /**
     * Para GUARDAR las ciudades necesitamos un INSERT
     * @param pais el cual necesitamos pasarle una ciudad que
     *                 tienen el nombre, code
     */
    @Override
    public void guardar(Pais pais) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement ptmt = conn.prepareStatement("INSERT INTO country(code, name) VALUES(?,?)")){

            //al preparedStatmet le asignamos a cada ? la obtencion lo que le corresponda
            ptmt.setString(1, pais.getCode());
            ptmt.setString(2, pais.getCode());

            //actualizamos el preparedStatment
            ptmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Para ACTUALIZAR las ciudades necesitamos un UPDATE
     * @param pais el cual necesitamos pasarle una ciudad que
     *                 tienen el nombre, code
     */
    @Override
    public void actualizar(Pais pais) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement ptmt = conn.prepareStatement("UPDATE country SET name=? WHERE code=?")){

            //al preparedStatmet le asignamos a cada ? la obtencion lo que le corresponda
            ptmt.setString(1, pais.getName());
            ptmt.setString(2, pais.getCode());

            //actualizamos el preparedStatment
            ptmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Para BORRAR las ciudades necesitados DELETE
     * @param pais el cual necesitamos pasarle una ciudad que
     *                 tienen el nombre, code
     */
    @Override
    public void borrar(Pais pais) {
        //para conectarnos a nuestro servidor
        try(Connection conn = dataSource.getConnection();
            //consulta SQL
            PreparedStatement ptmt = conn.prepareStatement("DELETE FROM country WHERE code=?")){

            //al preparedStatmet le asignamos a la ? la obtencion del id
            ptmt.setString(1,pais.getCode());

            //actualizamos el preparedStatment
            ptmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
