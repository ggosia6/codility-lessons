/*
 * Task: Tape Equilibrium
 * Source: codility.com - Lesson 03 - https://codility.com/programmers/task/tape_equilibrium/
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */

class Solution {
    /* Returns the minimal absolute value of divided tape elements */
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int left_sum = 0;
        int right_sum = 0;
        int sum = 0;
        int tmp = 0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
        }
        right_sum = sum;
        for(int i=0;i<A.length-1;i++){
            tmp = 0;
            left_sum += A[i];
            right_sum -= A[i];
            tmp = Math.abs(left_sum-right_sum);
            if(tmp < min){
                min = tmp;
            }
        }
        return min;
    }
}
