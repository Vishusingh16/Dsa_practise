package Resursion;

public class permutation {
    public static void main(String[] args) {
        String input = "abcd";
        printpermutations(input, "");
    }

    public static void printpermutations(String remainingChars, String currentpermutation) {
        if (remainingChars.length() == 0) {
            System.out.println(currentpermutation);
            return;

        }

        for (int i = 0; i < remainingChars.length(); i++) {
            char currentChar = remainingChars.charAt(i);
            String newRemainingChars = remainingChars.substring(0, i) + remainingChars.substring(i + 1);
            printpermutations(newRemainingChars, currentpermutation + currentChar);

        }
    }

}
