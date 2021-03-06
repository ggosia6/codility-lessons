/*
 * Task: Perm Check
 * Source: codility.com - Lesson 04 - https://codility.com/programmers/task/perm_check/
 * Check whether array A is a permutation.
 */

import java.util.HashMap;

class Solution {
    /* Returns 1 if A is a permutation and 0 otherwise */
    public int solution(int[] A) {
        int value = 0;
        int test = 0;
        int isPerm = 1;
        int max = 0;
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++){
            cache.put(A[i],0);
            if(A[i] > max){
                max = A[i];    
            }
        }
        for(int i=0;i<A.length;i++){
            value = cache.get(A[i])+1;
            cache.put(A[i],value);
        }
        for(int i=1;i<A.length || i<max;i++){           
            try {
                test = cache.get(A[i]);
                if(test != 1){
                    isPerm = 0;
                    break;
                }
            }
            catch(Exception e){
                isPerm = 0;
                break;
            }
        }
        return isPerm;
    }
}
