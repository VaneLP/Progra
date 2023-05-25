package AccediendoAGeografia;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class AccediendoAGeografia {
    public static void main(String[] args) throws SQLException {
        //guardamos la url donde se encuentre nuestra BD
        String url="jdbc:mysql://localhost:3306/programacion_geografia";

        //mapa clave = codigo pais / valor - objeto pais
        HashMap<String,Pais> listaPaises = new HashMap<>();

        //coneccition para conectarnos al servidor con nuestro usuario root que no tiene contraseña
        try(Connection conn = DriverManager.getConnection(url,"root","");
            //statmen para poder luego realizar consultas con el
            Statement stmt = conn.createStatement();
            //Resoult para guardar la consulta musql
            ResultSet rs = stmt.executeQuery("SELECT code,name,continent,surfacearea,population FROM country")){

            System.out.println("conexion establecida");

            //recorremos el resoultSet mientras que tenga una siguiente linea
            while(rs.next()){
                //metemos dentro de nuestro mapa como clave la columna 1 y como valor creamos un nuevo pais
                //al cual le insertamos las columnas
                listaPaises.put(rs.getString(1),new Pais(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
            }

            //hago un array para luego ordenarlo
            ArrayList<Pais> arrayPais = new ArrayList<>(listaPaises.values());

            //lo ordenamos
            arrayPais.sort(new Comparator<Pais>() {
                @Override
                public int compare(Pais p1, Pais p2) {
                    return p1.getCodigo().compareToIgnoreCase(p2.getCodigo());
                }
            });

            //hacemos un contador para comprobar los paises que hay por si acaso
            int cont=0;

            //mostramos los paises
            for (Pais p : arrayPais) {
                cont++;
                System.out.println(p);
            }
            //mostramos el contador
            System.out.println("Hay = "+ cont + " paises");


         } catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}
