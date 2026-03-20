import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j*j]);
            }
        }
        System.out.println(dp[n]);
    }
}