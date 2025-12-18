package belajar.java.stack.dan.queue;

import java.util.Stack;

public class ReverseStringUsingStackApp {
    public static void main(String[] args) {
        String string1 = "Java";
        String string2 = "Katak";
        String string3 = "Care";

        System.out.println("String 1");
        System.out.println(reverseStringUsingStack(string1));

        System.out.println("String 2");
        System.out.println(reverseStringUsingStack(string2));

        System.out.println("String 3");
        System.out.println(reverseStringUsingStack(string3));
    }

    public static String reverseStringUsingStack(String string) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
