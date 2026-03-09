import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] array = new boolean[1000001];
        Arrays.fill(array, true);
        checkPrime(array, N);


        for(int i=M;i<=N;i++) {
            if(array[i])
                System.out.println(i);
        }

    }

    static void checkPrime(boolean[] array, int N) {
        array[1] = false;
        for(int i=2;i<=1000000;i++) {
            if(array[i]) {
                int j = 2;
                while(i * j <= N) {
                    array[i*j] = false;
                    j++;
                }
            }
        }
    }

}


