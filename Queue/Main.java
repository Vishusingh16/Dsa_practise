package Queue;

public class Main {
    public static void main(String[] args) {
        first queueArray = new first(5);
        boolean result = queueArray.isFull();
        System.out.println(result);
        queueArray.enQueue(3);
        queueArray.enQueue(4);
        queueArray.enQueue(6);

        int result1 = queueArray.deQueue(0);
        System.out.println(result1);

        int result2 = queueArray.peek();
        System.out.println(result2);

        queueArray.deQueue(0);
    }

}
