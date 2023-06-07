import java.util.Scanner;

public class Lesson5_Conditional_Operators {
    public static void main(String[] args) {
        Scanner numberEnter = new Scanner(System.in); //Entering numbers to compare and for parity check
        System.out.println("Enter first number to compare");
        float firstNumber = numberEnter.nextFloat(); //Entering first number to comparing operations
        System.out.println("Enter second number to compare");
        float secondNumber = numberEnter.nextFloat(); //Entering first number to comparing operations
        System.out.println("Enter number to check for parity"); //Entering number for parity check
        int parityNumber = numberEnter.nextInt();

        Scanner day = new Scanner(System.in); //Entering number of the day in a week
        System.out.println("Enter number of the day in a week from 1 to 7");
        int dayEnter = day.nextInt();

        Scanner mark = new Scanner(System.in); //Entering mark
        System.out.println("Enter mark to check (from 'A' to 'D')");
        String newMark = mark.nextLine().toUpperCase();

        Scanner age = new Scanner(System.in); //Entering age number
        System.out.println("Enter the number of your full years");
        int newAge = age.nextInt();

        bigger(firstNumber, secondNumber);
        smaller(firstNumber, secondNumber);
        parity(parityNumber);
        weekDay(dayEnter);
        markCheck(newMark);
        ageCheck(newAge);
//        newMarkCheck(newMark);

    }

    //Method to compare what number is bigger
    private static void bigger(float firstNumber, float secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " bigger than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " bigger than " + firstNumber);
        } else {
            System.out.println("The numbers is equal");
        }
    }

    //Method to compare what number is smaller
    private static void smaller(float firstNumber, float secondNumber) {
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " smaller than " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(secondNumber + " smaller than " + firstNumber);
        } else {
            System.out.println("The numbers is equal");
        }
    }

    //Checking number for parity method
    private static void parity(int parityNumber) {
        if (parityNumber % 2 == 0) {
            System.out.println(parityNumber + " is even number");
        } else {
            System.out.println(parityNumber + " is odd number");
        }
    }

    //Daycheck method
    private static void weekDay(int dayEnter) {
        switch (dayEnter) {
            case 1:
                System.out.println("First day of the week is a Monday");
                break;
            case 2:
                System.out.println("Second day of the week is a Tuesday");
                break;
            case 3:
                System.out.println("Third day of the week is a Wednesday");
                break;
            case 4:
                System.out.println("Fourth day of the week is a Thursday");
                break;
            case 5:
                System.out.println("Fifth day of the week is a Friday");
                break;
            case 6:
                System.out.println("Sixth day of the week is a Saturday");
                break;
            case 7:
                System.out.println("Seventh day of the week is a Sunday");
                break;
            default:
                System.out.println("You enter incorrect number to check day of the week");
                break;
        }
    }

    //Markcheck method
    private static void markCheck (String newMark) {
        switch (newMark) {
            case "A":
                System.out.println("Mark A means EXCELLENT");
                break;
            case "B":
                System.out.println("Mark B means GOOD");
                break;
            case "C":
                System.out.println("Mark C means FAIR");
                break;
            case "D":
                System.out.println("Mark D means POOR");
                break;
            default:
                System.out.println("You enter wrong mark");
                break;
        }
    }

    //Agecheck
    private static void ageCheck(int newAge) {
        if (newAge >= 0 && newAge <= 12) {
            System.out.println("You are child");
        } else if (newAge <= 17) {
            System.out.println("You are teenage");
        } else if (newAge <= 60) {
            System.out.println("You are adult");
        } else if (newAge <= 150) {
            System.out.println("You are oldster");
        } else if (newAge >= 151) {
            System.out.println("You are not human ;)");
        } else {
            System.out.println("You are enter incorrect age");
        }
    }

//    private static String newMarkCheck (String newMark) {
//        return switch (newMark) {
//            case "A" -> "Mark A means EXCELLENT";
//            case "B" -> "Mark B means GOOD";
//            case "C" -> "Mark C means FAIR";
//            case "D" -> "Mark D means POOR";
//            default -> "You enter wrong mark";
//        };
//    }


}

