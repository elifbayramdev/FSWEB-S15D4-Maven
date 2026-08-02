package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String text) {

        String cleanedText = text
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char character : cleanedText.toCharArray()) {
            stack.push(character);
        }

        for (char character : cleanedText.toCharArray()) {
            if (character != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int number) {

        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }

        StringBuilder binary = new StringBuilder();

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}