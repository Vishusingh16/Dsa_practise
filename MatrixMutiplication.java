package Greedy;

import java.util.*;

class Solution {
    static int MatrixMultiplication(int N, int arr[]) {
        int[][] dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        return multiple(arr, 1, N - 1, dp);
    }

    private static int multiple(int[] arr, int i, int j, int[][] dp) {
        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int c1 = multiple(arr, i, k, dp);
            int c2 = multiple(arr, k + 1, j, dp);
            int c3 = arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, c1 + c2 + c3);
        }

        dp[i][j] = ans;
        return ans;
    }
}
