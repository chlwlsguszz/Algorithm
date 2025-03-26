import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V-A)/(A-B) + 1;
        if((V-A)%(A-B)!=0){
            day++;
        }
        System.out.println(day);
    }

}

