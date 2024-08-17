package companypractice;

import java.util.*;

import Oops.Person.main;

public class OperationChoices {
    public static int operation(int c, int a, int b) {
        if (c == 1) {
            return a + b;
        }
        if (c == 2) {
            return a - b;
        }
        if (c == 3) {
            return a * b;
        }
        if (c == 4) {
            return a / b;

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        int result = operation(c, a, b);
        System.out.println("Result : " + result);
        sc.close();
    }

}
