package com.kodtodya;

import com.kodtodya.service.ConnectionService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    private static final ConnectionService connectionService = new ConnectionService();

    public static void main(String[] args) {
        // Get a database connection
        Connection connection = connectionService.getConnection();

        // Use the connection to execute SQL queries and interact with the database
        try {
            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM address");
            System.out.println("Printing data from table: " + resultSet.getMetaData().getTableName(1));

            System.out.println("----------------------------");
            // Iterate over the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("address_id"); // Replace "id" with your actual column name
                String city = resultSet.getString("city"); // Replace "city" with your actual column name

                // Do something with the data, e.g., print it
                System.out.println("Address ID: " + id + ", City: " + city);
            }
            System.out.println("----------------------------");
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } finally {
            // Close the connection when done
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}
