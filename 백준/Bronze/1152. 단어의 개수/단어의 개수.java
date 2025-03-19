import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }

        System.out.println(count);
    }
}

