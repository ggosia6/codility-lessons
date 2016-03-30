/*
 * Task: Tape Equilibrium
 * Source: codility.com - Lesson 03 - https://codility.com/programmers/task/tape_equilibrium/
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */

class Solution {
    /* Returns the minimaln absolute value of divided tape elements */
    public int solution(int[] A) {
        int min = 999999;
        int suma_lewa = 0;
        int suma = 0;
        int tmp = 0;
        int suma_prawa = 0;
        for(int i=0;i<A.length;i++){
            suma += A[i];
        }
        suma_prawa = suma;
        for(int i=0;i<A.length-1;i++){
            tmp = 0;
            suma_lewa += A[i];
            suma_prawa -= A[i];
            tmp = Math.abs(suma_lewa-suma_prawa);
            if(tmp < min){
                min = tmp;
            }
        }
        //System.out.println(suma_lewa + "<->" + suma_prawa);
        return min;
    }
}
