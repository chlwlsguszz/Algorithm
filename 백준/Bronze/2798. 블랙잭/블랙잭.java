import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] cardArr;
    static int N, M, min, res;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;

        cardArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        blackjack();
    }

    static void blackjack() {
        for(int i=0;i<N-2;i++) {
            for(int j=i+1;j<N-1;j++) {
                for(int k=j+1;k<N;k++) {
                    int sum = cardArr[i] + cardArr[j] + cardArr[k];
                    if(M >= sum && M - sum < min) {
                        min = M - sum;
                        res = sum;
                        if(res==M) break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}

