class Solution {
    public int solution(int N) {
        int max_gap = 0;
        int tmp_gap = 0;
        int tmp = 0;
        boolean one = false;
        while(N > 0){
            tmp = N % 2;
            if(tmp == 1){
                one = true;
            }
            if(tmp == 1 && tmp_gap > 0){
                if(tmp_gap > max_gap){
                    max_gap= tmp_gap;
                }
                tmp_gap = 0;
            }
            if(tmp == 0 && one){
                tmp_gap++;
            }
            N >>= 1;        
        }
        return max_gap;
    }
}
