package Array;

public class max {

    public static int findsum(int[] A, int N) {
        if (N == 0) {
            return 0;

        }
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (min < A[i]) {
                min = A[i];
            } else if (max > A[i]) {
                max = A[i];
            }

        }
        int sum = max + min;
        return sum;

    }

    public static void main(String[] args) {
        int[] A = { -2, -1, 3, -4, 2, 4, 1 };
        System.out.println("The maximum possible sum is " + findsum(A, A.length));
    }

}
