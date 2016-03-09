/*
 * Task: Cyclic Rotation
 * Source: codility.com - Lesson 02 - https://codility.com/programmers/task/cyclic_rotation/
 * Rotate an array to the right by a given number of steps.
 */
 
class Solution {
    /* This method returns K times rotated array A */
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
