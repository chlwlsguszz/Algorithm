import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] points = new int[N];

        for(int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedPoints = points.clone();
        Arrays.sort(sortedPoints);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sortedPoints[0], 0);

        int count = 0;
        for(int i=1;i<N;i++) {
            if(sortedPoints[i-1] < sortedPoints[i]) {
                count++;
                map.put(sortedPoints[i], count);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num: points) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);
        //for(int i=0; i<N; i++) {
        //    System.out.print(map.get(points[i])+" ");
        //}
    }
}

