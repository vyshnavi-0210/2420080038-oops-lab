package lab2;
import java.util.Scanner;

public class gcd {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept two integers
	        System.out.print("Enter first time interval (in hours): ");
	        int a = scanner.nextInt();

	        System.out.print("Enter second time interval (in hours): ");
	        int b = scanner.nextInt();

	        // Calculate GCD using Euclidean algorithm
	        int gcd = findGCD(a, b);

	        // Display the result
	        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

	        scanner.close();
	    }

	    // Function to compute GCD
	    public static int findGCD(int x, int y) {
	        while (y != 0) {
	            int temp = y;
	            y = x % y;
	            x = temp;
	        }
	        return x;
	    }
	}
