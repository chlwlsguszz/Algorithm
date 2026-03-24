import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        TreeSet<Integer> treeSet = new TreeSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            int x = Integer.parseInt(st.nextToken());
            array[i] = x;
            treeSet.add(x);
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int count=0;
        for(int x : treeSet)
            hashMap.put(x,count++);



        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            sb.append(hashMap.get(array[i])).append(" ");
        }

        System.out.println(sb);



    }

}