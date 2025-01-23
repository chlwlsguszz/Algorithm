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

        HashMap<Integer, String> hashMap = new HashMap<>();

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int key = 0;
            for(int j=1;j<=3;j++) {
                key += (int)Math.pow(st.nextToken().charAt(0),j);
            }
            if(hashMap.containsKey(key)) {
                hashMap.put(key,"?");
            }
            else
                hashMap.put(key,s);
        }
        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int key = 0;
            for(int j=1;j<=3;j++) {
                key += (int)Math.pow(st.nextToken().charAt(0),j);
            }
            if(hashMap.containsKey(key)) {
                System.out.println(hashMap.get(key));
            }
            else
                System.out.println("!");
        }

    }


}
