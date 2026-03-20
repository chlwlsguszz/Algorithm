import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[50001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=50000;i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i);j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j*j]);
            }
        }
        System.out.println(dp[n]);
    }
}