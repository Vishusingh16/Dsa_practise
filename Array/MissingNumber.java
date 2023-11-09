package Array;

class MissingNumber {
    public static void main(String[] args) {
        MissingNumber main = new MissingNumber();
        int intarr[] = { 1, 2, 3, 4, 5, 10, 8, 9 };

        main.missingNumber(intarr);
    }

    public void missingNumber(int[] intArr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : intArr) {
            sum1 += i;

        }
        sum2 = 10 * (10 + 1) / 2;
        int difference = sum2 - sum1;
        System.out.println("The missing number is " + difference);
    }
}
