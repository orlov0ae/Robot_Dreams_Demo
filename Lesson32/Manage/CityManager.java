package Lesson32.Manage;

import Lesson32.Classes.City;
import Lesson32.Classes.Country;
import Lesson32.Creation.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityManager {

    public void insertCity(City city) throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "INSERT INTO city (name, population, country_id) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getPopulation());
            preparedStatement.setInt(3, city.getCountry().getId());
            preparedStatement.executeUpdate();
        }
    }

    public void updateCity(City city) throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "UPDATE city SET name = ?, population = ?, country_id = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getPopulation());
            preparedStatement.setInt(3, city.getCountry().getId());
            preparedStatement.setInt(4, city.getId());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteCity(int cityId) throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "DELETE FROM city WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, cityId);
            preparedStatement.executeUpdate();
        }
    }

    public City findCityById(int cityId) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT c.id, c.name, c.population, co.id as country_id, co.name as country_name " +
                "FROM city c " +
                "JOIN country co ON c.country_id = co.id " +
                "WHERE c.id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, cityId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("country_id"));
                country.setName(resultSet.getString("country_name"));

                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                city.setPopulation(resultSet.getInt("population"));
                city.setCountry(country);
                return city;
            }
        }
        return null;
    }

}
