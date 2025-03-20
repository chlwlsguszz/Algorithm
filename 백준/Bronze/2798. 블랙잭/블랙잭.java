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
        for(int i=0;i<N;i++) {
            int card1 = cardArr[i];
            for(int j=0;j<N;j++) {
                int card2 = cardArr[j];
                if(card1==card2) continue;
                for(int k=0;k<N;k++) {
                    int card3 = cardArr[k];
                    if(card1==card3 || card2==card3) continue;

                    int sum = card1 + card2 + card3;
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

