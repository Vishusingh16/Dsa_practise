public#User function Template for python3
class Solution:

def rowWithMax1s(self,arr, n, m):
        # code here
        i = 0
        j = m - 1
        temp = -1
         
        while (i<n and j>=0):
            if(arr[i][j] == 1):
                j -= 1
                temp = i
            elif(arr[i][j] == 0):
                        i += 1
                        
        return temp
 question {
    
}
