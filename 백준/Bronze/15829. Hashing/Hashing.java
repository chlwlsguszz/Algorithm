import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        String s = br.readLine();

        long ans = 0;
        long M = 1234567891;
        long r = 1;

        for(int i=0;i<L;i++) {
            ans += (s.charAt(i) - 96) * r;
            r = r * 31 % M;
        }

        System.out.println(ans % M);

    }

}
