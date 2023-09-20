package Lesson32;

import Lesson32.Classes.City;
import Lesson32.Classes.Country;
import Lesson32.Creation.DbCreation;
import Lesson32.Manage.CityManager;
import Lesson32.Manage.CountryManager;

import java.sql.SQLException;

public class Lesson32 {

    //Не додавав функціоналу по студенту, тому, що, фактично те саму зробив для міста, та країни
    public static void main(String[] args) {

        DbCreation dbCreation = new DbCreation();
        dbCreation.createAndInsertDatabase(false);

        try{
            CityManager cityManager = new CityManager();
            City city1 = cityManager.findCityById(1);
            System.out.println(city1);
            System.out.println(cityManager.findCityById(2));
            System.out.println(cityManager.findCityById(3));
            CountryManager countryManager = new CountryManager();
            Country country1 = countryManager.findCountryById(3);
            System.out.println(country1);
            ReadAllCity readAllCity = new ReadAllCity();
            readAllCity.read();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

}
