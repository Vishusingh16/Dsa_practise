package Resursion;

public class Nname {

    public static void recursion(int n) {

        printrecursion(1, n);

    }

    public static void printrecursion(int x, int n) {
        if (x > n) {
            return;

        }
        System.out.println(" vaishnav singh" + " ");
        x++;
        printrecursion(x, n);

    }

    public static void main(String[] args) {
        int n = 5;

    }

}
