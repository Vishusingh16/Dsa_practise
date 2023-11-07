package Linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertLinkedList(4, 1);
        sLL.insertLinkedList(9, 5);

        sLL.insertLinkedList(2, 3);

        sLL.insertLinkedList(1, 6);
        sLL.insertLinkedList(6, 1);
        sLL.traverseSinglyLinkedList();
        sLL.searchNode(9);
        // System.out.println("Inserted value at position: " + sLL.head.value);
    }

}
