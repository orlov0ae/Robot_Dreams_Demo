package Lesson14;

public class Lesson14 {

    public static void main(String[] args) {

        Human driver = new Driver("Anthony", "driver" );
        Human pilot = new Pilot("Richard", "pilot");

        System.out.println(driver.getName());
        System.out.println(driver.getProfession());
        System.out.println(pilot.getName());
        System.out.println(pilot.getProfession());
        pilot.flying();
        driver.driving();

    }

}
