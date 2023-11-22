public class nby2 {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        int result = majorityElement(arr);
        System.out.println("The majority element is: " + result);

    }

    public static int majorityElement(int[] v) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] == v[j]) {
                    count++;
                    if (count > v.length / 2) {
                        return v[i];
                    }
                }
            }
            count = 0; // Reset count for the next element
        }
        return 0;
    }
}