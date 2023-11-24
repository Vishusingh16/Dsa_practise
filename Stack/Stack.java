package Stack;
// Creating a Stack of size 4

public class Stack {

    int[] arr;
    int topOfTheStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfTheStack = -1;
        System.out.println("This stack is created with the size " + size);
    }

    // isEmpty

    public boolean isEmpty() {
        if (topOfTheStack == -1) {

            return true;
        } else {
            return false;

        }
    }

    // isFull
    public boolean isFull() {
        if (topOfTheStack == arr.length - 1) {
            System.out.println(" The Given Stack is full");
            return true;

        } else {
            return false;

        }
    }

    // push method in java
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is full");
        } else {
            arr[topOfTheStack] = value;

            topOfTheStack++;
        }
    }
    // pop method in java

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;

        } else {
            int topStack = arr[topOfTheStack + 1];
            topOfTheStack--;
            return topStack;
        }
    }

    // peek method in java
    public int peek() {
        if (isEmpty()) {
            System.out.println("The given Stack is empty");
            return -1;
        } else {
            return arr[topOfTheStack];
        }
    }

    // Delete Method in java

    public void DeleteStack() {
        arr = null;
        System.out.println(" The Stack is successfully Deleted");
    }

}
