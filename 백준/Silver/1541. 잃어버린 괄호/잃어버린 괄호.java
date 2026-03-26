import java.io.*;
import java.util.*;

public class Main {
    static int sum = 0;
    static boolean flag = false;
    static ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(c == '-') {
                calcSum();
                flag = true;
            }

            else if (c == '+') {
                calcSum();
            }


            else {
                queue.add(Character.getNumericValue(c));
            }

        }

        calcSum();

        System.out.println(sum);

    }

    static void calcSum() {
        int x = 0;
        while(!queue.isEmpty()) {
            int multiplier = 1;
            for(int j=1;j<queue.size();j++) {
                multiplier *= 10;
            }
            x += queue.poll()*multiplier;
        }

        if(!flag)
            sum += x;
        else
            sum -= x;
    }

}