import java.util.Scanner;
import java.util.*;

public class SubsequenceFinder {

    public static boolean check(int[][][] dp, String s, String t, int i, int j, boolean changed) {
        if (j >= t.length())
            return true; // Successfully matched all characters of t
        if (i >= s.length())
            return false; // Reached end of s without matching t
        if (s.charAt(i) != t.charAt(j) && changed)
            return false; // Already changed a char, and they still don't match
        if (dp[i][j][changed ? 1 : 0] != -1)
            return dp[i][j][changed ? 1 : 0] == 1; // Memoization

        boolean ans = false;
        if (s.charAt(i) == t.charAt(j)) {
            ans = check(dp, s, t, i + 1, j + 1, changed); // Characters match, move to the next
        } else if (!changed && j != 0) {
            ans = check(dp, s, t, i + 1, j + 1, true); // Change the character and continue
        }

        dp[i][j][changed ? 1 : 0] = ans ? 1 : 0;
        return ans;
    }

    public static int solution(String s, String t) {
        if (s.length() < t.length())
            return -1;
        int[][][] dp = new int[s.length()][t.length()][2];
        for (int[][] arr : dp) {
            for (int[] subArr : arr) {
                Arrays.fill(subArr, -1);
            }
        }

        if (t.length() == 0)
            return 0;

        for (int i = 0; i <= s.length() - t.length(); i++) {
            if (check(dp, s, t, i, 0, false)) {
                return i + 1;
            }
        }

        String reversedS = new StringBuilder(s).reverse().toString();
        String reversedT = new StringBuilder(t).reverse().toString();
        dp = new int[s.length()][t.length()][2];
        for (int[][] arr : dp) {
            for (int[] subArr : arr) {
                Arrays.fill(subArr, -1);
            }
        }

        for (int i = 0; i <= reversedS.length() - reversedT.length(); i++) {
            if (check(dp, reversedS, reversedT, i, 0, false)) {
                return s.length() - i - t.length();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string s:");
        String s = scanner.nextLine();

        System.out.println("Enter string t:");
        String t = scanner.nextLine();

        int result = solution(s, t);
        System.out.println("First occurrence of t in s (with at most one change in t): " + result);
    }
}
