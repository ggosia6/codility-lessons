/* MinAvgTwoSlice */

class Solution {
	
	public int[] prefix_sum(int[] A) {
        int n = A.length;
        int[] P = new int[n + 1];
        for (int k = 1; k < n + 1; k++) {
            P[k] = P[k - 1] + A[k - 1];
        }
        return P;
    }
	
	public int count_total(int[] P, int x, int y) {
		return P[y + 1] - P[x];
	}
    public int solution(int[] A) {
        int [] ps = prefix_sum(A);
        int minIndex = 0;
		double tmpAvg = 0;
		// length 2
		double minAvg = count_total(ps,0,1)/2.0;
		for(int i=1;i<A.length-1;i++){
			tmpAvg = count_total(ps,i,i+1)/2.0;
			if(tmpAvg < minAvg){
				minIndex = i;
				minAvg = tmpAvg;
			}
		}	
		// length 3
		if(A.length > 2){
			for(int i=0;i<A.length-2;i++){
				tmpAvg = count_total(ps,i,i+2)/3.0;
				if(tmpAvg < minAvg){
					minIndex = i;
					minAvg = tmpAvg;
				}
			}
		}
		return minIndex;
    }
}
