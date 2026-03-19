import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer st;

        while (T-->0) {
            int n = Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String s = st.nextToken();
                hashMap.put(s, hashMap.getOrDefault(s,0) + 1);
            }

            int result = 1;
            for(int x : hashMap.values()) {
                result *= x+1;
            }
            System.out.println(result-1);
            hashMap.clear();
        }

    }
}