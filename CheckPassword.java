package companypractice;

import java.util.*;

public class CheckPassword {
    public static int checkPassword(String str) {

        if (str.length() < 4) {
            return 0;

        }

        if (Character.isDigit(str.charAt(0))) {
            return 0;

        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == '/' || Character.isWhitespace(ch)) {
                return 0;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;

            }
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }

            if (hasDigit && hasUpperCase) {
                return 1;
            }

        }

        return '0';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password to : ");
        String password = sc.nextLine();
        int result = checkPassword(password);

        if (result == 1) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Not a valid Password ");
        }
        sc.close();

    }
}
