import java.util.*;

public class Pair {

    static boolean hasPairWithSum(int[] arr, int x) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = x - arr[i];

            if (set.contains(complement)) {
                return true;

            }
            set.add(arr[i]);

        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 10;
        boolean res = hasPairWithSum(arr, x);
        System.out.println("this contains" + x + "has sum" + res);
    }

}
