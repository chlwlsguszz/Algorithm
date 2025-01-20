class Solution {
    
    
    
    public long solution(int n, int[] times) {
        long max = (long)1000000000 * (long)1000000000;
        long min = 1;
        long answer = max;
        
        while(min <= max) {
            long mid = (min + max) / 2;
            long timeCount = 0;
            for (int time : times) {
                timeCount += (mid / time);
            }
            if( n <= timeCount) {
                answer = Math.min(answer, mid);
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        
        return answer;
    }
}