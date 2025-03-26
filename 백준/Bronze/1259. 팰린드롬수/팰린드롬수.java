import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        String s;
        while( !(s=br.readLine()).equals("0") ) {
            String reverse = new StringBuilder(s).reverse().toString();
            if(s.equals(reverse)) {
                System.out.println("yes");
            }
            else
                System.out.println("no");
        }
    }

}

