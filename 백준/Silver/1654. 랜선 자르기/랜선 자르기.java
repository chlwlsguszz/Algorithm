import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] cables = new long[K];

        for(int i=0;i<K;i++) {
            cables[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(cables);

        long left = 1;
        long right = cables[K-1];
        long mid = 1;
        long result = 1;
        while(left <= right) {
            mid = (left + right)/2;
            long sum = 0;
            for(int i=0;i<K;i++) {
                sum += cables[i]/mid;
            }
            if (sum>=N) {
                result = mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }

        System.out.println(result);

    }

}