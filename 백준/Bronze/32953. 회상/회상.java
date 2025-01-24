import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i=0;i<N;i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<K;j++) {
                String id = st.nextToken();
                if(hashMap.containsKey(id)) {
                    hashMap.put(id, hashMap.get(id) + 1);
                }
                else
                    hashMap.put(id, 1);
            }
        }


        int cnt=0;
        for (int val : hashMap.values()) {
            if(val>=M)
                cnt++;
        }

        System.out.println(cnt);
    }
}



