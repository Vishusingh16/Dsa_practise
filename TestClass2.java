package Greedy;

import java.util.*;

public class TestClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[i] = sc.nextInt();
            }
            System.out.println(maxSum(a));
        }
        sc.close();
    }

    public static int maxSum(int[] a) {
        int odd = Integer.MAX_VALUE;
        int totalSum = 0;
        for (int c : a) {
            totalSum += a[c];
            if (c % 2 != 0 && a[c] < odd) {
                odd = a[c];
            }
        }
        if (totalSum % 2 != 0) {
            return totalSum;
        } else if (odd == Integer.MAX_VALUE) {
            return -1;
        } else {
            return totalSum - odd;
        }
    }
}
