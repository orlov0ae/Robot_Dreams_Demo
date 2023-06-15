import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java coder");
        System.out.println("Слово до викликання методу: " + name);
        charDeleting(name);
        System.out.println("Слово після викликання методу: " + name);

    }

    private static StringBuilder charDeleting (StringBuilder name) {
        if (!name.isEmpty()) {
            charDeleting(name.deleteCharAt(name.length()-1));
        }
        return name;
    }





//    public static void main(String[] args) {
//        Scanner firstNum = new Scanner(System.in);
//        System.out.println("Введіть перше число для обчислення");
//        float a = firstNum.nextFloat();
//        Scanner secondNum = new Scanner(System.in);
//        System.out.println("Введіть друге число для обчислення");
//        float b = firstNum.nextFloat();
//        Scanner operation = new Scanner(System.in);
//        System.out.println("Введіть оператор обчислення (+, -, * або /)");
//        String oper = operation.nextLine().toLowerCase();
//        operator(oper);
//        System.out.println("Продовжити обчислення? (y/n)");
//        Scanner answer = new Scanner(System.in);
//        String ans = answer.nextLine().toLowerCase();
//
//    }
//
//    private static void operator (String operation) {
//        if (operation.equals("+")) {
//            adding(float a, float b);
//        } else if (operation.equals("-")) {
//            subtracting(float a, float b);
//        } else if (operation.equals("*")) {
//            multiplication(float a, float b);
//        } else if (operation.equals("/")) {
//            division(float a, float b);
//        } else {
//            System.out.println("Введено не вірний оператор обчислення");
//        }
//    }
//
//    private static float adding (float a, float b) {
//        return a + b;
//    }
//
//    private static float subtracting (float a, float b) {
//        return a - b;
//    }
//
//    private static float multiplication (float a, float b) {
//        return a * b;
//    }
//
//    private static float division (float a, float b) {
//        return a / b;
//    }
}
