import java.util.*;

public class Parenthesis {

    public int validParenthesis(String s) {

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            stack.push(-1);
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);

            } else {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(i);

            } else {
                count = Math.max(count, i - stack.peek());

            }

        }

        return count;

    }

    public static void main(String[] args) {
        Parenthesis solution = new Parenthesis();

        // Test the longestValidParentheses function
        String testString1 = "(()())";
        int result1 = solution.validParenthesis(testString1);
        System.out.println("Test 1: " + result1); // Output should be 6

        String testString2 = ")()())";
        int result2 = solution.validParenthesis(testString2);
        System.out.println("Test 2: " + result2);

    }
}