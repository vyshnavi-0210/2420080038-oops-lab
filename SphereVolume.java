package LAB1;
import java.util.Scanner;
public class SphereVolume {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius ");
	        double radius = sc.nextDouble();

	        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

	        System.out.printf("Volume of the sphere: %.2f cubic units\n", volume);
	        
	        sc.close();
}
}