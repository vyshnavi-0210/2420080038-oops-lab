package lab2;

import java.util.Scanner;

public class perfectnumberchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Find proper divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if it's a perfect number
        if (sum == number) {
            System.out.println(number + " is a Perfect Number ✅");
        } else {
            System.out.println(number + " is NOT a Perfect Number ❌");
        }

        scanner.close();
    }
}