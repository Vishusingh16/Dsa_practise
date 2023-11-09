package Array;

class maxProduct {
    public static void main(String[] args) {
        maxProduct main = new maxProduct();
        int[] intArr = { 10, 60, 30, 40, 50 };
        String pairs = main.MaxProduct(intArr);
        System.out.println("The maximum product of two elements in the array is: " + pairs);
    }

    public String MaxProduct(int[] intarr) {
        int MaxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intarr.length - 1; i++) {
            for (int j = i + 1; j < intarr.length; j++) {
                if ((intarr[i] * intarr[j]) > MaxProduct) {
                    MaxProduct = (intarr[i] * intarr[j]);
                    pairs = Integer.toString(intarr[i]) + "," + Integer.toString(intarr[j]);
                }
            }
        }
        return pairs;
    }
}
