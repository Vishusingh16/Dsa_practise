package companypractice;

import java.util.Scanner;

public class Rat {

    public static int consume(int[] arr, int n, int r, int unit) {
        n = arr.length;
        int sum = 0;

        if (n == 0) {
            return -1;

        }
        int food = r * unit;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum >= food) {
                return i + 1;

            }

        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = consume(arr, n, r, unit);
        System.out.println(result);
        sc.close();
    }
}