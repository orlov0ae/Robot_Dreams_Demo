package Lesson17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson17 {

    public static void main(String[] args) {

        tenElemlist();
        twoMillionsElemList();
        studentsList();

    }

    public static void tenElemlist() {
        LinkedList <Integer> tenElemList = new LinkedList<>();
        for (int i = 1; i<=10; i++) {
            tenElemList.add(i);
        }
        System.out.println(tenElemList);
    }

    public static void twoMillionsElemList() {
        List<Integer> twoMillionsElemList = new ArrayList<>(2000000);
        for (int i = 1; i<=2000000; i++) {
            twoMillionsElemList.add(i);
        }
        //System.out.println(twoMillionsElemList);
    }

    public static void studentsList() {

        Student alex = new Student("Alex", 18);
        Student john = new Student("John", 25);
        Student peter = new Student("Peter", 70);
        LinkedList <Student> studentsList = new LinkedList<>();
        studentsList.add(alex);
        studentsList.add(peter);
        studentsList.add(john);

        for (int i = 0; i<studentsList.size(); i++){
            System.out.println(studentsList.get(i));
        }

    }


}
