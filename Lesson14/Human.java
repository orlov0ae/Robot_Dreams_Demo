package Lesson14;

public class Human implements Flying, Driving {

    public Human(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    private String name;
    private String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void flying () {
        System.out.println("I can fly");
    }

    @Override
    public void driving () {
        System.out.println("I can drive");
    }

}
