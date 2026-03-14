import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[41];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=40;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0)
                System.out.println(1 + " " + 0);
            else if (N==1)
                System.out.println(0 + " " + 1);
            else
                System.out.println(dp[N-1] + " " + dp[N]);
        }
    }
}


