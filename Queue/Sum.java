class Sum {
    public static void main(String[] args) {
        Sum main = new Sum();
        var result = main.sumofdigits(6666);
        System.out.println(result);
    }

    public int sumofdigits(int n) {
        if (n < 0 || n == 0) {
            return 0;
        }
        return n % 10 + sumofdigits(n / 10);
    }
}