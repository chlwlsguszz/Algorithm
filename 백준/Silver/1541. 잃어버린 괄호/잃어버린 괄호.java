import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int sum = 0;

        String[] minusSplit = s.split("-");

        sum += plusSum(minusSplit[0]);

        for(int i=1;i<minusSplit.length;i++) {
            sum -= plusSum(minusSplit[i]);
        }

        System.out.println(sum);

    }

    static int plusSum(String s) {
        String[] plusSplit = s.split("\\+");

        int sum = 0;
        for(int i=0;i<plusSplit.length;i++) {
            sum += Integer.parseInt(plusSplit[i]);
        }

        return sum;
    }

}