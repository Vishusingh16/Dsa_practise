import java.util.*;

public class Palindromes {

    static int max(int x, int y) {

        return (x > y) ? x : y;

    }

    static int longestpalindromic(String s, int i, int j, int count) {

        if (i > j) {
            return count;

        }
        if (i == j) {
            return (count + 1);

        }
        if (str.charAt(i) == str.charAt(j)) {

            count = longestpalindromic(s, i + 1, j - 1, count + 2);

        }
    }

}
