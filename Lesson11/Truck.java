package Lesson11;

public class Truck extends Car{

    @Override
    public void carType() {
        super.carType();
        System.out.println("This is a truck");
    }
}
