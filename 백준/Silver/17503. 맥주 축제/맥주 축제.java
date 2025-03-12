import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Beer {
        int prefer;
        int alcohol;

        Beer(int prefer, int alcohol) {
            this.prefer = prefer;
            this.alcohol = alcohol;
        }
    }


    static ArrayList<Beer> beerList = new ArrayList<>();
    static PriorityQueue<Beer> pq = new PriorityQueue<>(Comparator.comparingInt(b -> b.prefer));

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=0;i<K;i++) {
            st = new StringTokenizer(br.readLine());
            int prefer = Integer.parseInt(st.nextToken());
            int alcohol = Integer.parseInt(st.nextToken());
            beerList.add(new Beer(prefer, alcohol));
        }

        beerList.sort((o1, o2) -> {
            if(o1.alcohol == o2.alcohol) {
                return o1.prefer - o2.prefer;
            }
            return o1.alcohol - o2.alcohol;
        });

        int totalPrefer = 0;
        int answer = -1;
        for(Beer beer : beerList) {
            pq.add(beer);
            totalPrefer += beer.prefer;

            if(pq.size() > N) {
                totalPrefer -= pq.poll().prefer;
            }

            if(pq.size() == N && totalPrefer >= M) {
                answer = beer.alcohol;
                break;
            }
        }
        System.out.println(answer);
    }
}

