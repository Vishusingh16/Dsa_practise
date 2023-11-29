package Resursion;

public class totalpaths {

    public static int countpaths(int i, int j, int m, int n) {
        if (i == n || j == m) {
            return 0;

        }
        if (i == n - 1 && j == m - 1) {
            return 1;

        }
        int downpaths = countpaths(i + 1, j, m, n);

        int rightpaths = countpaths(i, j + 1, m, n);
        return downpaths + rightpaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalpath = countpaths(0, 0, n, m);
        System.out.println(totalpath);

    }
}
