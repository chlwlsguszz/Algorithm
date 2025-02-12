import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return - Integer.compare(o1, o2);
        }
    });

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("0")) {
                if(maxHeap.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(maxHeap.poll());
            }
            else {
                for(int j=0;j<Integer.parseInt(s);j++) {
                    maxHeap.add(Integer.parseInt(st.nextToken()));
                }
            }

        }
    }
}
