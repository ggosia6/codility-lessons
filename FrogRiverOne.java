*
 * Task: Frog River One
 * Source: codility.com - Lesson 04 - https://codility.com/programmers/task/frog_river_one/
 * Find the earliest time when a frog can jump to the other side of a river.
 */

import java.util.HashMap;

class Solution {
    /* Returns the first index where leaves are laying down the whole width of the river */
    public int solution(int X, int[] A) {
        int max = 0;
        int ret = -1;
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for(int i=1;i<=X;i++){
            cache.put(i,-1);
        }
        for(int i=0;i<A.length;i++){
            if(cache.get(A[i]).equals(-1)){
                cache.put(A[i],i);
                max++;
                if(max == X){
                    ret = i;
                }
            }
        }
        return ret;
    }
}
