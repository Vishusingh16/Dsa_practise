package Queue;

public class first {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public first(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue is successfully created" + size);
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;

        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;

        } else {
            return false;

        }

    }

    // enQueue

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The queue is already full");

        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesfully Inserted the " + value + "in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted the " + value + " in the queue");
        }
    }
    // deQueue

    public int deQueue(int value) {
        if (isEmpty()) {
            System.out.println(" The given queue is empty");

            return -1;

        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            System.out.println("Element removed from the queue: " + result);
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;

            }
            return result;

        }
    }

    // peek
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The queue is empty");
            return -1;

        }

    }
}