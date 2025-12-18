package belajar.java.stack.dan.queue;

import java.util.Stack;

public class ValidParenthesesApp {
    public static void main(String[] args) {
        String string1 = "(){}[]";
        String string2 = "({[";
        String string3 = "(}{)[}";

        System.out.println("String 1");
        System.out.println(isValid(string1));

        System.out.println("String 2");
        System.out.println(isValid(string2));

        System.out.println("String 3");
        System.out.println(isValid(string3));
    }

    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topCharacter = stack.pop();

                if (character == ')' && topCharacter != '('){
                    return false;
                }

                if (character == '}' && topCharacter != '{'){
                    return false;
                }

                if (character == ']' && topCharacter != '['){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
