import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> edges;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        edges = new ArrayList<>();

        for(int i=0;i<N;i++)
            edges.add(new ArrayList<>());

        StringTokenizer st;
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                int x = Integer.parseInt(st.nextToken());
                if(x==1)
                    edges.get(i).add(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(bfs(i,j))
                    sb.append(1+" ");
                else
                    sb.append(0+" ");
            }
            sb.deleteCharAt(sb.length() -1);
            sb.append("\n");
        }

        //sb.deleteCharAt(sb.length()-1);

        System.out.println(sb);
    }

    static boolean bfs(int i, int j) {
         ArrayDeque<Integer> queue = new ArrayDeque<>();
         queue.add(i);
        boolean[] visited = new boolean[100];

         while(!queue.isEmpty()) {
             int x = queue.poll();
             for(int y : edges.get(x)) {
                 if(y == j)
                     return true;
                 if(!visited[y]) {
                     queue.offer(y);
                     visited[y] = true;
                 }
             }
         }

         return false;
    }
}