import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[6];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tCount = 0;
        for(int i=0;i<6;i++) {
            if (arr[i]%T == 0)
                tCount += (arr[i]/T);
            else if(arr[i]!=0)
                tCount += (arr[i]/T)+1;
        }

        System.out.println(tCount);
        System.out.println(N/P + " " +N%P);
    }
}

