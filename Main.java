import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        CalcYearsAndDays.printYearsDaysSeconds(minutes);

        scanner.close();
    }
}