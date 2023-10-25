// Do it again 
class Dtob {
    public static void main(String[] args) {
        Dtob main = new Dtob();
        var result = main.dtob(11);

    }

    public int dtob(int n) {
        if (n == 0) {
            return 0;

        }
        return n % 2 + dtob(n / 2);
    }
}