public class Solution {
    static int circularSubarraySum(int a[], int n) {
        
        // Get the maximum sum of a normal subarray using Kadane's Algorithm
        int normalSubarray = kadane(a, n);
        
        // If all numbers are negative, return the maximum of them
        if (normalSubarray < 0) {
            return normalSubarray;
        }
