import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static TreeMap<Integer, Integer> scoreMap = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());

            for(int j=0;j<N;j++) {
                st = new StringTokenizer(br.readLine());
                int paperScore = Integer.parseInt(st.nextToken());
                int interviewScore = Integer.parseInt(st.nextToken());
                scoreMap.put(paperScore,interviewScore);
            }

            Set keySet = scoreMap.keySet();
            Iterator it = keySet.iterator();
            
            int min = Integer.MAX_VALUE;
            int count = 0;

            while(it.hasNext()) {
                int paperScore = Integer.parseInt(it.next().toString());
                int interviewScore = scoreMap.get(paperScore);
                if(min > interviewScore) {
                    min = interviewScore;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

