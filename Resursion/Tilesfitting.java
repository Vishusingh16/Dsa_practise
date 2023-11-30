package Resursion;

public class Tilesfitting {

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;

        }

        if (n < m) {
            return 1;

        }

        int verticallyplacetile = placeTiles(n - m, m);
        int horizontallyplacetile = placeTiles(n - 1, m);
        return verticallyplacetile + horizontallyplacetile;

    }

    public static void main(String[] args) {

        int n = 3, m = 3;
        System.out.println(placeTiles(n, m));

    }

}
