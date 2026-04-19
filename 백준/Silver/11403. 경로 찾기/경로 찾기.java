import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        int[][] result = new int[N][N];

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

        for(int i=0;i<N;i++) {
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[N];
            queue.add(i);
            while(!queue.isEmpty()) {
                int x = queue.poll();
                for(int y : edges.get(x)) {
                    result[i][y] = 1;
                    if(!visited[y]) {
                        queue.offer(y);
                        visited[y] = true;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                sb.append(result[i][j]);
                if(j<N-1)
                    sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}