import Service.DataBaseService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        DataBaseService dataBaseService = new DataBaseService();

        dataBaseService.creaTableStudents();
        dataBaseService.insertStudents();


        try {

            // Dati di connessione al database
            String url = "jdbc:mysql://localhost:3306/newdb";
            String user = "root";
            String password = "Fumettistica11!";

            connection = DriverManager.getConnection(url, user, password);


            if (connection != null) {
                System.out.println("La connessione è stata eseguita " + connection.getCatalog());
            }

            Statement statement = connection.createStatement();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                ;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
