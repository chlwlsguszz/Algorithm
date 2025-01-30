import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"E");
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int count = 0;
            for(int j=0;j<4;j++) {
                if(Integer.parseInt(st.nextToken())==0) {
                    count++;
                }
            }

            System.out.println(map.get(count));
        }
    }
}



