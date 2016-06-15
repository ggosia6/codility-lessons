/*
Task: Passing Cars
Lesson 05
*/

class Solution {
    public int solution(int[] A) {
        int pairs = 0;
        int zero_count = 0;
        int one_count = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == 0){
                zero_count++;
            }
            if(A[i] == 1){
                one_count++;
                pairs += zero_count;
            }           
            if(pairs > 1000000000){
                return -1;    
            }
        }
        return pairs;
    }
}
