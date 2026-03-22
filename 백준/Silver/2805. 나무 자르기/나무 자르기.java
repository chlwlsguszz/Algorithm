import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long[] trees = new long[N];

        long max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            trees[i] = Long.parseLong(st.nextToken());
            max = Math.max(trees[i],max);
        }

        // 0 <= H <= (Max_M - 1)
        long left = 0;
        long right = max - 1;
        long result = 0;
        while(left <= right) {
            long mid = left + (right - left)/2;
            long sum = 0;
            for(int i=0;i<N;i++) {
                if(trees[i] - mid > 0)
                    sum += trees[i] - mid;
            }
            if(sum >= M) {
                left = mid + 1;
                result = mid;
            }
            else right = mid - 1;
        }

        System.out.println(result);
    }

}