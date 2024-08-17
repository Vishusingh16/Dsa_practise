package companypractice;

import java.util.*;

public class SmallLargeSum {

    public static int sum(int arr[]) {
        int n = arr.length;
        int[] even = new int[(n + 1) / 2];
        int[] odd = new int[n / 2];
        int sum = 0;
        int evenindex = 0;
        int oddindex = 0;

        if (n <= 3 || n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                even[evenindex] = arr[i];
                evenindex++;
            } else {
                odd[oddindex++] = arr[i];
            }

        }
        Arrays.sort(even);
        Arrays.sort(odd);

        if (even.length > 0 && odd.length > 0) {
            sum = even[even.length - 2] + odd[odd.length - 2];

        }
        for (int j = 0; j < even.length; j++) {
            System.out.print(even[j]);
        }
        System.out.println();
        for (int j = 0; j < odd.length; j++) {
            System.out.print(odd[j]);
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements in the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the number of Element in an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);

        // }
        int result = sum(arr);
        System.out.println("The result is: " + result);
        sc.close();

    }
}
