import java.util.*;

public class Sumrecursion {

    public static int recursum(int n) {

        if (n <= 1) {
            return n;

        }
        return n + recursum(n - 1);

    }

    public static void main(String args[]) {
        int n = 7;
        System.out.println(recursum(n));
    }

}
