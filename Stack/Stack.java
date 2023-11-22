package Stack;

public class Stack {

    int[] arr;
    int topOfTheStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfTheStack = -1;
        System.out.println("This stack is created with the size " + size);
    }

}
