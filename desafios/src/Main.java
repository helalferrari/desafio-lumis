import questions.FactorialQuestion;
import questions.PalindromeQuestion;

import questions.CodeAnalysisQuestion;
import questions.CarFilteringQuestion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSelect a question to run:");
            System.out.println("1. Factorial Calculation");
            System.out.println("2. Palindrome Check");
            System.out.println("3. Code Block Analysis");
            System.out.println("4. Car Filtering (Black Cars)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    new FactorialQuestion().run(scanner);
                } else if (choice == 2) {
                    new PalindromeQuestion().run(scanner);
                } else if (choice == 3) {
                    new CodeAnalysisQuestion().run();
                } else if (choice == 4) {
                    new CarFilteringQuestion().run(scanner);
                } else if (choice == 0) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
            }
        }
        scanner.close();
    }
}
