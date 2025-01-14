import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long min = 0;
        long mid = 0;
        long max = 0;

        for(int i = 0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max<arr[i])
                max = arr[i];
        }

        max++;
        long count;
        while (min < max) {
            mid = (max + min) / 2;
            //bw.write(mid+"\n");
            count = 0;
            for (int j : arr) {
                count += (j / mid);
            }

            if(count < N) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        min--;
        bw.write(min+"\n");
        bw.flush();
    }
}
