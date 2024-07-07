import java.util.*;

class inserrt {

    public static int subsetSum(int[] arr, int sum, int n) {
        n = arr.length;

        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int n = 4;
        int a[] = { 3, 3, 3, 3 };
        int sum = 6;

        System.out.print(subsetSum(a, n, sum));
    }
}
