import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i =0; i<s.length(); i++) {
            map.putIfAbsent(s.charAt(i), i);
        }

        for(int i='a'; i<='z'; i++) {
            if(map.containsKey((char) i)) {
                System.out.print(map.get((char)i)+" ");
            }
            else
                System.out.print(-1+" ");
        }
    }
}

