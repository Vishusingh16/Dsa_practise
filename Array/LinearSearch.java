package Array;

import java.util.*;

public class LinearSearch {
    public static int linearSearch(int num, int[] arr) {
        // Write your code here.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i; // Return the index where the element is found
            }
        }

        // If the element is not found, you can return a special value, for example, -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int numberToFind = 3;
        int result = linearSearch(numberToFind, array);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
