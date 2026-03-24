import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int count = 0;
        for(int i=0;i<N;i++) {
            if(!hashMap.containsKey(sortedArray[i]))
                hashMap.put(sortedArray[i],count++);
        }


        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            sb.append(hashMap.get(array[i])).append(" ");
        }

        System.out.println(sb);



    }

}