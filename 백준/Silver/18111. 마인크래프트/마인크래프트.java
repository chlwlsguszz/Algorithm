import java.io.*;
import java.util.*;

public class Main {
    static int N, M, B;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        int min = 256, max = 0;

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = 0;

        for(int h = min; h <= max; h++) {
            int time = 0;
            int block = B;

            for(int i=0;i<N;i++) {
                for(int j=0;j<M;j++) {
                    int cur = map[i][j];

                    if(cur > h) {
                        int diff = cur - h;
                        time += diff * 2;
                        block += diff;
                    } else if(cur < h) {
                        int diff = h - cur;
                        time += diff;
                        block -= diff;
                    }
                }
            }

            if(block < 0) continue;

            if(time < answerTime) {
                answerTime = time;
                answerHeight = h;
            } else if(time == answerTime) {
                answerHeight = Math.max(answerHeight, h);
            }
        }

        System.out.println(answerTime + " " + answerHeight);
    }
}