import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long N = Long.parseLong(br.readLine());
        System.out.println(searchRoom(N));
    }

    static long searchRoom(long n) {
        long index = 1;
        long count = 1;
        long w = 6;
        while(true) {
            if(index>=n) return count;
            index+=w;
            w+=6;
            count++;
        }
    }
}

