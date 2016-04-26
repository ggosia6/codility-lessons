// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;
//import java.util.Iterator;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        int value = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = A.length;
        for(int i=0;i<N;i++){
            if(cache.containsKey(A[i])){
                value = cache.get(A[i]) + 1;
            } else {
                value = 1;
            }
            cache.put(A[i],value);
            if(A[i] < min){ min = A[i];}
            if(A[i] > max){ max = A[i];}
        }
        // Single element
        if(N == 1){
			if(A[0] == 1)
				return 2;
			else
				return 1;
		}
        if(max <= 0 || min > 1){
            return 1;    
        }  
        int minimum = Math.max(1,min);
        for(int j=minimum;j<=max+1;j++){
            if(!cache.containsKey(j)){
                return j;    
            }    
        }
        return 1;
    }
}
