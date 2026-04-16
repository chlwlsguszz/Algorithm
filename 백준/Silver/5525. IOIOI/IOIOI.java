import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String S = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append("I");
        for(int i=0;i<N;i++) {
            sb.append("OI");
        }

        String P = sb.toString();
        int count = 0;

        for(int i=0;i<M;i++) {
            if(S.charAt(i) == 'I' && (i + 2*N) < M) {
                if(S.substring(i,i+2*N+1).equals(P)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}