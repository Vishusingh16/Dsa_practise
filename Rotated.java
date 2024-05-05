class Rotated{

    static int Search(int array[], int target)
	{
	int n = array.length;
	 int x=array.length-1;
	int low =0, high =n-1;
	while(low<= high){
	    int mid = (low+high)/2;
	    
	    
	    if(array[mid]==target){
	        return mid;
	        
	    }
	    if(array[low]<array[mid]){
	        if(target>=array[low]&& target<array[mid]){
	            high=mid -1;
	            
	        }
	        else{
	            low=mid+1;
	            
	        }
	    }
	    else{
	        if(target>array[mid]&& target<=array[high]){
	            low=mid+1;
	            
	        }
	        else{
	            high=mid-1;
	            
	        }
	    }
	    
	}
	
	  
	  return -1;
	  
	  
	}
}