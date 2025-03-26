import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
         int N = Integer.parseInt(br.readLine());
         st = new StringTokenizer(br.readLine());
         double max = 0;

         double[] arr = new double[N];

         for(int i = 0;i<N;i++) {
             int n = Integer.parseInt(st.nextToken());
             max = Math.max(max, n);
             arr[i] = n;
         }

        double sum = 0;

         for(int i=0;i<N;i++) {
             arr[i] = arr[i]/max * 100;
             sum += arr[i];
         }

         double avg = sum / N;

         System.out.println(avg);
    }

}

