import java.util.Scanner;

public class Lesson6_Cycles {
    public static void main(String[] args) {
//        System.out.println("From 1 to 10 numbers counting");
//        numbersCounting();
//        System.out.println("From 0 to 100 only even numbers counting");
//        evenNumbersCounting();
//        System.out.println("Factorial of a number");
//        Scanner factorialNumber = new Scanner(System.in);
//        System.out.println("Enter integer");
//        int fNum = factorialNumber.nextInt();
////        factorial(fNum);
//        factorial();
//        System.out.println("Fibonacci numbers");
//        fibonacci();
//        multiplication();
        potential();
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
        int factorial = 1;
        for (int i=1; i<=fNum; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    private static void factorial() {
        int a = 1;
        int n = 1;
        do {
            n *= a*n;
            a++;
        }
        while (a<8);
        System.out.println(n);
    }



//    private static void fibonacci() {
//        int fib = 0;
//        int nextFib = 1;
//        int midFib = fib;
//        while (nextFib<100) {
//            System.out.println(nextFib);
//            nextFib = midFib + nextFib;
//            fib = nextFib;
//        }
//    }
    private static void multiplication () {
        int number = 3;
        int mult = 1;
                for (int i=1; i<=9; i++) {
                    mult = number * i;
                    System.out.println(mult);
                }
    }

    private static void potential () {
        System.out.println("Введіть число для зведення в ступінь");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        System.out.println("Введіть значення ступеня");
        Scanner pot = new Scanner(System.in);
        int p = pot.nextInt();
        int potRes = 1;
        for (int i=1; i<=p; i++) {
            potRes = potRes * num;
        }
        System.out.println(potRes);
    }


}
