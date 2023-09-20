package Lesson32.Manage;

import Lesson32.Classes.Country;
import Lesson32.Creation.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryManager {

    public void insertCounrty(Country country) throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "INSERT INTO country (name) VALUES (?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, country.getName());
            preparedStatement.executeUpdate();
        }

    }

    public void updateCountry(Country country) throws SQLException{

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "UPDATE country SET name = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, country.getName());
            preparedStatement.setInt(2, country.getId());
            preparedStatement.executeUpdate();
        }

    }

    public void deleteCountry (int countryId) throws SQLException{

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "DELETE FROM country WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, countryId);
            preparedStatement.executeUpdate();
        }

    }

    public Country findCountryById(int countryId) throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "SELECT * FROM country WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, countryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("id"));
                country.setName(resultSet.getString("name"));
                return country;
            }
        }
        return null;
    }

}
