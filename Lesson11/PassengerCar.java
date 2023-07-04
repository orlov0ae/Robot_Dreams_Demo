package Lesson11;

public class PassengerCar extends Car{

    @Override
    public void carType() {
        super.carType();
        System.out.println("This is a passenger car");
    }
}
