package Stack;

import java.util.*;

public class Reverse {

    static void insertAtBottom(Stack<Integer> stack, int element) {
        // Base case
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int num = stack.pop();

        // Recursive call
        insertAtBottom(stack, element);

        stack.push(num);
    }

    static void reverseStack(Stack<Integer> stack) {
        // Base case
        if (stack.isEmpty()) {
            return;
        }

        int num = stack.pop();

        // Recursive call
        reverseStack(stack);

        insertAtBottom(stack, num);
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        // Push some elements onto the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        // Print the original stack
        System.out.println("Original Stack: " + myStack);

        // Reverse the stack
        reverseStack(myStack);

        // Print the reversed stack
        System.out.println("Reversed Stack: " + myStack);
    }
}
