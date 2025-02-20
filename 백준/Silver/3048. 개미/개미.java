import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Ant {
        char alphabet;
        //direct -> 1: left, 2: right
        int direct;

        Ant(char a, int dir) {
            this.alphabet = a;
            this.direct = dir;
        }
    }


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        Ant[] ants = new Ant[N1+N2];

        String s = br.readLine();
        for(int i=0;i<N1;i++) {
            // 역순으로 삽입
            ants[i] = new Ant(s.charAt(N1-1-i),2);
        }

        s = br.readLine();
        for(int i=N1;i<N1+N2;i++){
            // 이어서 삽입
            ants[i] = new Ant(s.charAt(i-N1),1);
        }

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++) {
            for(int j=0;j<N1+N2-1;j++) {
                //방향이 다를 때 + 왼쪽 개미가 오른쪽으로 가야할때만 바꾼다.
                if(ants[j+1].direct != ants[j].direct && ants[j].direct == 2) {
                    Ant temp = ants[j+1];
                    ants[j+1] = ants[j];
                    ants[j] = temp;
                    j++;
                }
            }
        }

        for(Ant ant : ants)
            System.out.print(ant.alphabet);

    }
}

