package companypractice;

import java.util.Scanner;

public class findCount {
    public static int count(int arr[], int length, int num, int diff) {
        length = arr.length;
        int count = 0;
        if (length == 0) {
            return -1;

        }
        for (int i = 0; i < length; i++) {
            if (Math.abs(num - arr[i]) <= diff) {
                count++;

            }

        }
        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();

        System.out.println(count(arr, length, num, diff));
        sc.close();
    }
}
