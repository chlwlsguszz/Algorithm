import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        while(true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0) {
                break;
            }

            if(Math.pow(A,2) + Math.pow(B,2) == Math.pow(C,2) ||
                    Math.pow(A,2) + Math.pow(C,2) == Math.pow(B,2) ||
                    Math.pow(B,2) + Math.pow(C,2) == Math.pow(A,2)) {
                System.out.println("right");
            }
            else
                System.out.println("wrong");
        }
    }
}

