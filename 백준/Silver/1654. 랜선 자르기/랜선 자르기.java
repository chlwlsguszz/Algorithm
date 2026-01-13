import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static int[] arr;
    static int K;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[K];
        long left=1;
        long right=Integer.MIN_VALUE;

        for(int i=0;i<K;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }

        //System.out.println("left = " + left + " and right = " + right);
        long result = -1;
        while(left <= right) {
            long mid = (left+right)/2;
            //System.out.println("mid = "+ mid);
            if (can(mid)) {
                left = mid + 1;
                result = mid;
            }
            else right = mid - 1;
            //System.out.println("left = " + left + " and right = " + right);
        }

        System.out.println(result);
        if(result == -1) System.out.println("Failed");

    }

    static boolean can(long mid) {
        int sum = 0;
        for(int i=0;i<K;i++) {
            sum += arr[i]/mid;
        }

        return sum >= N;
    }
}
