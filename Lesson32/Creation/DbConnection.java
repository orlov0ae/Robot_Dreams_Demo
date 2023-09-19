package Lesson32.Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

    private static volatile DbConnection instance;
    private Connection connection;

    private DbConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "";
            String base_url = "jdbc:mysql://localhost:3306/";

            // Підключення без вказівки схеми
            Connection initialConnection = DriverManager.getConnection(base_url, user, password);
            String dbName = "robot_dreams";
            try (Statement statement = initialConnection.createStatement()) {
                // Створення схеми, якщо вона не існує
                statement.execute("CREATE DATABASE IF NOT EXISTS " + dbName);
            }
            initialConnection.close();

            // Підключення до створеної (або існуючої) схеми
            String url = base_url + dbName;
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public static DbConnection getInstance() throws SQLException {
        if (instance == null) {
            synchronized (DbConnection.class) {
                if (instance == null) {
                    instance = new DbConnection();
                }
            }
        } else if (instance.getConnection().isClosed()) {
            synchronized (DbConnection.class) {
                if (instance == null || instance.getConnection().isClosed()) {
                    instance = new DbConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
