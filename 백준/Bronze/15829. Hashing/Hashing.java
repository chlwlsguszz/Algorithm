import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        String s = br.readLine();

        long ans = 0;
        long M = 1234567891;
        long r = 31;

        for(int i=0;i<L;i++) {
            long temp = ((long)s.charAt(i) - 96)*(long)(Math.pow(r,i));
            ans += temp;
        }

        if (ans >= M)
            ans /= M;

        System.out.println(ans);

    }

}
