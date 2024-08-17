package companypractice;

import java.util.Scanner;

import Oops.Person.main;

public class Multiple {
    public static int multiple(int m, int n) {
        int i = 0;
        int sum = 0;
        for (i = m; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;

            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of m :");
        int m = sc.nextInt();
        System.out.println("Give the value of n :");
        int n = sc.nextInt();
        int result = multiple(m, n);
        System.out.println(result);
        sc.close();

    }
}
