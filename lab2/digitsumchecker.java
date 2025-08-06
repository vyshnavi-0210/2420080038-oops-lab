package lab2;

import java.util.Scanner;

public class digitsumchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer
        System.out.print("Enter an integer (e.g. mobile number): ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Make sure it's positive
        number = Math.abs(number);

        // Calculate sum of digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Display the result
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

        // Optional: Check if divisible by 5
        if (sum % 5 == 0) {
            System.out.println("The digit-sum is divisible by 5 ✅");
        } else {
            System.out.println("The digit-sum is NOT divisible by 5 ❌");
        }

        scanner.close();
    }
}
