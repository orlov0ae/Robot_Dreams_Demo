package Practice_14;

public class Main {
//    Створіть інтерфейс "GeometricShape" з двома методами: "calculateArea()" та "calculatePerimeter()".
//    Створіть два класи: "Rectangle" та "Circle", які реалізують цей інтерфейс. Вони повинні коректно розраховувати площу та периметр для кожної форми.
//
//    Підказка з формулами:
//    Для прямокутника:
//    Площа = ширина * висота
//            Периметр = 2 * (ширина + висота)
//
//    Для кола:
//    Площа = π * (радіус^2)
//    Периметр (або довжина кола) = 2 * π * радіус
public static void main(String[] args) {
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    circle.calculateArea();
    circle.calculatePerimeter();
    rectangle.calculateArea();
    rectangle.calculatePerimeter();
}


}
