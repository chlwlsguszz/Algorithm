import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int[][] dir = {
            {0,1}, {0,-1}, {1,0}, {-1,0}
    };
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++) {
            String s = br.readLine();
            for(int j=0;j<M;j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));
    }
    static class Point {
        int y, x;
        int moveCount;

        public Point(int y, int x, int moveCount) {
            this.y = y;
            this.x = x;
            this.moveCount = moveCount;
        }
    }
    static int bfs(int y, int x) {
        ArrayDeque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(y,x,1));
        visited[y][x] = true;

        while(!queue.isEmpty()) {
            Point p = queue.poll();
            if(p.y == N-1 && p.x == M-1) return p.moveCount;

            for(int i=0;i<4;i++) {
                int ny = p.y + dir[i][0];
                int nx = p.x + dir[i][1];
                if(ny >= 0 && nx >= 0 && ny < N && nx < M && map[ny][nx] == 1 && !visited[ny][nx]) {
                    queue.add(new Point(ny,nx,p.moveCount + 1));
                    visited[ny][nx] = true;
                }
            }
        }

        return -1;

    }
}