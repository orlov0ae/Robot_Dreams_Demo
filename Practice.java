import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rectangularMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] singleElementMatrix = {{10}};

        matixType(squareMatrix);
        matixType(rectangularMatrix);
        matixType(singleElementMatrix);


//        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
//        int [][]sumMutrix = new int[3][3];
//
//
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                sumMutrix[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//
//        System.out.println(Arrays.deepToString(sumMutrix));

    }

    private static void matixType (int[][] matrix) {

        if (matrix.length == matrix[0].length) {
            System.out.println(Arrays.deepToString(matrix) + " is square matrix");
        }
        else if (matrix.length == 1 && matrix[0].length == 1) {
            System.out.println(Arrays.deepToString(matrix) + " is single element matrix");
        } else {
            System.out.println(Arrays.deepToString(matrix) + " is rectangular matrix");
        }
    }





//    Practice Arrays


//    public static void main(String[] args) {
//        Random random = new Random();
//
//        int[] array = new int[5];
//
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//        }
//
//        int min = array[0];
//        int max = 0;
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] < min) {
//                min = array[i];
//            } else if (array[i] > max) {
//                max = array[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(min);
//        System.out.println(max);
//
//    }


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

//public static void main(String[] args) {
//    StringBuilder name = new StringBuilder("Java coder");
//    System.out.println("Слово до викликання методу: " + name);
//    charDeleting(name);
//    System.out.println("Слово після викликання методу: " + name);
//
//}
//
//    private static StringBuilder charDeleting (StringBuilder name) {
//        if (!name.isEmpty()) {
//            charDeleting(name.deleteCharAt(name.length()-1));
//        }
//        return name;

}