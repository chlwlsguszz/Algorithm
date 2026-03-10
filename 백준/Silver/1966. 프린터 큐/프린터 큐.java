
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        Deque<Document> queue = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int t=0;t<T;t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++) {
                int p = Integer.parseInt(st.nextToken());
                Document doc = new Document();
                doc.priority = p;
                map.put(p, map.getOrDefault(p, 0)+1);
                if(i==M) doc.target = true;
                queue.offer(doc);
            }


            int count = 0;
            while(!queue.isEmpty()) {
                Document doc = queue.poll();
                int maxPriority = 1;
                for(int i=9;i>0;i--)
                    if(map.getOrDefault(i, 0) != 0) {
                        maxPriority = i;
                        break;
                    }
                if(doc.priority < maxPriority) {
                    queue.offer(doc);
                }
                else {
                    count++;
                    map.put(doc.priority, map.getOrDefault(doc.priority, 0) - 1);
                    if (doc.target) {
                        System.out.println(count);
                        break;
                    }
                }
            }
            queue.clear();
            map.clear();
        }

       }

       static class Document {
            int priority;
            boolean target = false;
       }

}


