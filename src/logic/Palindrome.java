package logic;

import interfaces.StringChecker;

public class Palindrome implements StringChecker {
    @Override
    public boolean check(String text) {
        if (text == null) {
            return false;
        }
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
