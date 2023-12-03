package Resursion;

public class Evenlydivide {
    public static int countDigits(int n) {
        int count = 0;

        String nStr = Integer.toString(n);

        for (int i = 0; i < nStr.length(); i++) {

            int digit = Character.getNumericValue(nStr.charAt(i));

            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        int result = countDigits(n);
        System.out.println("Number of digits in " + n + " that evenly divide it: " + result);
    }
}
