import java.util.*;

public class Productnumber {

    static int product(int x, int y) {

        if (x < y) {
            return product(y, x);
            // System.out.println(product(x, y));
        }

        else if (y != 0) {
            return (x + product(x, y - 1));
        }

        else {
            return 0;

        }

    }

    public static void main(String[] args) {
        int x = 2, y = 6;
        System.out.println(product(x, y));
    }

}
