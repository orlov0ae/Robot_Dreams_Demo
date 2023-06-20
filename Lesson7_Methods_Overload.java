import java.util.Scanner;

public class Lesson7_Methods_Overload {
    public static void main(String[] args) {
        Scanner potential = new Scanner(System.in);
        System.out.println("Enter 'base' number to calculate potential of a number");
        int num = potential.nextInt();
        System.out.println("Enter 'power' number to calculate potential of a number");
        int power = potential.nextInt();
        pot(num, power);
        StringBuilder star = new StringBuilder("");
        Scanner stars = new Scanner(System.in);
        System.out.println("Enter the number of repeats to print a star");
        int r = stars.nextInt();
        System.out.println(starsRepeat(star, r));
        Scanner symbolEnter = new Scanner(System.in);
        System.out.println("Enter symbol you wont to print");
        String symbol = symbolEnter.nextLine();
        Scanner symbolRpt = new Scanner(System.in);
        System.out.println("Enter the number of repeats of the symbol");
        int rSymbol = symbolRpt.nextInt();
        System.out.println(symbolRepeat(symbol, rSymbol));

    }

    private static void pot (int power, int base) {

        int potential = 1;

        for (int i=1; i<=base; i++) {
            potential *= power;
        }

        System.out.println("Potential of " + power + " number is " + potential);
    }

    private static StringBuilder starsRepeat (StringBuilder star, int r) {

        if (star.length() < r) {
            starsRepeat(star.append("*"), r);
        }
        return star;
    }

    private static String symbolRepeat (String symbol, int rSymbol) {

        String str = "";

        for (int i = 0; i<rSymbol; i++) {
            str += symbol;
        }
       return str;
    }
}
