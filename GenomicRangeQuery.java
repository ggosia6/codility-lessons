// you can also use imports, for example:
import java.util.Map;
import java.util.HashMap;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public int[] prefix_sum(int[] A){
        int n=A.length;
        int[] P = new int[n+1];
        for(int k=1;k<n+1;k++){
            P[k] = P[k-1]+A[k-1];
        }
        return P;
    }

    public int[] solution(String S, int[] P, int[] Q) {
        Map<Character,Integer> costs = new HashMap<>();
        costs.put('A',1);
        costs.put('C',2);
        costs.put('G',3);
        costs.put('T',4);
        int[] atab = new int[S.length()];
        atab[0] = 0;
        int[] ctab = new int[S.length()];
        ctab[0] = 0;
        int[] gtab = new int[S.length()];
        gtab[0] = 0;
        int[] ttab = new int[S.length()];
        ttab[0] = 0;
        for(int j=0;j<S.length()-1;j++){
            String s = S.substring(j,j+1); 
            switch(s){
                case "A":
                atab[j]++;
                break;
                case "C":
                ctab[j]++;
                break;
                case "G":
                gtab[j]++;
                break;
                case "T":
                ttab[j]++;
                break;  
            }
        }
        int[] patab = prefix_sum(atab);
        int[] pctab = prefix_sum(ctab);
        int[] pgtab = prefix_sum(gtab);
        int[] pttab = prefix_sum(ttab);
        
        int[] tab = new int[P.length];
        for(int i=0;i<P.length;i++){
            int start = P[i];
            int end = Q[i];
            if(S.length() == 1) {tab[i] = costs.get(S.charAt(0)); continue; }
			if(S.length() == 2) {tab[i] = Math.min(costs.get(S.charAt(start)),costs.get(S.charAt(end))); continue; }
            if(start == end) {tab[i] = costs.get(S.charAt(start)); continue; }
            if(patab[end+1]-patab[start] > 0) { tab[i] = 1; continue; }
            if(pctab[end+1]-pctab[start] > 0) { tab[i] = 2; continue; }   
            if(pgtab[end+1]-pgtab[start] > 0) { tab[i] = 3; continue; } 
            if(pttab[end+1]-pttab[start] > 0) { tab[i] = 4; continue; } 
        }
        return tab;
    }
}
