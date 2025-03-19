import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String s = br.readLine();
            int count = 0;
            int point = 0;
            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                if(c=='O') {
                    point = point + 1 + count;
                    count++;
                }
                else
                    count = 0;
            }
            System.out.println(point);
        }
    }
}

