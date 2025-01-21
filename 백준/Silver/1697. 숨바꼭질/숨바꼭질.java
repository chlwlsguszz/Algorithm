import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, K;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        distance = new int[100001]; // 0 <= N,K <= 100000
        Arrays.fill(distance, -1);

        BFS();
        System.out.println(distance[K]);

    }

    static void BFS() {
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        distance[N] = 0;

        while (!q.isEmpty()) {
            if (distance[K] != -1)
                break;

            int x = q.poll();

            if (x - 1 >= 0 && distance[x - 1] == -1) {
                q.add(x - 1);
                distance[x - 1] = distance[x] + 1;
            }
            if (x + 1 <= 100000 && distance[x + 1] == -1) {
                q.add(x + 1);
                distance[x + 1] = distance[x] + 1;
            }
            if (x * 2 <= 100000 && distance[x * 2] == -1) {
                q.add(x * 2);
                distance[x * 2] = distance[x] + 1;
            }
        }

    }

}
