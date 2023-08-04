package Lesson19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Advanced {

    public static void main(String[] args) {

        Map<String, Integer> firstInputMap = new HashMap<>();

        firstInputMap.put("a", 1);
        firstInputMap.put("b", 2);
        firstInputMap.put("c", 3);
        firstInputMap.put("d", 4);

        System.out.println("Original map:");
        for (Map.Entry<String, Integer> entry : firstInputMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Reversed map:");
        revert(firstInputMap);
    }

    static void revert (Map<String, Integer> map) {

        Map<Integer, String> reversedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<Integer, String> entry : reversedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

}


//Завдання №7: Напишіть програму, яка перевертає мапу. Вхідна мапа повинна мати рядки як ключі та цілі числа як значення.
//        Вихідна мапа повинна мати цілі числа як ключі та множини рядків як значення.
//        // input ("a"=1, "b" = 2 , "c" = 3, "d"=3)  -> {1=[a], 2=[b], 3-[c,d]}
//        Map<String,Integer> firstInputMap = new HashMap();
//        Map<Integer, HashSet<String>> outPutMap = new HashMap();
//        */