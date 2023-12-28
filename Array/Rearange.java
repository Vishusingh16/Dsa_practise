public class Rearange {

    public static void rearrangeArray(int[] arr, int n) {
        int negativePointer = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If the current element is positive, swap it with the element at the
            // negativePointer
            if (arr[i] >= 0) {
                int temp = arr[i];
                arr[i] = arr[negativePointer];
                arr[negativePointer] = temp;

                // Move the negativePointer to the next position
                negativePointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        rearrangeArray(arr, n);

        System.out.println("Array after rearranging:");
        printArray(arr);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
