package Lesson32.Creation;

public class DbCreation {

    private final DbInit dbInit;
    private final CountryCreator countryCreator;
    private final CityCreate cityCreate;

    public DbCreation() {
        this.dbInit = new DbInit();
        this.countryCreator = new CountryCreator();
        this.cityCreate = new CityCreate();
    }


    public void createAndInsertDatabase(boolean create) {
        if(create) {
            dbInit.createDatabase();
            countryCreator.init();
            cityCreate.init();
        }
    }

}
