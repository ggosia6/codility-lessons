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
