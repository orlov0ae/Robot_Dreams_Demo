package Lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson19 {

    public static void main(String[] args) {

        translate();

    }

    public static void translate(){

        Map<String, Translation> translationMap = new HashMap<>();

        Translation house = new Translation("house", "Haus", "Dom");
        Translation study = new Translation("study", "lehren", "nauczanie");
        Translation bird = new Translation("bird", "vogel", "ptak");
        Translation city = new Translation("city", "stadt", "miasto");
        Translation village = new Translation("village", "dorf", "wieś");
        Translation road = new Translation("road", "straße", "droga");
        Translation happiness = new Translation("happiness", "glück", "szczęście");
        Translation fish = new Translation("fish", "fisch", "ryba");
        Translation sky = new Translation("sky", "himmel", "niebo");
        Translation horizon = new Translation("horizon", "horizont", "horyzont");

        translationMap.put("дім", house);
        translationMap.put("навчання", study);
        translationMap.put("птиця", bird);
        translationMap.put("місто", city);
        translationMap.put("село",village);
        translationMap.put("дорога", road);
        translationMap.put("щастя", happiness);
        translationMap.put("риба",fish);
        translationMap.put("небо", sky);
        translationMap.put("горизонт", horizon);

        while (true) {
            Scanner wordEnter = new Scanner(System.in);
            System.out.println("Введіть одне з слів на вибір для перекладу: дім, навчання, птиця, місто, село, дорога, " +
                    "щастя, риба, небо, горизонт. Для завершення програми введіть слово 'stop'");
            String word = wordEnter.nextLine();
            if (word.equals("stop")) {
                return;
            }
            else if (!translationMap.containsKey(word)) {
                System.out.println("Введіть слово зі списку");
            }
            else {
                System.out.println(translationMap.get(word));
            }

        }

    }

}
