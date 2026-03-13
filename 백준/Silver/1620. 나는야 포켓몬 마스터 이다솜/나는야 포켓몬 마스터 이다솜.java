import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer,String> idMap = new HashMap<>();
        HashMap<String,Integer> nameMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i=1;i<=N;i++) {
            String name = br.readLine();
            idMap.put(i,name);
            nameMap.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++) {
            String s = br.readLine();

            if(Character.isDigit(s.charAt(0))) {
                int n = Integer.parseInt(s);
                sb.append(idMap.get(n)).append("\n");
            }
            
            else
                sb.append(nameMap.get(s)).append("\n");
        }


        System.out.println(sb);
    }
}


