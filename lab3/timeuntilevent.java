package lab3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class timeuntilevent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try {
            LocalDateTime eventTime = LocalDateTime.parse(input, formatter);
            LocalDateTime currentTime = LocalDateTime.now();

            if (eventTime.isBefore(currentTime)) {
                System.out.println("The event has already occurred.");
                return;
            }

            Duration duration = Duration.between(currentTime, eventTime);
            long totalMinutes = duration.toMinutes();

            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;

            System.out.println("Time remaining until event:");
            System.out.printf("%d days, %d hours, and %d minutes\n", days, hours, minutes);

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter in yyyy-MM-dd HH:mm format.");
        }
    }
}
