/*
TapeEquilibrium
*/

class Solution {
    public int solution(int[] A) {
        int min = 999999;
        int suma_lewa = 0;
        int suma_prawa = 0;
        int suma = 0;
        int tmp = 0;
        for(int i=0;i<A.length;i++){
            suma += A[i];
        }
        for(int i=0;i<A.length;i++){
            tmp = 0;
            suma_lewa += A[i];
            suma_prawa = suma - A[i];
            tmp = Math.abs(suma_lewa-suma_prawa);
            if(tmp < min){
                min = tmp;
            }
        }
        return min;
    }
}
