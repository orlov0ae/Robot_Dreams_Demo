package Lesson14;

public class Pilot extends Human {

    public Pilot(String name, String profession) {
        super(name, profession);
    }

    @Override
    public void flying() {
        System.out.println("I'm a pilot. My name is " + this.getName() + ". I can fly on an airplane");
    }

}
