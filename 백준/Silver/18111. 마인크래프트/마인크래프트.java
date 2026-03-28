import java.io.*;
import java.util.*;

public class Main {
    static int N, M, B;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        int min = 256;
        int max = 0;
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                int x = Integer.parseInt(st.nextToken());
                map[i][j] = x;
                min = Math.min(min, x);
                max = Math.max(max, x);
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for(int i=min;i<=max;i++) {
            int checkResult = check(i);
            if(checkResult <= time) {
                time = checkResult;
                height = i;
            }
        }

        System.out.println(time + " " + height);

    }

    static int check(int x) {
        int block = B;
        int time = 0;
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(map[i][j] > x) {
                    int diff = map[i][j] - x;
                    block += diff;
                    time += diff*2;
                }
                else if(map[i][j] < x) {
                    int diff = x - map[i][j];
                    block -= diff;
                    time += diff;
                }
            }
        }

        if(block < 0) return Integer.MAX_VALUE;

        return time;
    }

}