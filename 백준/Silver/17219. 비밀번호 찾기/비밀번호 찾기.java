import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, String> hashMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            hashMap.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++) {
            String s = br.readLine();
            sb.append(hashMap.get(s)).append("\n");
        }

        System.out.println(sb);
    }
}


