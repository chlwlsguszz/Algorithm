import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int AB = Integer.parseInt(A+B);

        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C));
        System.out.println(AB-Integer.parseInt(C));
    }
}

