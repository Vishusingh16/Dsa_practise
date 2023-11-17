package Array;

import java.util.Arrays;

class moveZeroe {
    public static void main(String[] args) {
        // Example usage
        int[] nums = { 0, 2, 0, 3, 4, 0, 5 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return; // No need to move elements for an array of length 0 or 1
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}
