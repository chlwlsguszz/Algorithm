import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        String s = br.readLine();
        int N = Integer.parseInt(s);
        int result = 0;

        for(int i=1;i<=N;i++) {
            int current = i;

            int num = i;
            while(num > 0) {
                current += num % 10;
                num /= 10;
            }
            if (current==N) {
                result = i;
                break;
            }
        }

        System.out.println(result);


    }
}