public class GCD {
    public static int gcd(int x, int y) {
        while (x > 0 && y > 0) {
            if (x > y) {
                x = x % y;

            } else {
                y = y % x;

            }
        }
        if (x == 0) {
            return y;

        } else {
            return x;

        }
    }

    public static void main(String[] args) {

        int ans = gcd(12, 52);
        System.out.println(ans);
    }

}
