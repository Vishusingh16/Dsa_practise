class SubsetProblem {

    public static boolean inSubsetproblem(int N,int arr[],int sum){

        if(N+==0){
            return (sum==0)?1:0;

        }
        return countSubset(arr,N-1,sum)+countSubset(arr,N-1,sum-arr[N-1]);
    }
}