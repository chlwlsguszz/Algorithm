import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int res = A*B*C;

        String s = Integer.toString(res);

        int[] arr = new int[10];
        Arrays.fill(arr, 0);


        for(char c : s.toCharArray()) {
            arr[c - '0']++;
        }

        for(int i=0;i<10;i++) {
            System.out.println(arr[i]);
        }
    }
}

