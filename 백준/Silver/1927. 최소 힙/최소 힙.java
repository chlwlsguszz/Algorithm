import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            int x = Integer.parseInt(br.readLine());
            if(x==0) {
                if(priorityQueue.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(priorityQueue.poll()).append("\n");
            }
            else
                priorityQueue.add(x);
        }

        System.out.println(sb);

    }

}