import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    //초밥 Queue
    static Queue<Integer> sushiQueue = new LinkedList<>();
    //초밥별 주문 목록들을 담는 Map Array
    static HashMap<Integer,List<Integer>> hashMap;
    //손님들의 식사 횟수 count
    static int[] countArray;

    public static void main(String[] args) throws IOException {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            countArray = new int[N];
            Arrays.fill(countArray,0);

            hashMap = new HashMap<>();

            for(int i=0;i<N;i++) {
                st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                for(int j=0;j<k;j++) {
                    //이 초밥의 주문자 입력
                    int sushiNumber = Integer.parseInt(st.nextToken());
                    hashMap.putIfAbsent(sushiNumber,new ArrayList<>());
                    hashMap.get(sushiNumber).add(i);
                }
            }

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++) {
                sushiQueue.add(Integer.parseInt(st.nextToken()));
            }

            while(!sushiQueue.isEmpty()) {
                int sushiNumber = sushiQueue.poll();
                if(hashMap.containsKey(sushiNumber)) {
                    if (hashMap.get(sushiNumber).size() != 0) {
                        countArray[hashMap.get(sushiNumber).get(0)]++;
                        hashMap.get(sushiNumber).remove(0);
                    }
                }
            }

            for(int i=0;i<N;i++) {
                System.out.print(countArray[i] + " ");
            }
    }
}

