
class Solution {
  public String longestSubstring(String s, int n) {
        
        int[][] dp = new int[n+1][n+1];
        int res_length = 0;
        int i, index = 0;
        for(i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if(j-i > dp[i-1][j-1] && s.charAt(i-1) == s.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    if(dp[i][j] > res_length){
                        res_length = dp[i][j];
                        index = Math.max(i, index);
                    }
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        String res = "";
        if(res_length > 0){
            for(i = index - res_length + 1; i <= index; i++){
                res += s.charAt(i-1);
            }
        }
        if(res.equals("")){
            res = "-1";
        }
        return res;
    }
}