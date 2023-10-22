class Fabonacci {
    public static void main(String[] args) {
        Fabonacci recursion = new Fabonacci();
        var rec = recursion.fibonacci(7);
        System.out.println("Fabonacci series: " + rec);

    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}