import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i=0;i<N;i++) {
            arrayList.add(br.readLine());
        }

        for(int i=0;i<M;i++) {
            hashSet.add(br.readLine());
        }

        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i=0;i<N;i++) {
            if(hashSet.contains(arrayList.get(i))) {
                sb.append(arrayList.get(i)).append("\n");
                count++;
            }
        }

        System.out.println(count + "\n" + sb);
    }
}


