import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        boolean ascendingFlag = false;
        boolean descendingFlag = false;

        if(n == 8){
            for(int i=7;i>=1;i--) {
                int next = Integer.parseInt(st.nextToken());
                if (next != i)
                    break;
                if(i==1) descendingFlag = true;
            }
        }
        else if (n==1) {
            for(int i=2;i<=8;i++) {
                int next = Integer.parseInt(st.nextToken());
                if(next!=i)
                    break;
                if(i==8) ascendingFlag = true;
            }
        }

        if(ascendingFlag) {
            System.out.println("ascending");
        } else if(descendingFlag) {
            System.out.println("descending");
        } else
            System.out.println("mixed");
    }
}

