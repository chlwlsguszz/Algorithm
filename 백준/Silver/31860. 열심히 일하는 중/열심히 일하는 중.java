import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return - Integer.compare(o1,o2);
        }
    });


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //중요한 일부터 처리하기 위해 maxHeap에 job 입력
        for(int i=0;i<N;i++) {
            maxHeap.add(Integer.parseInt(br.readLine()));
        }

        int todayJob = -1; // todayJob is Empty
        int dayCount = 0;
        int todayFeel = 0;

        StringBuilder sb = new StringBuilder();

        while(!maxHeap.isEmpty()) {
            dayCount++;
            todayJob = maxHeap.poll();
            todayFeel = (todayFeel/2) + todayJob;
            sb.append(todayFeel + "\n");

            todayJob = todayJob-M;

            if(todayJob > K)
                maxHeap.add(todayJob);
        }
        System.out.println(dayCount);
        System.out.println(sb);


    }
}

