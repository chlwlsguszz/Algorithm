import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        String[] stringArr = new String[3];
        for(int i=0;i<3;i++) {
            stringArr[i] = br.readLine();
        }

        int res = 0;
        for(int i=0;i<3;i++) {
            if(stringArr[i].contains("Fizz") || stringArr[i].contains("Buzz")) {
                continue;
            }
            else
                res = Integer.parseInt(stringArr[i]) + 3 - i;
        }

        if(res % 3 == 0 && res % 5 == 0)
            System.out.println("FizzBuzz");
        else if(res%3==0)
            System.out.println("Fizz");
        else if (res%5==0)
            System.out.println("Buzz");
        else
            System.out.println(res);
    }

}

