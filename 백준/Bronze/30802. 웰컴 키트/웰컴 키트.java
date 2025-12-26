import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        /*
        int S = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int L = Integer.parseInt(line[2]);
        int XL = Integer.parseInt(line[3]);
        int XXL = Integer.parseInt(line[4]);
        int XXXL = Integer.parseInt(line[5]);
        */

        String[] line2 = br.readLine().split(" ");

        int T = Integer.parseInt(line2[0]);
        int P = Integer.parseInt(line2[1]);

        int res1=0;
        int sum=0;
        for(String s : line) {

            int i = Integer.parseInt(s);
            sum+=i;
            res1+= i / T;
            if (i!=0 && i % T != 0) {
                res1++;
            }
        }

        int res2 = sum/P;
        int res3 = sum%P;

        System.out.println(res1);
        System.out.println(res2+" "+res3);

    }
}