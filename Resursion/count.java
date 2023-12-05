package Resursion;

public class count {
    public static long sumFirstN(long n) {

        long count = 0;
        // Write your code here.
        for (int i = 1; i <= n; i++) {
            count = count + i;

        }
        return count;

    }

    public static void main(String[] args) {
        long result = sumFirstN(5);
        System.out.println("Sum of the first 5 numbers: " + result);

    }
}