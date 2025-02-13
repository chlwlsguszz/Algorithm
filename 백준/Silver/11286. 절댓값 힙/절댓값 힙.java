import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(Math.abs(o2) == Math.abs(o1))
                return Integer.compare(o1, o2);
            else
                return Integer.compare(Math.abs(o1), Math.abs(o2));
        }
    });

    public static void main(String[] args) throws IOException {
       int N = Integer.parseInt(br.readLine());
       for(int i=0;i<N;i++) {
           int x = Integer.parseInt(br.readLine());
           if (x==0) {
               if(minHeap.isEmpty())
                   System.out.println(0);
               else
                   System.out.println(minHeap.poll());
           }
           else
               minHeap.add(x);
       }
    }
}
