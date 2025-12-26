import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int a,b,c;
        while (true) {
            String[] line = br.readLine().split(" ");
            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[1]);
            c = Integer.parseInt(line[2]);

            if(a==0 || b== 0 || c==0)
                break;

            if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
                System.out.println("right");
            else if (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))
                System.out.println("right");
            else if (Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2))
                System.out.println("right");
            else
                System.out.println("wrong");

        }

    }
}