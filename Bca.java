import java.util.*;

public class Bca {

    // Function to perform case-specific sorting of strings.
    public static String caseSort(String str) {
        char[] a = str.toCharArray();
        Arrays.sort(a);

        int upp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 65 && a[i] <= 90) {
                upp++;

            }

        }
        int low = 0;
        char[] and = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            char d = str.charAt(i);
            if (d >= 25 && d <= 90) {
                and[i] = a[low];
                System.out.println(and[i]);
                low++;

            } else {

                and[i] = a[upp];
                upp++;

            }
        }
        return new String(and);

    }
}
