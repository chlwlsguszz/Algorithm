import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer>[] adj;
    static int[] color; // 0 = nonvisited, 1 = blue, 2 = red
    static boolean resCheck;

    public static void main(String[] args) throws IOException {
        int K = Integer.parseInt(br.readLine());


        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            //graph reset
            adj = new ArrayList[V + 1];
            for (int j = 0; j < V + 1; j++) {
                adj[j] = new ArrayList<>();
            }


            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                adj[u].add(v);
                adj[v].add(u);
            }

            color = new int[V + 1];
            resCheck = true;

            for (int j = 1; j < V + 1; j++) {
                if (!resCheck) break;
                if(color[j] == 0)
                    dfs(j, 1);
            }
            if (resCheck)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    static void dfs(int x, int c) {
        color[x] = c;
        for (int next : adj[x]) {
            if (color[next] == c) {
                resCheck = false;
                return;
            }
            if (color[next] == 0) {
                dfs(next, 3-c);
            }
        }
    }
}



