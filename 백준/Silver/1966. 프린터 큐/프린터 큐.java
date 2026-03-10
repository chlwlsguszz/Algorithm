
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        Deque<Document> queue = new ArrayDeque<>();
        int[] priorityArray = new int[10];
        Arrays.fill(priorityArray, 0);


        for(int t=0;t<T;t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++) {
                int p = Integer.parseInt(st.nextToken());
                Document doc = new Document();
                doc.priority = p;
                priorityArray[p]++;
                if(i==M) doc.target = true;
                queue.offer(doc);
            }


            int count = 0;
            int maxPriority = 1;
            while(!queue.isEmpty()) {
                Document doc = queue.poll();
                for(int i=9;i>0;i--)
                    if(priorityArray[i]>0) {
                        maxPriority = i;
                        break;
                    }
                if(doc.priority < maxPriority) {
                    queue.offer(doc);
                }
                else {
                    count++;
                    priorityArray[doc.priority]--;
                    if (doc.target) {
                        System.out.println(count);
                        break;
                    }
                }
            }
            queue.clear();
            Arrays.fill(priorityArray, 0);
        }

       }

       static class Document {
            int priority;
            boolean target = false;
       }

}


