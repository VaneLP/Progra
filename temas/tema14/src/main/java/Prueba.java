package Ejercicios;


import java.sql.*;

public class Prueba {
    public static void main(String[] args) {
        //guardamos la url
        String url = "jdbc:mysql://localhost:3306/geografia";

        try (//para conectarnos
             Connection conn = DriverManager.getConnection(url,"root","");
             //para iniciar un statement para luego hacer las consultas mysql
             Statement stmt =  conn.createStatement();
             //en un ResoultSet guardamos la consulta mysql
             ResultSet rs = stmt.executeQuery("SELECT * FROM country");){

            System.out.println("Conexion establecida");

            //mientas que nuestro rs tenga una siguiente linea
            while(rs.next()){
                System.out.println(rs.getString(1) +"::"+  rs.getString("Continent"));
            }



            //si hacemos un try-for-resources no hace falta esto
//            //tambien hay que cerrar el resoultset
//            rs.close();
//            //cerramos el statement
//            stmt.close();
//            //cerramos la conexion
//            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
