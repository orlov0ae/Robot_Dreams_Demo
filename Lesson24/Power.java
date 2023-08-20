package Lesson24;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        System.out.println(pow());;
    }

    public static int pow() {

        Scanner powering = new Scanner(System.in);

       while (true) {
            try {
                System.out.println("Введіть число для зведення у другу ступінь");
                int num = powering.nextInt();
                if(num<=0) {
                    throw new PowException("Введіть число більше за нуль");
                }
                System.out.println(num + " зведене у ступінь 2 дорівнює: ");
                return num*num;
            } catch (PowException e){
                System.out.println(e.getMessage());
                powering.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ви ввели не число, повторіть спробу, будь-ласка");
                powering.nextLine();
            }
        }

    }

}
