package Lesson12;

public class Lesson12 {

    public static String sting1 = "#2 - public static String";


    static {
        System.out.println("#1 - static block");
    }

    public static void main(String[] args) {

        System.out.println(sting1);
        getInt();
        int num;
        num = 25;
        System.out.println("#4 - i num = " + num + " initialization");
        Human human = new Human(25, "male");
        human.getSex();
        something();

    }

    public static void something(){
        System.out.println("#6 - public static void");
    }

    static int getInt() {
        System.out.println("#3 - static method");
        return 100;
    }







}
