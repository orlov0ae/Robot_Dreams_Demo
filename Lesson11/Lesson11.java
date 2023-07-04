package Lesson11;

public class Lesson11 {

    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new PassengerCar();
        Car car2 = new Truck();
        PassengerCar pasCar = new PassengerCar();
        Truck truck = new Truck();

        car.carType();
        car1.carType();
        car2.carType();
        pasCar.carType();
        truck.carType();

    }



}
