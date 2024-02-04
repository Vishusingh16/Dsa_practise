package Hashing;

public class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
   
        
     long result = arr[0];
     long  minProduct = arr[0];
     long maxProduct = arr[0];
     for(int i=1;i<n;i++){
         if(arr[i]<0){
             long temp = maxProduct;
             maxProduct = minProduct;
             minProduct = temp ;
         }
         
         maxProduct = Math.max(arr[i], maxProduct*arr[i]);
         minProduct = Math.min(arr[i], minProduct*arr[i]);
         
         result = Math.max(result, maxProduct);
         
     }
    return result;
    
        
    }
} {
    
}
