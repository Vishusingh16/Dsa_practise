
// package Greedy;

// import java.util.*;

// public class TestClass {
//     public static void main(String args[]) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         for (int testCase = 0; testCase < t; testCase++) {
//             int n = sc.nextInt();
//             int m = sc.nextInt();

//             int[] a = new int[n];
//             int[] b = new int[m];

//             for (int i = 0; i < n; i++) {
//                 a[i] = sc.nextInt();
//             }
//             for (int j = 0; j < m; j++) {
//                 b[j] = sc.nextInt();
//             }

//             System.out.println(equalSubarray(a, b));
//         }
//         sc.close();
//     }

//     public static int equalSubarray(int[] a, int[] b) {
//         int n = a.length;
//         int m = b.length;
//         int sumA = Arrays.stream(a).sum();
//         int sumB = Arrays.stream(b).sum();

//         if (sumA != sumB) {
//             return -1;
//         } else {
//             int maxLength = 0;
//             int prefixSumA = 0;
//             int prefixSumB = 0;

//             int i = 0, j = 0;
//             while (i < n && j < m) {
//                 prefixSumA += a[i];
//                 prefixSumB += b[j];

//                 if (prefixSumA == prefixSumB) {
//                     maxLength++;
//                     i++;
//                     j++;
//                     prefixSumA = 0;
//                     prefixSumB = 0;
//                 } else if (prefixSumA < prefixSumB) {
//                     i++;
//                 } else {
//                     j++;
//                 }
//             }

//             return maxLength;
//         }
//     }
// }

package Greedy;

import java.util.*;

import Array.max;

public class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }

            System.out.println(equalSubarray(a, b));
        }
        sc.close();
    }

    public static int equalSubarray(int[] a, int[] b) {
        int n = a.length;
        int maxLength = 0;
        int m = b.length;
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        int j = 0;
        int i = 0;
        if (sumA != sumB) {
            return -1;
        }
        while (i < n && j < m) {

            int prefixSumA = a[i];
            int prefixSumB = b[j];

            while (prefixSumA < prefixSumB) {
                i++;
                prefixSumA += a[i];

            }
            while (prefixSumB < prefixSumA) {
                j++;
                prefixSumB += b[j];
            }
            if (prefixSumA == prefixSumB) {
                maxLength++;
                i++;
                j++;

            }
        }
        return maxLength;
    }
}
