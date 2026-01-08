//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operation op = new Factorial();
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number between 1 and 12 to calculate its factorial: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 12) {
                    break;
                } else {
                    System.out.println("Please enter a valid number between 1 and 12.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
        }
        
        System.out.println("Factorial of " + number + " is: " + op.calculate(number));
        scanner.close();
    }
}