import java.util.Arrays;
import java.util.Random;

public class Lesson8_Arrays {

    public static void main(String[] args) {
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Minimal number in the array is: " + min(array));
        System.out.println("Maximal number in the array is: " + max(array));
        System.out.println("Average value of the array is: " + average(array));
        System.out.println("Sum of all array elements is: " + sumArray(array));
    }

    private static int min (int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int max (int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array [i];
            }
        }
        return max;
    }

    private static float average (int [] array) {
        float midSum = 0;
        for (int i = 0; i < array.length; i++) {
            midSum += array[i];
        }
        return midSum/array.length;
    }

    private static int sumArray (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
