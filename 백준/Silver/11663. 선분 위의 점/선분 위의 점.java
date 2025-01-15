import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] pointArray = new int[N];
        for (int i = 0; i < N; i++) {
            pointArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pointArray);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            //bw.write(upperBound(pointArray,x2)+", ");
            //bw.write(lowerBound(pointArray,x1)+"\n");
            int result = upperBound(pointArray, x2) - lowerBound(pointArray, x1);
            bw.write(result + "\n");
        }

        bw.flush();
    }

    private static int upperBound(int[] pointArray, int value) {
        int min = 0;
        int max = pointArray.length;

        while (min < max) {
            int mid = (min + max) / 2;
            if (value < pointArray[mid])
                max = mid;
            else  min = mid+1;
        }

        return min;
    }

    private static int lowerBound(int[] pointArray, int value) {
        int min = 0;
        int max = pointArray.length;
        while (min < max) {
            int mid = (min + max) / 2;
            if (value > pointArray[mid])
                min = mid + 1;
            else max = mid;
        }
        return min;
    }

}
