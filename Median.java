public class Median {

    // median of two sorted array

    double getMed(int a1[], int a2[]) {
        int n1 = a1.length, n2 = a2.length;
        int begin = 0, endl = n1;

        while (begin <= endl) {
            int i1 = (begin + endl) / 2;
            int i2 = (n1 + n2 + 1) / 2 - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : a1[i1];
            int min2 = (i1 == n2) ? Integer.MAX_VALUE : a2[i2];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a1[i1 - 1];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : a2[i2 - 1];

            if (max1 <= min2 && max2 <= min1) {

                return ((double) Math.max(max1, max2) + Math.min(min1, min2)) / 2;
            } else if (max1 > min2) {
                endl = i1 - 1;

            } else {
                begin = i1 + 1;
            }

        }
        return -1;
    }
}