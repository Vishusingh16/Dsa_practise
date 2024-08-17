package companypractice;

import java.util.Scanner;

public class MaxInArray {

    public static int[] findMaxInArray(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return new int[] { max, index };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findMaxInArray(arr);
        int max = result[0];
        int index = result[1];

        System.out.println("The greatest number is: " + max);
        System.out.println("The index of the greatest number is: " + index);

        sc.close();
    }
}
