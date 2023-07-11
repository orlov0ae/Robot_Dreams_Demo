package Practice_14;

public class Rectangle implements GeometricShape{

    int height = 10;
    int width = 20;

    @Override
    public void calculateArea() {
        int area = height * width;
        System.out.println("Площа прямокутника = " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = (height * 2) + (width * 2);
        System.out.println("Площа прямокутника = " + perimeter);
    }
}
