import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(gcd(A,B));
        System.out.println(lcm(A,B));
    }

    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}

