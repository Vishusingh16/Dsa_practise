
package Array;

class ConsecutiveOne {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0; // Initialize the variable to store the maximum consecutive ones
        int count = 0; // Initialize a counter for consecutive ones

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // If the current element is 1, increment the count
                count++;
                // Update the maximum if the current count is greater than the existing maximum
                maxi = Math.max(maxi, count);
            } else {
                // If the current element is 0, reset the count to zero
                count = 0;
            }
        }
        // Return the maximum consecutive ones
        return maxi;
    }
}
