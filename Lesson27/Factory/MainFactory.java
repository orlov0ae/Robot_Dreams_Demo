package Lesson27.Factory;

public class MainFactory {

    public static void main(String[] args) {

        WorkShop produceTowbar = new WorkShop();
        Towbar Audi_A4 = produceTowbar.produce("AudiTowbar", "A4");
        Towbar Audi_A6 = produceTowbar.produce("AudiTowbar", "A6");
        Towbar BMW_X5 = produceTowbar.produce("BMWTowbar", "X5");
        Towbar Dodge_Journey = produceTowbar.produce("DodgeTowbar", "Journey");

        System.out.println(Audi_A4.getClass());
        System.out.println(Audi_A4.getModel());
        System.out.println(Audi_A6.getClass());
        System.out.println(Audi_A6.getModel());
        System.out.println(BMW_X5.getClass());
        System.out.println(BMW_X5.getModel());
        System.out.println(Dodge_Journey.getClass());

    }

}
