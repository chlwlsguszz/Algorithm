import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int exclude = (int)Math.round(n*0.15);


        int[] array = new int[n];

        for(int i=0;i<n;i++)
            array[i] = Integer.parseInt(br.readLine());

        Arrays.sort(array);

        int sum = 0;
        for(int i=exclude;i<n-exclude;i++) {
            sum += array[i];
        }

        int result = Math.round((float)sum/(n-exclude*2));

        System.out.println(result);

    }

}


