import java.util.Arrays;

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here        
   R = matrix.length;
   C = matrix[0].length;
    
    
    int [] flattenedIndex = new int[R*C];
    int index = 0;
    for(int i =0; i<R ;i++){
        for(int j =0;j<C;j++){
            flattenedIndex[index++]= matrix[i][j];
            
        }    }
        
        Arrays.sort(flattenedIndex);
        
        int medianIndex = flattenedIndex.length/2;
         return flattenedIndex[medianIndex];
        
    }
}