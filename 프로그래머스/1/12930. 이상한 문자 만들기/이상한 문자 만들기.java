class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        //String[] sArray = s.split(" ");
        
        
        boolean even = true;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                sb.append(c);
                even = true; 
                continue;   
            }
            if(even) {
                even = false;
                sb.append(Character.toUpperCase(c));
            }
            else {
                even = true;
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
        
        
    }
}