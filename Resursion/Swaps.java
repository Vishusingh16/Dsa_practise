package Resursion;

public class Swaps {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Swap elements at indices 1 and 3
        swap(arr, 1, 3);

        // Print the array after swapping
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        // Check if indices are valid
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            // Use a temporary variable to hold one of the values during the swap
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("Invalid indices for swapping.");
        }
    }
}
