public class CountDigits {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;

        }
        return count;

    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("count Digits of n :" + countDigits(n));
    }

}