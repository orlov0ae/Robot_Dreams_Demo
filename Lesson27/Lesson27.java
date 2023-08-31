package Lesson27;

public class Lesson27 {

    public static void main(String[] args) {

        System.out.println("Singleton - After first singleton added:");
        Singleton singleton1 = Singleton.getInstance();
        singleton1.name = "John";
        singleton1.age = 28;

        System.out.println("Singleton1 - " + singleton1.toString());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.name = "Peter";
        singleton2.age = 26;

        System.out.println("Singleton - After second singleton added:");
        System.out.println("Singleton1 - " + singleton1.toString());
        System.out.println("Singleton2 - " + singleton2.toString());



    }

}
