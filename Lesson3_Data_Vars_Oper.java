import java.util.Scanner;

public class Lesson3_Data_Vars_Oper {
    public static void main(String[] args) {

        Scanner numberEnter = new Scanner(System.in);
        System.out.println("Enter first integer number");
        int firstInt = numberEnter.nextInt();
        System.out.println("Enter second integer number");
        int secondInt = numberEnter.nextInt();
        System.out.println("The sum of the entering numbers is: " + (firstInt + secondInt));
        System.out.println("The subtraction result of the entering numbers is: " + (firstInt - secondInt));
        System.out.println("The result of multiplication of the entering numbers is: " + (firstInt * secondInt));
        System.out.println("The result of division of the entering numbers is: " + (firstInt / secondInt));
    }
}

