package Stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(10);

        boolean result = newStack.isEmpty();
        System.out.println("Is the stack empty? " + result);
        boolean result1 = newStack.isFull();
        System.out.println("Is the stack full? " + result1);

        newStack.push(3);

        newStack.push(1);
        // pop
        int val = newStack.pop();
        System.out.println("Popped value: " + val);
        int val1 = newStack.pop();
        System.out.println("Popped value: " + val1);

        int val2 = newStack.peek();
        System.out.println("Popped value: " + val1);
        newStack.DeleteStack();
    }

}
