public class palindrome {
    // 1. Write a program to check if the given string is palindrome or not.
    public static int reverse(int x) {
        int back = 0;
        while (x != 0) {
            int digit = x % 10;
            back = back * 10 + digit;
            x /= 10;

        }
        return back;

    }

    public static void main(String[] args) {

        int x = 121;
        int back = reverse(x);
        if (x == back) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println(" not palindrome");
        }
    }
}
