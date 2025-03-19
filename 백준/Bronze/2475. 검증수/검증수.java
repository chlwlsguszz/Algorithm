import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            n = (int)Math.pow(n, 2);
            sum += n;
        }
        sum %= 10;
        System.out.println(sum);
    }
}

