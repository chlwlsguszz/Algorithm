import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String[] signArray = new String[9];
    static int[] maxRes = {9,8,7,6,5,4,3,2,1,0};
    static int[] minRes = {0,1,2,3,4,5,6,7,8,9};
    static int K;


    public static void main(String[] args) throws IOException {
       K = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());
       for(int i=0;i<K;i++) {
           signArray[i] = st.nextToken();
       }

        do {
            findMax(0);
        } while (!checkMax());

        do {
            findMin(0);
        } while (!checkMin());

       for(int i=0;i<=K;i++) {
           System.out.print(maxRes[i]);
       }
       System.out.println();
       for(int i=0;i<=K;i++) {
           System.out.print(minRes[i]);
       }
    }

    static void findMax(int i) {
        if(i+1 > K) {
            return;
        }

        if(signArray[i].equals("<")) {
            if(maxRes[i] > maxRes[i+1]) {
                int temp = maxRes[i];
                maxRes[i] = maxRes[i+1];
                maxRes[i+1] = temp;
            }
        }

        else {
            if(maxRes[i] < maxRes[i+1]) {
                int temp = maxRes[i];
                maxRes[i] = maxRes[i+1];
                maxRes[i+1] = temp;
            }
        }

        findMax(i+1);
    }

    static boolean checkMax() {
        int count=0;
        for(int i=0;i<K;i++) {
            count++;
            if(signArray[i].equals("<") && maxRes[i] > maxRes[i+1]) break;
            else if(signArray[i].equals(">") && maxRes[i] < maxRes[i+1]) break;
        }
        if(count == K)
            return true;
        else
            return false;
    }

    static void findMin(int i) {
        if(i+1 > K) {
            return;
        }

        if(signArray[i].equals("<")) {
            if(minRes[i] > minRes[i+1]) {
                int temp = minRes[i];
                minRes[i] = minRes[i+1];
                minRes[i+1] = temp;
            }
        }

        else {
            if(minRes[i] < minRes[i+1]) {
                int temp = minRes[i];
                minRes[i] = minRes[i+1];
                minRes[i+1] = temp;
            }
        }

        findMin(i+1);
    }

    static boolean checkMin() {
        int count=0;
        for(int i=0;i<K;i++) {
            count++;
            if(signArray[i].equals("<") && minRes[i] > minRes[i+1]) break;
            else if(signArray[i].equals(">") && minRes[i] < minRes[i+1]) break;
        }
        if(count == K)
            return true;
        else
            return false;
    }

}



