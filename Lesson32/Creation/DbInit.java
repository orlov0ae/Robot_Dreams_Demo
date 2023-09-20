package Lesson32.Creation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInit {

    private void initDb() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        try (Statement statement = connection.createStatement()) {

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS country (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(40) NOT NULL" +
                            ")"
            );


            statement.execute(
                    "CREATE TABLE IF NOT EXISTS city (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "population INT NOT NULL," +
                            "country_id INT," +
                            "FOREIGN KEY (country_id) REFERENCES country(id)" +
                            ")"
            );

            statement.execute(

                    "CREATE TABLE IF NOT EXISTS students (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(40) NOT NULL" +
                            "surname VARCHAR(40) NOT NULL" +
                            "email VARCHAR(50)" +
                            ")"
            );
        }
    }

    public void createDatabase() {
        try {
            initDb();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
