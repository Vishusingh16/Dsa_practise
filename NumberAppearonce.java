public class NumberAppearonce {
    /*
     * Time Complexity: O(N ^ 2)
     * 
     * Space Complexity: O(1)
     * 
     * Where 'N' is the number of elements in the array 'Arr'.
     */

    public static int getSingleElement(int[] arr) {
        int n = arr.length;
        int ans = 0;

        // Traversing through the array.
        for (int i = 0; i < n; ++i) {
            boolean pass = false;

            // Checking if there is another number in the array equal to 'Arr[i]'.
            for (int j = 0; j < n && !pass; ++j) {
                if (i == j)
                    continue;
                if (arr[i] == arr[j])
                    pass = true;
            }

            // If there is no element equal to 'Arr[i]', then 'Arr[i]' is the answer.
            if (!pass)
                ans = arr[i];
        }
        return ans;
    }
}
