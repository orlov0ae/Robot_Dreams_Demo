import java.util.Scanner;

public class Lesson4_Strings {
    public static void main(String[] args) {
        String text = "Java Text String";
        System.out.println("Original string: " + text);
        System.out.println("String to lower case: " + text.toLowerCase());
        System.out.println("String to upper case: " + text.toUpperCase());
        System.out.println("First char in string: " + text.charAt(0));
        System.out.println("Last char in string: " + text.charAt(text.length()-1));

        Scanner wordEnter = new Scanner(System.in);
        System.out.println("Enter the word for check it for palindrome");
        String word = wordEnter.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String reverseWord = sb.toString();
        System.out.println("The entering word is palindrome? - " + word.equals(reverseWord));


    }
}

/* Як визначити кількість повторення слів у строці, без використання масиву і циклу не знаю :). Так щоб зробити
тільки по вивчений темі
 */