package Array;

class isUnique {
    public static void main(String[] args) {
        isUnique main = new isUnique();
        int[] intarr = { 2, 3, 3, 5 };
        boolean result = main.IsUnique(intarr);
        System.out.println(result);

    }

    public Boolean IsUnique(int[] intarr) {
        for (int i = 0; i < intarr.length; i++) {
            for (int j = i + 1; j < intarr.length; j++) {
                if (intarr[i] == intarr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
