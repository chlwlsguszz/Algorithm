import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int intArray[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArray);

        int i=0;
        int j=intArray.length-1;
        int min = Integer.MAX_VALUE;
        int res1 = 0;
        int res2 = 0;

        while (i < j) {
            int sum = intArray[i] + intArray[j];

            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                res1 = intArray[i];
                res2 = intArray[j];
            }
            if (sum > 0)
                j--;
            else
                i++;
        }

        bw.write(res1 + " " + res2);
        bw.flush();
    }

}
