package companypractice;

import java.util.Scanner;

public class BinaryOperations {
    public static int Binary(String str) {

        int n = str.length();
        int ans = str.charAt(0) - '0';

        for (int i = 1; i < n; i = i + 2) {
            int cv = str.charAt(i + 1) - '0';
            char x = str.charAt(i);
            if (x == 'A') {
                ans = ans & cv;

            } else if (x == 'B') {
                ans = ans | cv;

            } else if (x == 'c') {
                ans = ans ^ cv;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("The output is: " + Binary(str));
        sc.close();
    }
}
