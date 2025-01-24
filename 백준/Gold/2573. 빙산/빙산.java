import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] height = new int[300][300];
    static int[][] meltArr = new int[300][300];
    static boolean[][] visited = new boolean[300][300];
    static int[] dirX = {1, -1, 0, 0};
    static int[] dirY = {0, 0, 1, -1};
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // height info receive
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                height[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;

        while(true) {
            year++;
            // array reset
            for (boolean[] arr : visited) {
                Arrays.fill(arr, false);
            }

            // 녹는 빙산 계산
            calcMelt();
            // 녹이기
            melt();

            // 빙산 개수 count
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visited[i][j] && height[i][j] != 0) {
                        count ++;
                        if(count > 1) { // 빙산이 2개 이상으로 나눠짐
                            System.out.println(year);
                            return;
                        }
                        dfs(i,j);
                    }
                }
            }
            if (count == 0) { // 빙산이 0개 (모두 녹아 사라짐)
                System.out.println(0);
                return;
            }
        }

    }

    static void calcMelt() {
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++) {
                if (height[i][j] != 0) {
                    int count = 0;
                    for (int k = 0; k < 4; k++)
                        if (height[i + dirX[k]][j + dirY[k]] == 0) {
                            count++;
                        }
                    meltArr[i][j] = count;
                }
            }
    }

    static void melt() {
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                height[i][j] = height[i][j] - meltArr[i][j];
                if (height[i][j] < 0)
                    height[i][j] = 0;
                meltArr[i][j] = 0; // reset
            }
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            if (!visited[x + dirX[i]][y + dirY[i]] &&
                    height[x + dirX[i]][y + dirY[i]] != 0) {
                dfs(x + dirX[i], y + dirY[i]);
            }
        }
    }
}



