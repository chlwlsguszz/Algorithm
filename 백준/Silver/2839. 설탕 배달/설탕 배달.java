import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int bigBag = 5; // 5kg
        int smallBag = 3; // 3kg
        int i = N/bigBag;
        while(i >= 0) {
            int restSugar = N - (bigBag*i);
            if (restSugar % smallBag == 0) {
                System.out.println(i + (restSugar/smallBag));
                return;
            }
            i--;
        }
        System.out.println(-1);
    }
}


