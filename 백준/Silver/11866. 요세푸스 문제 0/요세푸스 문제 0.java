import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Queue<Integer> queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        for(int i=1;i<=N;i++) {
            queue.add(i);
        }


        System.out.print("<");
        for(int i=0;i<N;i++) {
            for(int j=0;j<K-1;j++) {
                int temp = queue.poll();
                queue.add(temp);
            }
            System.out.print(queue.poll());
            if(i < N-1)
                System.out.print(", ");
        }
        System.out.print(">");

    }

}


