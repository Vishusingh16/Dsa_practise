package Resursion;

public class RotateString {

    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String str = s1 + s1;
        int i = 0;
        int j = 0;
        while (i < str.length() && j < s2.length()) {
            if (str.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == s2.length();
    }

}
