import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> links = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];

        for(int i=0;i<N+1;i++) {
            links.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            links.get(A).add(B);
            links.get(B).add(A);
        }

        int min = Integer.MAX_VALUE;
        int res = 1;
        for(int i=1;i<=N;i++) {
            int distSum = bfs(i);
            if(min > distSum) {
                min = distSum;
                res = i;
            }
            else if(min == distSum) {
                res = Math.min(res, i);
            }
        }

        System.out.println(res);



    }

    static int bfs(int start) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{start,0});
        visited[start] = true;
        
        int sum = 0;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            sum += cur[1];
            
            for(int next : links.get(cur[0])) {
                if(!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, cur[1]+1});
                }
            }
        }

        Arrays.fill(visited, false);
        return sum;
    }

}