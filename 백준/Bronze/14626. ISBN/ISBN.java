import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        //StringTokenizer st;

        String s = br.readLine();
        int sum=0;
        int starIndex=0;

        for(int i=0;i<13;i++) {
            char c = s.charAt(i);
            if (c!='*') {
                if (i%2==0) sum+=(c-'0');
                else sum+=(c-'0')*3;
            }
            else
                starIndex = i;
        }

        int weight = (starIndex % 2 == 0) ? 1 : 3;
        int answer=0;
        for(int i=0;i<=9;i++) {
            if((sum+ (i*weight))%10==0) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }


}


