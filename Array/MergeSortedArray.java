package Array;

public class MergeSortedArray {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from arr1 (if any)
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy the remaining elements from arr2 (if any)
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5, 7 };
        int[] array2 = { 2, 4, 6, 8 };

        int[] result = mergeSortedArrays(array1, array2);

        // Print the merged array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
