import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int y = N%H;
            if (y==0) y=H;

            int x = N/H;
            if(N%H!=0) x+=1;

            System.out.print(y);
            if(x/10==0)
                System.out.println(0+""+x);
            else
                System.out.println(x);
        }
    }
}

