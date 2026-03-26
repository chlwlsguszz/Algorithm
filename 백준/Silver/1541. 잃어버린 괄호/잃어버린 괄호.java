import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        int sum = 0;
        boolean flag = false;

        int num = 0;

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(c == '+' || c == '-') {
                if (!flag)
                    sum += num;
                else
                    sum -= num;

                if(c=='-')
                    flag = true;
                
                num = 0;
            }

            else {
                num = num * 10 + (c-'0');
            }

        }

        if (!flag)
            sum += num;
        else
            sum -= num;

        System.out.println(sum);

    }
}