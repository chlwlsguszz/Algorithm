import java.util.*;
import java.io.*;

public class Main {
    static int n = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            n = Integer.parseInt(br.readLine());
            int result = find(0);
            System.out.println(result);
        }
    }

    static int find(int x) {
        if(x == n) return 1;
        else if (x > n) return 0;
        return find(x+1) + find(x+2) + find(x+3);
    }
}