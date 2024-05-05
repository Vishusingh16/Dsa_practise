package Stack;

import java.util.Arrays;

class nonrepeating {
    // Function to find the first non-repeating character in a string.
    static final int CHAR = 256;

    static char nonrepeatingCharacter(String S) {
        int[] fi = new int[CHAR];
        Arrays.fill(fi, -1);

        for (int i = 0; i < S.length(); i++) {
            if (fi[S.charAt(i)] == -1) {
                fi[S.charAt(i)] = i;
            } else {
                fi[S.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++) {
            if (fi[i] >= 0) {
                res = Math.min(res, fi[i]);
            }
        }

        // Check if a non-repeating character is found
        return (res != Integer.MAX_VALUE) ? S.charAt(res) : '$';
    }
}
