package Array.String;

import java.util.*;



public class potd{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        
        int textLength = text.length();
        int patternLength = pattern.length();
        
        for(int i=0; i<=textLength-patternLength; i++){
            if(text.substring(i, i+patternLength).equals(pattern)){
                ls.add(i+1);
            }
        }
        return ls;
    }
}