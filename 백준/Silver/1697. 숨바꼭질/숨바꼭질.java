import java.io.*;
import java.util.*;

public class Main {
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[100001];

        ArrayDeque<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{N, 0});
        visited[N] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();

            int x = cur[0];
            int time = cur[1];

            if(x == K) {
                System.out.println(time);
                break;
            }

            int[] nexts = new int[]{x-1, x+1, x*2};

            for(int nx : nexts) {
                if(nx >= 0 && nx <= 100000 && !visited[nx]) {
                    visited[nx] = true;
                    queue.offer(new int[]{nx, time+1});
                }
            }
        }
    }


}