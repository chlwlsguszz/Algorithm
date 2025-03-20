import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            int a = Integer.parseInt(st.nextToken());
            if(isPrimeNumber(a)) count++;
        }
        System.out.println(count);
    }

    static boolean isPrimeNumber(int n) {
        if(n==1) return false;
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}

