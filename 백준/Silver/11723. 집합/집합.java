import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("all")) {
                for(int j=1;j<=20;j++)
                    hashSet.add(j);
            }
            else if(command.equals("empty")) {
                hashSet.clear();
            }
            else {
                int x = Integer.parseInt(st.nextToken());
                switch (command) {
                    case "add":
                        hashSet.add(x);
                        break;
                    case "remove":
                        hashSet.remove(x);
                        break;
                    case "check": {
                        if (hashSet.contains(x)) sb.append(1).append("\n");
                        else sb.append(0).append("\n");
                        break;
                    }
                    case "toggle": {
                        if(hashSet.contains(x)) hashSet.remove(x);
                        else hashSet.add(x);
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}


