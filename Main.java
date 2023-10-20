import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of minutes or 'stop' to exit: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("stop")) {
                break; // Exit the loop if 'stop' is entered
            }

            try {
                long minutes = Long.parseLong(input);
                CalcYearsAndDays.printYearsDaysSeconds(minutes);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number of minutes.");
            }
        }

        scanner.close();
    }
}