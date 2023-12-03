package Resursion;

class Gcd {
    public static void main(String[] args) {
        Gcd main = new Gcd();
        var result = main.gcd(4, 8);
        System.out.println(result);

    }

    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;

        }
        return gcd(b, a % b);
    }
}