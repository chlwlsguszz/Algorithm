import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //testcase 개수
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {

            // 수첩 1 정수 개수
            int N = Integer.parseInt(br.readLine());
            int[] intArray = new int[N];
            String[] tokens1 = br.readLine().split(" ");
            Set<String> set = new HashSet<>(Arrays.asList(tokens1));
            //for(int j=0;j<N;j++) {
            //    intArray[j] = Integer.parseInt(tokens1[j]);
            //}

            // 수첩 2 정수 개수
            int M = Integer.parseInt(br.readLine());
            String[] tokens2 = br.readLine().split(" ");

            for (int j=0; j<M; j++) {
                //int target = Integer.parseInt(tokens[j]);

                if (set.contains(tokens2[j]))
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
        }
        bw.flush();
    }
}
