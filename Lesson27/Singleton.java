package Lesson27;

public class Singleton {

    private static Singleton instance;
    String name;
    int age;

    private Singleton() {

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
