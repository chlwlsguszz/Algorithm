import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int i=0;
        int count=0;
        while(true) {
            if (Integer.toString(i).contains("666"))
                count++;

            if(count == N) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

}

