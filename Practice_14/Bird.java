package Practice_14;

public class Bird implements Steerable{

    @Override
    public void takeOff(){
        System.out.println("Bird takeOff");
    };

    @Override
    public void land() {
        System.out.println("Bird land");
    };

    @Override
    public void fly() {
        System.out.println("Bird fly");
    };

    @Override
    public void steer() {
        System.out.println("Bird steer");
    };

    public void nest(){
        System.out.println("Bird nest");
    }

}
