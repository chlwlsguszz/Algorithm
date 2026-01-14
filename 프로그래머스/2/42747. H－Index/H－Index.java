import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int n = citations.length;
        
        Arrays.sort(citations);
        
        for(int i=0;i<n;i++) {
            int h = n - i;
            
            if(h <= citations[i] )
                return h;
        }
        
        return 0;
        
        
        // 0 3 5 7 8 9 
        // 4편 이상 인용된 4개의 논문
        // h = 4
    }
}