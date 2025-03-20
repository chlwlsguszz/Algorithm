import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        System.out.println(searchConstructor(N));
    }

    static int searchConstructor(int n) {
        for(int i=1;i<n;i++) {
            String s = Integer.toString(i);
            int sum = 0;
            for(int j=0;j<s.length();j++) {
                sum += s.charAt(j) - '0';
            }
            if(i+sum==n) return i;
        }
        return 0;
    }
}

