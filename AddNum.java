package LAB1;
import java.util.Scanner;
public class AddNum {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter morning shift earnings ");
	        double morningShiftEarnings = sc.nextDouble();

	        System.out.print("Enter evening shift earnings ");
	        double eveningShiftEarnings = sc.nextDouble();

	        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

	        System.out.println("Total earnings for the day: ₹" + totalDailyEarnings);
	        
	        sc.close();
}
}