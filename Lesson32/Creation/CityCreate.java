package Lesson32.Creation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityCreate {

    private void createCity() throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO city (name, population, country_id) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1,"London");
                preparedStatement.setInt(2, 8799728);
                preparedStatement.setInt(3,1);
                preparedStatement.executeUpdate();

        }

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1,"Kyiv");
            preparedStatement.setInt(2, 2952301);
            preparedStatement.setInt(3,2);
            preparedStatement.executeUpdate();

        }

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1,"Washington");
            preparedStatement.setInt(2, 601723);
            preparedStatement.setInt(3,3);
            preparedStatement.executeUpdate();

        }

    }

    public void init() {
        try {
            createCity();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
