import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] dp = new int[1001];
    static int[] seq = new int[1001];

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            dp[i] = -1;
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0;i<N;i++) {
            search(i);
        }

        int max = dp[0];
        for(int i=1;i<N;i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    static int search(int N) {
        if(dp[N] == -1) {
            dp[N] = 1;

            for(int i=N-1; i>=0; i--) {
                if(seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], search(i) + 1);
                }
            }
        }
        return dp[N];
    }

}

