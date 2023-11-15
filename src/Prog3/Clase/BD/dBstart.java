package Prog3.Clase.BD;

import java.sql.*;

public class dBstart {
    public static void main(String[] args) {
        // Cargar el driver de la base de datos y conectarlo con JDBC
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha podido cargar el driver de la base de datos");
        }

        // Abrir connexion a la base de datos
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Thega/IdeaProjects/JavaLearning/src/Prog3/Clase/BD/Usuario");

            //Hacer una consulta a la base de datos
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM usuario");

            //Recorrer el resultado de la consulta
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Cartera: " + rs.getInt("cartera"));
                System.out.println("--------------------------------------------------");
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar a la base de datos");
        }


        System.out.println("programa terminado");
    }
}
