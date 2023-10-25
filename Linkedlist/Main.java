package Linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertLinkedList(4, 1);
        System.out.println("Inserted value at position: " + sLL.head.next.value);
    }

}
