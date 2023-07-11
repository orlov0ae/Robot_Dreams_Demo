package Practice_14;

public class Airplane implements Steerable{

    @Override
    public void takeOff(){
        System.out.println("Airplane takeOff");
    };

    @Override
    public void land() {
        System.out.println("Airplane land");
    };

    @Override
    public void fly() {
        System.out.println("Airplane fly");
    };

    @Override
    public void steer() {
        System.out.println("Airplane steer");
    };

    public void turnOnEngine(){
        System.out.println("Airplane turnOnEngine");
    }
}
