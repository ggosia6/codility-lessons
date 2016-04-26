/*
 * Task: Missing Integer
 * Source: codility.com - Lesson 04 - https://codility.com/programmers/task/missing_integer/
 * Find the minimal positive integer not occurring in a given sequence.
 */

import java.util.HashMap;

class Solution {
    public int solution(int[] A) {
    	/* Function returns the  minimal positive integer not occurring in a given sequence */
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        int value = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = A.length;
        // Count elements and find max & min
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
        // Single element solution
        if(N == 1){
			if(A[0] == 1)
				return 2;
			else
				return 1;
		}
	// For negative only numbers of greater than one minimum value
        if(max <= 0 || min > 1){
            return 1;    
        }  
        // Typical solution
        int minimum = Math.max(1,min);
        int maximum = Math.max(max+1,Integer.MAX_VALUE);
        for(int j=minimum;j<=maximum;j++){
            if(!cache.containsKey(j)){
                return j;    
            }    
        }
        return 1;
    }
}
