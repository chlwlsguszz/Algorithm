import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coinArray = new int[N];

        for(int i=0;i<N;i++) {
            coinArray[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i=N-1;i>=0;i--) {
            if(coinArray[i] <= K) {
                sum = sum + K/coinArray[i];
                K = K % coinArray[i];
            }
            if (K==0) {
                break;
            }
        }

        System.out.println(sum);
    }
}


