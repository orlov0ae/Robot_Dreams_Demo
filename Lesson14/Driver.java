package Lesson14;

public class Driver extends Human {

    public Driver(String name, String profession) {
        super(name, profession);
    }

    @Override
    public void driving(){
        System.out.println("I'm a driver. My name is " + this.getName() + ". I can drive a car");
    }

}
