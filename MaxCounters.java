/*
 * Task: Max Counters
 * Source: codility.com - Lesson 04 - https://codility.com/programmers/task/max_counters/
 * Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
 */

class Solution {
    public int[] solution(int N, int[] A) {
        /* Returns the array containing values of counters */
        int [] counters = new int[N];
        int max_count = 0;
        int last_max = 0;
        int last_max_index = 0;
        for(int i=0;i<A.length;i++){
          if(A[i] == N+1){
            last_max = max_count;
            last_max_index = i;
          } else {
			if(counters[A[i]-1] < last_max){
				counters[A[i]-1] = last_max;
			}
            counters[A[i]-1] = counters[A[i]-1]+1;
            if(counters[A[i]-1] > max_count){
              max_count = counters[A[i]-1];    
            }
          }    
        }
        if(last_max > 0){
          for(int i=0;i<N;i++){
              counters[i] = last_max;    
          }
          for(int i=last_max_index+1;i<A.length;i++){
            counters[A[i]-1] = counters[A[i]-1]+1;
            if(counters[A[i]-1] > max_count){
              max_count = counters[A[i]-1];    
            }    
          }
        }
        
        return counters;
    }
}
