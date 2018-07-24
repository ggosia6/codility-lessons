/* Task: Distinct
   Source: codility.com - Lesson 06
 * Compute number of distinct values in an array.
 */

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
