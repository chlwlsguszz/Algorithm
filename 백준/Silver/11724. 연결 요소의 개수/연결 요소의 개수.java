import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static int N, M;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visited = new boolean[N+1];

        for(int i=0;i<N+1;i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int count = 0;
        for(int i=1;i<=N;i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int x) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        visited[x] = true;
        stack.push(x);

        while(!stack.isEmpty()) {
            int target = stack.pop();
            for (int y : graph.get(target)) {
                if (!visited[y]) {
                    visited[y]=true;
                    stack.push(y);
                }
            }
        }
    }

}