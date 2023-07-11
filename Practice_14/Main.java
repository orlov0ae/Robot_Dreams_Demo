package Practice_14;

public class Main {
//    Створіть інтерфейс "FlyingObject" з методами "takeOff()", "land()" та "fly()".
//    Створіть інтерфейс "Steerable", який розширює "FlyingObject" та додає метод "steer()".
//    Створіть два класи: "Airplane" та "Bird", які реалізують інтерфейс "Steerable".
//    "Airplane" повинен мати додатковий метод "turnOnEngine()", а "Bird" - метод "nest()"
public static void main(String[] args) {
//    Circle circle = new Circle();
//    Rectangle rectangle = new Rectangle();
//    circle.calculateArea();
//    circle.calculatePerimeter();
//    rectangle.calculateArea();
//    rectangle.calculatePerimeter();

    Bird bird = new Bird();
    Airplane airplane = new Airplane();

    bird.fly();
    bird.takeOff();
    bird.land();
    bird.steer();
    bird.nest();
    airplane.fly();
    airplane.takeOff();
    airplane.land();
    airplane.steer();
    airplane.turnOnEngine();
}


}
