import java.util.HashMap;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
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
