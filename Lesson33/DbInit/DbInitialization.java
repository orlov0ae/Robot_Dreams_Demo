package Lesson33.DbInit;

import Lesson32.Creation.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInitialization {

    private void initDb() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        try (Statement statement = connection.createStatement()) {

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS diary (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "author VARCHAR(50)," +
                            "description VARCHAR(1000)," +
                            "creationTime VARCHAR(255)," +
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
