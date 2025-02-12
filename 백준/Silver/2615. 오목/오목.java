import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] omokArr = new int[19][19];
    static int winner;
    static boolean winFlag = false;
    static int winY, winX;
    //위쪽 수직선부터 시계방향으로 8방향
    static int[] dirY = {-1,-1,0,1,1,1,0,-1};
    static int[] dirX = {0,1,1,1,0,-1,-1,-1};
    static int winI;

    public static void main(String[] args) throws IOException {
        for(int i=0;i<19;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<19;j++) {
                omokArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<19;i++) {
            if(winFlag) break;
            for(int j=0;j<19;j++) {
                //가장 좌측부터 탐색
                if(omokArr[j][i] != 0)
                    search(j,i);
            }
        }

        if(!winFlag)
            System.out.println(0);
        else {
            System.out.println(winner);
            //index 0-18 -> 문제에 제시된 1-19로 출력
            System.out.print((winY+1) + " " +(winX+1));
        }
    }

    static void search(int curY, int curX) {
        int player = omokArr[curY][curX];
        //위쪽 수직선부터 시계방향으로 돌면서 8방향 탐색
        for(int i=0;i<8;i++) {
            if(winFlag)
                break;
            for(int j=1;j<5;j++) {
                //바운더리 검사
                if(curY + dirY[i]*4 < 0 || curY+dirY[i]*4 >= 19 || curX+dirX[i]*4 < 0 || curX+dirX[i]*4 >= 19)
                    break;

                // 정해진 방향으로 4번 탐색
                if(omokArr[curY+(dirY[i]*j)][curX+(dirX[i]*j)] == player)
                    if(j == 4) {
                        //5목일시 6목 검사 추가
                        if(!validFiveStone(curY, curX, i, player))
                            break;
                        else {
                            winner = player;
                            winFlag = true;
                            winY = curY;
                            winX = curX;
                        }
                    } else continue;
                else break;
            }
        }

    }

    static boolean validFiveStone(int curY, int curX, int i, int player) {

        if(curY + dirY[i]*-1 >= 0 && curY+dirY[i]*-1 < 19 && curX+dirX[i]*-1 >= 0 && curX+dirX[i]*-1 < 19)
            if (omokArr[curY + (dirY[i] * -1)][curX + (dirX[i] * -1)] == player)
                return false;

        if(curY + dirY[i]*5 >= 0 && curY+dirY[i]*5 < 19 && curX+dirX[i]*5 >= 0 && curX+dirX[i]*5 < 19)
            if (omokArr[curY + (dirY[i] * 5)][curX + (dirX[i] * 5)] == player)
                return false;

        return true;
    }
}
