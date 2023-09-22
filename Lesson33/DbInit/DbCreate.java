package Lesson33.DbInit;

public class DbCreate {

    private final DbInitialization dbInitialization;

    public DbCreate() {
        this.dbInitialization = new DbInitialization();
    }


    public void createAndInsertDatabase(boolean create) {
        if(create) {
            dbInitialization.createDatabase();
        }
    }

}
