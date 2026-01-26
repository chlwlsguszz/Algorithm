import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int i=0;i<N;i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if (maxHeap.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(maxHeap.poll());
            }
            else
                maxHeap.offer(x);
        }

    }


}


