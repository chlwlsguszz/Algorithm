import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    static int visited[][];
    static int house[][];
    static int N;
    static int k;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        visited = new int[N][N];
        house = new int[N][N];

        for(int i=0;i<N;i++) {
            String s = br.readLine();
            for(int j=0;j<N;j++) {
                house[i][j] = Integer.parseInt(s.charAt(j)+"");
            }
        }

        for(int a[]: visited)
            Arrays.fill(a,0);

        int cnt = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(house[i][j]==1 && visited[i][j]==0) {
                    cnt++;
                    k=0;
                    dfs(i,j);
                    arrList.add(k);
                }
                else
                    visited[i][j] = 1;
            }
        }

        System.out.println(cnt);
        arrList.sort(Integer::compareTo);
        for(int a : arrList) {
            System.out.print(a+" ");
        }
    }

    static void dfs(int i, int j) {
        visited[i][j] = 1;
        k++;
        if(j+1 < N && house[i][j+1] == 1 && visited[i][j+1] == 0) {
            dfs(i,j+1);
        }
        if(j-1 > -1 && house[i][j-1] == 1 && visited[i][j-1] == 0) {
            dfs(i,j-1);
        }
        if(i+1 < N && house[i+1][j] == 1 && visited[i+1][j] == 0) {
            dfs(i+1,j);
        }
        if(i-1 > -1 && house[i-1][j] == 1 && visited[i-1][j] == 0) {
            dfs(i-1,j);
        }
    }

}
