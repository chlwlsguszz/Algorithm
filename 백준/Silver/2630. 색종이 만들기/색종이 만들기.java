import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static int[] result = new int[2];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,N);

        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    static void dfs(int y, int x, int size) {
        int target = map[y][x];

        if(isSame(y, x, size)) {
            result[target]++;
            return;
        }

        int nextSize = size/2;
        for(int i=y;i<y+size;i+=nextSize) {
            for(int j=x;j<x+size;j+=nextSize) {
                dfs(i,j,nextSize);
            }
        }

    }

    static boolean isSame(int y, int x, int size) {
        int target = map[y][x];
        for(int i=y; i<y+size; i++) {
            for(int j=x; j<x+size; j++) {
                if(target != map[i][j]) return false;
            }
        }
        return true;
    }

}