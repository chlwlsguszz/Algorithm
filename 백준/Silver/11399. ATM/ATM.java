import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int sum = 0;
        int result = 0;
        for(int i=0;i<N;i++) {
            sum = sum + array[i];
            result = result + sum;
        }

        System.out.println(result);
    }
}


