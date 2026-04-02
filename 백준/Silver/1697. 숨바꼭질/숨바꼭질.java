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

        while(true) {
            int[] cur = queue.poll();
            if(cur[0] == K) {
                System.out.println(cur[1]);
                break;
            }
            if(cur[0] - 1 >= 0 && !visited[cur[0]-1]) {
                queue.offer(new int[]{cur[0] - 1, cur[1] + 1});
                visited[cur[0] - 1] = true;
            }
            if(cur[0] + 1 <= 100000 && !visited[cur[0]+1]) {
                queue.offer(new int[]{cur[0] + 1, cur[1] + 1});
                visited[cur[0] + 1] = true;
            }
            if(cur[0] * 2 <= 100000 && !visited[cur[0]*2]) {
                queue.offer(new int[]{cur[0] * 2, cur[1] + 1});
                visited[cur[0] * 2] = true;
            }
        }
    }


}