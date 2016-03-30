/*
 * Task: Frog Jmp
 * Source: codility.com - Lesson 03 - https://codility.com/programmers/task/frog_jmp/
 * Count minimal number of jumps from position X to Y.
 */

class Solution {
    /* Return minimal number of frog jumps by D from position X to Y */
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil((double)(Y-X)/D);
    }
}
