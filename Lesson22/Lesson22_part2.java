package Lesson22;

import java.util.List;
import java.util.Random;

public class Lesson22_part2 {

    public static void main(String[] args) {

        List<Integer> intList = List.of(
                random(),
                random(),
                random(),
                random(),
                random(),
                random(),
                random(),
                random(),
                random(),
                random()
        );

        System.out.println("List of integers: " + intList);
        System.out.println("Sum of List of integers (first method) = " + sumFirstMethod(intList));
        System.out.println("Sum of List of integers (second method) = " + sumSecondMethod(intList));
    }

    static Integer random(){
        Random randomInt = new Random();
        return randomInt.nextInt(100);
    }

    static Integer sumFirstMethod(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    static Integer sumSecondMethod (List<Integer> list) {
        return list.stream().reduce(0, (a, b) -> a + b);
    }



}
