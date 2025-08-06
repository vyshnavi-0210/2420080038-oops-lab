package lab2;

import java.util.Scanner;

public class vowelcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a single character from the user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        // Check if it is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }

        scanner.close();
    }
}
