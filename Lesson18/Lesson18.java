package Lesson18;


import java.util.*;
import java.util.HashSet;

public class Lesson18 {

    static Set<Integer> hashSet = new HashSet<>();
    static Set<Integer> linkedHashset = new LinkedHashSet<>();
    static Set<Integer> treeSet = new TreeSet<>();

    public static void main(String[] args) {

        add();
        System.out.println("HashSet");
        printHashSet(hashSet);
        System.out.println("LinkedHashSet");
        printHashSet(linkedHashset);
        System.out.println("TreeSet");
        printHashSet(treeSet);

    }

    public static void add() {

        Random random = new Random();

        System.out.println("Порядок введених елементів");

        for (int i=1; i<=10; i++) {
            int elem = random.nextInt(50);
            hashSet.add(elem);
            linkedHashset.add(elem);
            treeSet.add(elem);
            System.out.println(elem);
        }

        System.out.println("___________");

    }

    public static void printHashSet(Set set) {

        for (Object elem : set) {
            System.out.println(elem);
        }
        System.out.println("_____________");
    }


}
