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
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/Prog3/Clase/BD/Usuario");

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

            // Realizar una modificacion en la base de datos
            // INSERT INTO usuario (nombre, apellido, cartera) VALUES ('maria', 'perez', 1000)
            int rows = statement.executeUpdate("INSERT INTO usuario (nombre, apellido, cartera) VALUES ('maria', 'perez', 1000.5)");
            System.out.println("Se han modificado " + rows + " filas");

            // para hacerlo de manera que los datos se obtengan de fuera
            String nombre = "juan";
            String apellido = "ñiguez";
            double cartera = 546848.7;
            String sql = "INSERT INTO usuario (nombre, apellido, cartera) VALUES ('" + nombre + "', '" + apellido + "', '" + cartera + "')";
            System.out.println(sql);
            statement.executeUpdate(sql);
            statement.close();

            // De manera mejot se puede hacer de la siguiente manera y que sea mas seguro
            nombre = "antonio";
            apellido = "manzanares";
            cartera = 1158.7;
            PreparedStatement ps = conn.prepareStatement("INSERT INTO usuario (nombre, apellido, cartera) VALUES (?, ?, ?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setDouble(3, cartera);
            ps.executeUpdate();
            ps.close();

            System.out.println("--------------------------------------------------");

            PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM usuario WHERE nombre = ?");
            ps2.setString(1, "antonio");
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("id"));
                System.out.println("Nombre: " + rs2.getString("nombre"));
                System.out.println("Apellido: " + rs2.getString("apellido"));
                System.out.println("Cartera: " + rs2.getInt("cartera"));
                System.out.println("--------------------------------------------------");
            }
            rs2.close();
            ps2.close();

            conn.close();
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar a la base de datos");
        }


        System.out.println("programa terminado");
    }
}
