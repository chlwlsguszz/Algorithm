import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap= new HashMap<>(4);
        hashMap.put("STRAWBERRY", 0);
        hashMap.put("BANANA", 0);
        hashMap.put("LIME", 0);
        hashMap.put("PLUM", 0);
        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int v = Integer.parseInt(st.nextToken());
            int newValue = hashMap.get(s) + v;
            hashMap.put(s, newValue);
        }

        if (hashMap.containsValue(5))
            bw.write("YES"+"\n");
        else
            bw.write("NO"+"\n");

        bw.flush();
    }

}
