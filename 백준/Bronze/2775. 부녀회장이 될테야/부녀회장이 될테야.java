import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        int[][] array = new int[15][15];

        array[0][0] = 0;
        for(int i=1;i<=14;i++) {
            array[i][0] = 0;
            array[0][i] = i;
        }

        for(int i=1;i<=14;i++) {
            int sum = 0;
            for(int j=1;j<=14;j++) {
                sum += array[i-1][j];
                array[i][j] += sum;
            }
        }
        
        for(int j=0;j<T;j++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            System.out.println(array[K][N]);
        }
    }

}

