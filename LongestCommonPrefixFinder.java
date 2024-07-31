package Linkedlist;

import java.util.Arrays;
import java.util.Scanner;

class LongestCommonPrefixFinder {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        System.out.println(strs);

        StringBuilder res = new StringBuilder();

        char[] a = strs[0].toCharArray();
        char[] b = strs[n - 1].toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                break;
            }
            res.append(a[i]);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strs = new String[numStrings];
        System.out.println("Enter the strings:");
        for (int i = 0; i < numStrings; i++) {
            strs[i] = scanner.nextLine();
        }

        LongestCommonPrefixFinder finder = new LongestCommonPrefixFinder();
        String result = finder.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);

        scanner.close();
    }
}
