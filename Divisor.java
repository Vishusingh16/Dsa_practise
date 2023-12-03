public class Divisor {

    public static int sumOfAllDivisor(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (n / i) * i;

        }

        return sum;

    }

    public static void main(String[] args) {

        sumOfAllDivisor(36);
    }
}
