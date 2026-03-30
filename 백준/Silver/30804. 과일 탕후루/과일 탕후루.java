import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int left = 0;
        int right = 0;
        int max = 0;

        while(right < N) {
            hashMap.put(arr[right],hashMap.getOrDefault(arr[right],0)+1);

            while(hashMap.size() > 2) {
                hashMap.put(arr[left], hashMap.get(arr[left])-1);
                if(hashMap.get(arr[left]) == 0)
                    hashMap.remove(arr[left]);
                left++;
            }

            max = Math.max(max,right-left+1);
            right++;
        }

        System.out.println(max);

    }


}