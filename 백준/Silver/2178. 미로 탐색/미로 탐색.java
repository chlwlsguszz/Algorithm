import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dy = {0,0,1,-1};
    static int[] dx = {1,-1,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i=0;i<N;i++) {
            String s = br.readLine();
            for(int j=0;j<M;j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));
    }

    static int bfs(int y, int x) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{y, x, 1});
        map[y][x] = 0;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];
            int dist = cur[2];
            if(curY == N-1 && curX == M-1) return dist;

            for(int i=0;i<4;i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                if(ny >= 0 && nx >= 0 && ny < N && nx < M && map[ny][nx] == 1) {
                    queue.add(new int[]{ny, nx, dist+1});
                    map[ny][nx] = 0;
                }
            }
        }

        return -1;

    }
}