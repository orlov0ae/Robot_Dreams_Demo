package Lesson15;

import Lesson14.Driver;
import Lesson14.Human;
import Lesson14.Pilot;

import java.util.Arrays;

import static Lesson15.Pair.returnFist;
import static Lesson15.Pair.returnSecond;

public class Lesson15 <F, S> {

    public static void main(String[] args) {

        Integer[] intArray1 = {1, 25, 48, 35, 10};
        String [] stringArray = {"processor", "floppy", "RAM"};
        Human [] professionArray = {new Pilot("Sam", "pilot"),
                                    new Driver("Den", "driver"),
                                    new Driver("John", "driver")};
        Integer[] intArray2 = {1};

        returnFist(intArray1);
        returnSecond(intArray1);
        returnFist(stringArray);
        returnSecond(stringArray);
        returnFist(professionArray);
        returnSecond(professionArray);
        returnFist(intArray2);
        returnSecond(intArray2);

    }

}
