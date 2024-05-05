public class SqRoot {

    public static double sqrt(double num) {
        return sqrtHelper(num, 0, num);

    }

    private static double sqrtHelper(double num, double low, double high) {
        double mid = (low + high) / 2;
        double square = mid * mid;

        // if number is close to the mid then return mid

        if (Math.abs(square - num) < 0.0001) {
            return mid;
        } else if (square > num) {
            return sqrtHelper(num, low, mid);

        } else {
            return sqrtHelper(num, low, high);

        }
    }

    public static void main(String[] args) {
        double number = 25;
        System.out.println("Square of the number " + number + "is" + sqrt(number));
    }

}
