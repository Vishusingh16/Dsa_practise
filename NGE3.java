import java.util.*;

public class NGE3 {

    public static String nge(String str) {
        char[] arr = str.toCharArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;

        }
        if (i == -1) {
            return "-1";

        }
        int k = arr.length - 1;
        while (arr[i] > arr[k]) {
            k--;

        }

        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        // concatination done
        String res = "";
        for (int j = 0; j <= i; j++) {
            res += arr[j];
        }
        // contactinating in reverse order
        for (int j = arr.length - 1; j > i; j--) {
            res = res + arr[j];

        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String res = nge(num);
        System.out.println(res);

    }
}
