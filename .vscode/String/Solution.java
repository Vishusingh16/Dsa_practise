
class Solution {
    int distinctSubsequences(String S) {
        gss(S, "");

        // You need to return the result here.
        // For example, you can return the count of distinct subsequences.
        // You may need additional logic based on the specific requirements of your
        // problem.
        return 0;
    }

    public static void gss(String s, String ans) {
        // Base case: when the length of the string is 0
        if (s.length() == 0) {
            System.out.println(ans); // Print or process the current subsequence
            return;
        }

        // Include the current character in the subsequence
        gss(s.substring(1), ans + s.charAt(0));

        // Exclude the current character from the subsequence
        gss(s.substring(1), ans);
    }
}