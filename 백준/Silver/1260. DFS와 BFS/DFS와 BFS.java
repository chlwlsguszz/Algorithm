import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> edges;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        edges = new ArrayList<>();
        for(int i=0;i<N+1;i++) {
            edges.add(new ArrayList<>());
        }

        visited = new boolean[N+1];
        Arrays.fill(visited, false);

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges.get(a).add(b);
            edges.get(b).add(a);
        }

        for(int i=0;i<N+1;i++) {
            edges.get(i).sort(Comparator.naturalOrder());
        }

        dfs(V);
        sb.setLength(sb.length() - 1);
        sb.append("\n");
        Arrays.fill(visited, false);

        bfs(V);
        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }

    static void dfs(int V) {
        visited[V] = true;
        sb.append(V).append(" ");

        for(int target : edges.get(V)) {
            if(!visited[target]) {
                dfs(target);
            }
        }
    }

    static void bfs(int V) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(V);
        visited[V] = true;

        while(!queue.isEmpty()) {
            int x = queue.poll();
            sb.append(x).append(" ");
            
            for(int target: edges.get(x))
                if(!visited[target]) {
                    visited[target] = true;
                    queue.offer(target);
                }
        }
    }
}