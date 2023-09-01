package Lesson27;

public class Proxy implements Basic {

    NewBasic newBasic = new NewBasic();

    @Override
    public void basicMethod() {
        System.out.println("Proxy method");
        newBasic.basicMethod();
    }
}
