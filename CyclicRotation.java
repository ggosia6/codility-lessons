/*
 * Task: Rotate an array to the right by a given number of steps.
 */

class Solution {
    public int[] solution(int[] A, int K) {
        int[] ret = new int[]{};
        int size = A.length;
        int index = 0;
        if(size > 0){
            ret = new int[size];
            for(int i=0;i<size;i++){
                index = (i+K) % size;
                ret[index] = A[i];
            }
        }
        return ret;
    }
}
