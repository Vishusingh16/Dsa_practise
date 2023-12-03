import java.util.*;

public class CountDigits2 {

    public static int count(int n) {
        String s = Integer.toString(n);
        return s.length();

    }

    public static void main(String[] args) {
        int n = 1234556;
        System.out.println("Number of digits in " + n + " is: " + count(n));
    }

}
