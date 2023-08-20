package Lesson24;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NumberCheck {


    public static void enterNumber(){

        Scanner entering = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введіть числове значення");
                int enter = entering.nextInt();
                System.out.println("Введене значення: " + enter);
                break;
            } catch (NoSuchElementException e) {
                System.out.println("Ви ввели не числове значення. Повторіть, будь-ласка, спробу");
                entering.nextLine();
            }
        }
        entering.close();
    }

}
