import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String nameArr[] = new String[N+1];
        HashMap<String,Integer> nameIdMap = new HashMap<>();

        for (int i=1;i<=N;i++) {
            String name = br.readLine();
            nameArr[i] = name;
            nameIdMap.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++) {
            String s = br.readLine();

            if(Character.isDigit(s.charAt(0))) {
                int n = Integer.parseInt(s);
                sb.append(nameArr[n]).append("\n");
            }

            else
                sb.append(nameIdMap.get(s)).append("\n");
        }


        System.out.println(sb);
    }
}


