import java.util.HashSet;


    class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashSet<Long> set = new HashSet<>();
        for(long i : a1){
            set.add(i);
            
        }
        for(long i:a2){
            if(!set.contains(a1)){
                
                return "Yes";
                
            }
        }
        
        
        return "No";
        
    }
}

