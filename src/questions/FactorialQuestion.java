package questions;

import interfaces.Operation;
import logic.Factorial;
import java.util.Scanner;

public class FactorialQuestion {
    public void run(Scanner scanner) {
        Operation op = new Factorial();
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
    }
}
