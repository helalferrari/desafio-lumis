package questions;

import interfaces.StringChecker;
import logic.Palindrome;
import java.util.Scanner;

public class PalindromeQuestion {
    public void run(Scanner scanner) {
        StringChecker checker = new Palindrome();
        
        System.out.print("Enter a word to check if it is a palindrome: ");
        String input = scanner.next();
        
        boolean isPalindrome = checker.check(input);
        
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a palindrome.");
        }
    }
}
