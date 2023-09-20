package Lesson32;

import Lesson32.Creation.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadAllCity {

    public void read() throws SQLException {

        Connection connection = DbConnection.getInstance().getConnection();
        String sql= "SELECT * FROM city";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int population = resultSet.getInt("population");
            System.out.println("ID: " + id);
            System.out.println("Місто: " + name);
            System.out.println("Населення: " + population);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    }

}
