/* Codility.com - Lesson 5 - CountDiv
 * Compute number of integers divisible by k in range [a..b]. 
 */

class Solution {
    public int solution(int A, int B, int K) {
		// A == B
		if(A == B){
			return A % K == 0 ? 1 : 0;	
		}
		// A < B
		if(A % K == 0 || B % K == 0){
			return (B-A)/K+1;
		}
		if(A % K != 0 && B % K != 0){
			return (B-A)/K + (K/A == 1 ? 1 : 0);
		}
		return 0;
    }
}
