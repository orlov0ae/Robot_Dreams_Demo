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
        System.out.println("Sum of List of integers = " + sum(intList));

    }

    static Integer random(){
        Random randomInt = new Random();
        return randomInt.nextInt(100);
    }

    static Integer sum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }



}
