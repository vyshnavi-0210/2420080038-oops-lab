package lab2;
import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a single character as input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if it's an alphabet (A-Z or a-z)
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a valid alphabetic character.");
        } else {
            System.out.println(ch + " is NOT a valid alphabetic character.");
        }

        scanner.close();
    }
}
