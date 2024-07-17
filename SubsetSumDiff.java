import java.util.*;

public class SubsetSumDiff {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 2, 5 };
        minsubsetdiff(arr);

    }

    public static void minsubsetdiff(int[] arr) {
        int range = 0;
        // took the range

        for (int i = 0; i < arr.length; i++) {
            range += arr[i];
        }
        int n = arr.length;
        Boolean dp[][] = new boolean[n + 1][range + 1];

        // initialized both the base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j <= range; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < range; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int diff = Integer.MAX_VALUE;
        for (int j = totalSum / 2; j >= 0; j--) {
            if (dp[n][j]) {
                diff = totalSum - (2 * j);
                break;
            }
        }

    }
}
