import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] intArray;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        intArray = new int[N][M];

        for(int i=0;i<N;i++) {
            String s = br.readLine();
            for(int j=0;j<M;j++) {
                if(s.charAt(j)=='B')
                    intArray[i][j] = 1;
                else
                    intArray[i][j] = 0;
            }
        }


        for(int i=0;i<N-7;i++) {
            for(int j=0;j<M-7;j++) {
                check(i,j);
            }
        }

        System.out.println(min);
    }

    static void check(int x, int y) {
        int count = 0;
        int color = intArray[x][y];

        for(int i=x;i<x+8;i++) {
            for(int j=y;j<y+8;j++) {
                if(intArray[i][j]!=color)
                    count++;
                color = (color+1)%2;
            }
            color = (color+1)%2;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}



