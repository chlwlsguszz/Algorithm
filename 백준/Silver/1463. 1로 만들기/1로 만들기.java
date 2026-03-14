import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1000001];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        for(int i=5;i<=1000000;i++) {
            dp[i] = dp[i-1] + 1;
            if(i%2==0)
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3==0)
                dp[i] = Math.min(dp[i], dp[i/3]+1);
        }

        int n = Integer.parseInt(br.readLine());
        System.out.println(dp[n]);
    }
}


