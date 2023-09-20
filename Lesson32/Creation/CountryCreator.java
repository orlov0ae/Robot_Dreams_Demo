package Lesson32.Creation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryCreator {

    private void createCountry() throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO country (name) VALUES (?), (?), (?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,"Great Britain");
            preparedStatement.setString(2, "Ukraine");
            preparedStatement.setString(3, "USA");
            preparedStatement.executeUpdate();
        }

    }

    public void init() {
        try {
            createCountry();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
