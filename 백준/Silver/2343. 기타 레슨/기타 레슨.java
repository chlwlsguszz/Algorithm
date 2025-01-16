import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N,M;
    static int[] intArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        intArray = new int[N];
        int min=0;
        int max=0;

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
            min = Math.max(min, intArray[i]);
            max += intArray[i];
        }

        bw.write(binarySearch(min, max)+"\n");
        bw.flush();
    }

    public static int binarySearch(int min, int max) {
        while(min <= max) {
            int sum = 0;
            int mid = (max + min) / 2;
            int count = 1;
            for (int i=0;i<N;i++) {
                 sum += intArray[i];
                 if (sum > mid) {
                     sum=intArray[i];
                     count++;
                 }
            }
            
            if(count <= M) 
                max = mid - 1;
            else 
                min = mid + 1;
            
        }
        return min;
    }

}
