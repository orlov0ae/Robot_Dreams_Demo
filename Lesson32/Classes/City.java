package Lesson32.Classes;

import java.util.Objects;

public class City {


    private int id;
    private String name;
    private int population;
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        City city = (City) object;
        return id == city.id && Double.compare(population, city.population) == 0 && Objects.equals(name, city.name) && Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, population, country);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", country=" + country +
                '}';
    }

}
