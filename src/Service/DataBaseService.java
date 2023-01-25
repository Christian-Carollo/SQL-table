package Service;

import java.sql.*;

public class DataBaseService {

    Connection connection;
    Statement statement;
    ResultSet resultSet;


    public void creaTableStudents()throws SQLException{

        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Fumettistica11!";

        String query1 = "CREATE TABLE IF NOT EXISTS Students (" +
                "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255)," +
                "surname VARCHAR(255))";



        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();

        if (connection != null) {
            System.out.println("La connessione è stata eseguita ");
        }


        statement.executeUpdate(query1);
        System.out.println("La tabella Fornitori è stata creata con successo!");
    }

    public void insertStudents()throws SQLException{

        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Fumettistica11!";

        String queryInsert1= "INSERT INTO Students (name, surname) VALUES('Luca','Ladroni')";
        String queryInsert2= "INSERT INTO Students (name, surname) VALUES('Mario','Ladroni')";
        String queryInsert3= "INSERT INTO Students (name, surname) VALUES('Lele','Bugiardoni')";
        String queryInsert4= "INSERT INTO Students (name, surname) VALUES('Beppe','Bugiardoni')";

        connection = DriverManager.getConnection(url, user,password);
        statement = connection.createStatement();

        if (connection != null) {
            System.out.println("La connessione è stata eseguita ");
        }

        statement.executeUpdate(queryInsert1);
        System.out.println("Il Primo studente è stato aggiunto nella tabella Students con successo!");
        statement.executeUpdate(queryInsert2);
        System.out.println("Il Secondo studente è stato aggiunto nella tabella Students con successo!");
        statement.executeUpdate(queryInsert3);
        System.out.println("Il Terzo studente è stato aggiunto nella tabella Students con successo!");
        statement.executeUpdate(queryInsert4);
        System.out.println("Il Quarto studente è stato aggiunto nella tabella Students con successo!");

    }
}
