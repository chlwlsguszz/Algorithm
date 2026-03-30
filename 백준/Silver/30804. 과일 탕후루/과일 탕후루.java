import java.io.*;
import java.util.*;

public class Main {
    static int[] count = new int[10];
    static int[] arr = new int[200000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());


        int left = 0;
        int right = 0;
        int max = 0;

        while(right < N) {
            while(right < N) {
                count[arr[right]]++;
                if(checkSize()>2) {
                    count[arr[right]]--;
                    break;
                }
                right++;
            }
            //총 개수 계산
            max = Math.max(max,right-left);

            while(left <= right) {
                count[arr[left]]--;
                left++;
                if(checkSize()<2) {
                    break;
                }
            }
        }

        System.out.println(max);

    }

    static int checkSize() {
        int groups = 0;
        for(int i=1;i<=9;i++) {
            if(count[i] > 0)
                groups++;
        }
        return groups;
    }


}