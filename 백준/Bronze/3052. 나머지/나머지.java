import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet();
        for(int i=0;i<10;i++) {
            int x = Integer.parseInt(br.readLine());
            x %= 42;
            set.add(x);
        }

        System.out.println(set.size());
    }
}

