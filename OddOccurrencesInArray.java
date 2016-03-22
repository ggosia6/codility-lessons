import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(int[] A) {
        int value = 0;
        int number = 0;
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++){
            cache.put(A[i],0);    
        }
        for(int i=0;i<A.length;i++){
            value = cache.get(A[i]) + 1;
            cache.put(A[i],value);
        }
        Iterator<Integer> keySetIterator = cache.keySet().iterator(); 
        while(keySetIterator.hasNext()){ 
            Integer key = keySetIterator.next();
            if(cache.get(key) == 1) {
                number = key; break;
                }
            }

        return number;
    }
}
