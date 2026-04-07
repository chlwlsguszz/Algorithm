import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int count = 0;
    static int[][] dir = { {0,1}, {0,-1}, {1,0}, {-1,0} };


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        ArrayList<Integer> countList = new ArrayList<>();

        for(int i=0;i<N;i++) {
            String s = br.readLine();
            for(int j=0;j<N;j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    countList.add(count);
                    count = 0;
                }
            }
        }

        Collections.sort(countList);
        System.out.println(countList.size());
        for(int x : countList) {
            System.out.println(x);
        }


    }

    static void dfs(int y, int x) {
        visited[y][x] = true;
        count++;

        for(int i=0;i<4;i++) {
            int ny = y + dir[i][0];
            int nx = x + dir[i][1];
            if(ny >= 0 && nx >= 0 && ny < N && nx < N && map[ny][nx] == 1 && !visited[ny][nx]) {
                dfs(ny, nx);
            }
        }
    }


}