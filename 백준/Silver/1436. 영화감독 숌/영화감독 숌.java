import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int i = 0;
        int count = 0;
        while(true) {
            i++;
            if(Integer.toString(i).contains("666"))
                count++;

            if (count == n) break;
        }

        System.out.println(i);
    }
}


