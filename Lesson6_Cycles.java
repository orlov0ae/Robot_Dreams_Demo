import java.util.Scanner;

public class Lesson6_Cycles {
    public static void main(String[] args) {
        System.out.println("From 1 to 10 numbers counting");
        numbersCounting();
        System.out.println("From 0 to 100 only even numbers counting");
        evenNumbersCounting();
        System.out.println("Factorial of a number");
        Scanner factorialNumber = new Scanner(System.in);
        System.out.println("Enter integer to calculate factorial");
        int fNum = factorialNumber.nextInt();
        factorial(fNum);
        System.out.println("Fibonacci numbers");
        fibonacci();
        Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter the values of the sides to construct the rectangle");
        System.out.println("Enter height of rectangle");
        int sideA = rectangle.nextInt();
        System.out.println("Enter wide of rectangle");
        int sideB = rectangle.nextInt();
        rectangleConstruction(sideA, sideB);

    }

    private static void numbersCounting() {
        for (int i=1; i<=10; i++)
            System.out.println(i);
    }

    private static void evenNumbersCounting() {
        for (int i=0; i<=100; i++) {
            if (i == 0) {
                continue;
            } else if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }


    private static void factorial(int fNum) {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        }
        while (i <= fNum);
        System.out.println("Factorial of " + fNum + " number is " + fact);
    }



    private static void fibonacci() {
        int fib = 0;
        int midFib = 1;
        int nextFib = 1;
        while (fib<100) {
            System.out.println(fib);
            nextFib = fib + midFib;
            fib = midFib;
            midFib = nextFib;
        }
    }

    private static void rectangleConstruction (int a, int b) {
        for (int i=1; i<=a; i++) {
            String str = "";
            for (int j=1; j<=b; j++) {
                if (j==1) {
                    str += "|*";
                }else {
                    str += "*";
                }
            }
            System.out.println(str + "|");
        }
    }


}
