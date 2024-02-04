public class Subsequence {
    static int findLongestConseqSubseq(int arr[], int N){
        if(arr==null || N ==0){
            return 0;

        }
        int longStreak=1;
        int currentStreak =1;
        for(int i=1;i<N;i++){
            if(arr[i]!= arr[i-1]){
                if(arr[i]==arr[i-1]+1){
                    currentStreak++;
                }else{
                    Math.max(currentStreak, longStreak);
                    currentStreak=1;

                }
            }
        }
        return Math.max(currentStreak,longStreak);
        
    }
}
