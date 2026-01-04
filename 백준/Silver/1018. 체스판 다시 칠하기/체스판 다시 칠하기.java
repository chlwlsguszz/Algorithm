import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int N, M;
    static char board[][];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];

        for(int i=0;i<N;i++) {
            String line = br.readLine();
            for(int j=0;j<M;j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++) {
                min = Math.min(min, checkBoard(i,j));
            }
        }

        System.out.println(min);

    }

    public static int checkBoard(int x, int y) {
        int count=0;
        for(int i=x;i<x+8;i++) {
            for(int j=y;j<y+8;j++) {
                if((i+j)%2==0) {
                   if(board[i][j]!='W')
                       count++;
                } else {
                    if(board[i][j]!='B')
                        count++;
                }
            }
        }
        return Math.min(count, 64-count);
    }
}