import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int[] arr;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            int x = Integer.parseInt(st.nextToken());
            System.out.println(foundNumber(x));
        }

    }

    static int foundNumber(int x) {
        int left = 0;
        int right = N-1;
        while (left<=right) {
            int mid = (left+right)/2;
            if (arr[mid] < x)
                left = mid+1;
            else if (arr[mid] > x)
                right = mid-1;
            else
                return 1;
        }
        return 0;
    }
}
