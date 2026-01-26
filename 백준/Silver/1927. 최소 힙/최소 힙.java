import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<N;i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if (minHeap.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(minHeap.poll());
            }
            else
                minHeap.offer(x);
        }

    }


}


