import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] intArray;
    static int N,M;
    static int max = 1;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        intArray = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                intArray[i][j] = s.charAt(j) - '0';
            }
        }

        for(int i=0;i<N-1;i++) {
            for(int j=0;j<M-1;j++) {
                find(i,j);
            }
        }

        System.out.println(max*max);
    }

    static void find(int x, int y) {

        int target = intArray[x][y];

        int i = 1;
        while(x+i < N && y+i < M) {
            if(intArray[x][y+i]==target && intArray[x+i][y] == target && intArray[x+i][y+i] == target) {
                max = Math.max(max,i+1);
            }
            i++;
        }
    }
}



