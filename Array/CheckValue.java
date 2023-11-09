package Array;

class CheckValue {
    public static void main(String[] args) {
        CheckValue sc = new CheckValue();

    }

    public void checkValue(int[] intarr, int value) {
        for (int i = 0; i < intarr.length; i++) {
            if (intarr[i] == value) {
                System.out.println(" The value is found at the index of " + i);

            } else {
                System.out.println(value + "is not found");
            }
        }
    }
}
