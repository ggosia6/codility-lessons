/* PermMissingElem */

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int suma = 0;
        int sumaN = 0;
        if(N > 0){
            for(int i=0;i<N;i++){
            suma += A[i];   
            }
            for(int i=1;i<=N+1;i++){
            sumaN += i;    
            }
            return sumaN-suma;
        } else { 
            return 1;
        }
    }
}
