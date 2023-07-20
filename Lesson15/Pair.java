package Lesson15;

public class Pair <F, S>{

    public static <F> void returnFist (F [] array) {
        F first = array[0];
        System.out.println("Перший елемент масиву: " + first);
    }

    public static <S> void returnSecond (S [] array) {
        if(array.length < 2) {
            System.out.println("Масив коротший, ніж два символи");
        } else {
            S second = array[1];
            System.out.println("Другий елемент масиву: " + second);
        }
    }

}
