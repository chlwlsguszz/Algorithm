import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        for(int i=0;i<progresses.length;i++) {
            int remainTime = (100 - progresses[i]) / speeds[i]; 
            if( (100-progresses[i]) % speeds[i] != 0) 
                remainTime++;
            queue.offer(remainTime);
        }
        
        List<Integer> list = new ArrayList<>();
        
        int day = 1;
        while(!queue.isEmpty()) {
            int added = 0;
            if(queue.peek() <= day) { 
                while((!queue.isEmpty() && queue.peek() <= day)){
                    queue.poll();
                    added++;
                }
                list.add(added);
            }
            day++;
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}