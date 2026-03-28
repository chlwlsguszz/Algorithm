import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static char[][] map;
    static int count = 0;
    static int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visited = new boolean[N][M];

        int posI = 0, posJ = 0;

        for(int i=0;i<N;i++) {
            String s = br.readLine();
            for(int j=0;j<M;j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == 'I') {
                    posI = i;
                    posJ = j;
                }
            }
        }

        dfs(posI,posJ);
        if(count == 0)
            System.out.println("TT");
        else
            System.out.println(count);
    }

    static void dfs(int y, int x) {
        visited[y][x] = true;
        if(map[y][x] == 'P')
            count++;
        for(int i=0;i<4;i++) {
            int nextY = y+dir[i][0];
            int nextX = x+dir[i][1];

            if(nextY>-1 && nextY<N && nextX>-1 && nextX<M) {
                if(map[nextY][nextX] != 'X' && !visited[nextY][nextX])
                    dfs(nextY, nextX);
            }
        }
    }


}