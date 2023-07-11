package Practice_14;

public class Circle implements GeometricShape{

    int radius = 5;
    float Pi = (float) 3.14;



    @Override
    public void calculateArea() {
        float area = Pi * radius * radius;
        System.out.println("Площа кола = " + area);
    }

    @Override
    public void calculatePerimeter() {
        float perimeter = 2 * Pi * radius;
        System.out.println("Площа кола = " + perimeter);
    }

}
