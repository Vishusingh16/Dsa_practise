package Linkedlist;

import java.util.Scanner;

// Definition for singly-linked list.
class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    // Function to check whether the list is palindrome.

    // Get middle element
    public Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Reverse the linked list from the given node
    public Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Check if the linked list is a palindrome
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node firstHalfEnd = getMiddle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;

        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The linked list is empty or invalid. Cannot be a palindrome.");
            return;
        }

        System.out.println("Enter the elements of the linked list:");
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean result = solution.isPalindrome(head);
        if (result) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

        scanner.close();
    }
}
