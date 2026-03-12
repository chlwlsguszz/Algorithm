import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        int number = 1;

        for(int i=0;i<n;i++) {
            int target = Integer.parseInt(br.readLine());

            while(number <= target) {
                stack.push(number++);
                sb.append("+").append("\n");
            }

            if(!stack.isEmpty() && target == stack.peek()) {
                stack.pop();
                sb.append("-").append("\n");
            }

            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);

    }
}


