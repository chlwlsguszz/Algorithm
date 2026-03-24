import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[][] dir = { {0,-1}, {0,1}, {-1,0}, {1,0} };
    static int N,M,K;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for(int i=0;i<K;i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            int count = 0;
            for(int i=0;i<N;i++) {
                for(int j=0;j<M;j++) {
                    if(!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int y, int x) {
        visited[y][x] = true;

        for(int i=0;i<4;i++) {
            int dy = dir[i][0];
            int dx = dir[i][1];
            int ny = y+dy;
            int nx = x+dx;
            if(ny > -1 && nx > -1 && ny < N && nx < M) {
                if (!visited[ny][nx] && map[ny][nx] == 1) {
                    dfs(ny, nx);
                }
            }
        }
    }

}