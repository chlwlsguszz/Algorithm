import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int graph[][];
    static boolean[] visited = new boolean[1001];
    static int n, m;
    static Queue<Integer> queue = new LinkedList<>();

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String str[] = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);

        graph = new int[n+1][n+1];

        for(int i=0; i<m; i++) {
            str = br.readLine().split(" ");
            int v1 = Integer.parseInt(str[0]);
            int v2 = Integer.parseInt(str[1]);

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        dfs(v);
        bw.write("\n");
        Arrays.fill(visited, false);

        bfs(v);
        bw.write("\n");

        bw.flush();
    }

    public static void dfs(int v) throws IOException{
        visited[v] = true;
        bw.write(v+" ");

        for(int i=1;i<=n;i++) {
            if(graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int v) throws IOException {
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            v = queue.poll();
            bw.write(v+" ");

            for(int i=0;i<=n;i++) {
                if(graph[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}