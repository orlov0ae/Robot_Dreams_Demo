package Lesson22;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lesson22_part1 {

    public static void main(String[] args) {

        List<String> personsList = List.of(
                "Smith",
                "Rosewell",
                "McConnell",
                "Richards",
                "Smith",
                "Rosewell",
                "McConnell",
                "Smith",
                "Rosewell",
                "McConnell",
                "Smith",
                "Rosewell",
                "Smith",
                "Rosewell",
                "Smith",
                "Rosewell",
                "Smith",
                "Rosewell",
               "Smith",
                "Smith"
        );

        System.out.println(grouping(personsList));

    }

    static Map<String, Long> grouping (List<String> personList) {
        return personList.stream().collect(Collectors.groupingBy(
                        person -> person,
                        Collectors.counting()
            )
        );
    }

}
