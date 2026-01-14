class Solution {
    public int solution(String s) {
        StringBuilder sb;
        
        int min = s.length(); 
        
        // 압축 단위 : 1 ~ length/2
        for(int unit=1;unit<=s.length()/2;unit++) {
            sb = new StringBuilder();
            
            String prev = s.substring(0, unit);
            
            int i = unit;
            int count = 1;
            
            while(i <= s.length()-unit) {
                String cur = s.substring(i,i+unit);
                
                if (prev.equals(cur)) count++;
                
                else {
                    if (count > 1) 
                        sb.append(count+prev); 
                    else  {
                        sb.append(prev); 
                    }
                    prev = cur;
                    
                    count = 1;
                }
                i += unit;
            }
            if (count > 1) 
                    sb.append(count+prev); 
            else  
                    sb.append(prev); 
            sb.append(s.substring(i));
            min = Math.min(min, sb.length());
        }
        
        return min;
        
        
    }
}