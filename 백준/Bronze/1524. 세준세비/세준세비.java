import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++) {
            PriorityQueue<Integer> S_heap = new PriorityQueue<>();
            PriorityQueue<Integer> B_heap = new PriorityQueue<>();

            br.readLine();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                S_heap.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int j=0;j<M;j++) {
                B_heap.add(Integer.parseInt(st.nextToken()));
            }

            while(!S_heap.isEmpty() && !B_heap.isEmpty()) {
                if(S_heap.peek() < B_heap.peek())
                    S_heap.remove();
                else
                    B_heap.remove();
            }

            if(S_heap.isEmpty() && B_heap.isEmpty())
                System.out.println("C");
            else if(B_heap.isEmpty())
                System.out.println("S");
            else
                System.out.println("B");
        }
    }
}

