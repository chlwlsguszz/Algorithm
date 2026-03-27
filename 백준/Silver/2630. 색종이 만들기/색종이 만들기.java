import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static boolean[][] checked;
    static int[] result = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        checked = new boolean[N][N];

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int gap = N;
        while(gap > 0) {
            for(int i=0;i<N;i+=gap) {
                for(int j=0;j<N;j+=gap) {
                    if(!checked[i][j])
                        search(i, j, gap);
                }
            }
            gap/=2;
        }

        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    static void search(int y, int x, int gap) {
        int target = map[y][x];
        for(int i=y;i<y+gap;i++) {
            for(int j=x;j<x+gap;j++) {
                if(target != map[i][j] || checked[i][j])
                    return;
            }
        }

        // 여기까지 왔다면 성공
        result[target]++;
        for(int i=y;i<y+gap;i++) {
            for(int j=x;j<x+gap;j++) {
                checked[i][j] = true;
            }
        }
    }

}