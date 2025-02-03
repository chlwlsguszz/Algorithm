import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            String cmd = br.readLine();

            if(cmd.contains("push")) {
                int val = Integer.parseInt(cmd.split(" ")[1]);
                stack.push(val);
            }
            else if(cmd.equals("pop")) {
                if(stack.isEmpty())
                    bw.write(String.valueOf(-1)+"\n");
                else {
                    int val = stack.pop();
                    bw.write(String.valueOf(val)+"\n");
                }
            }
            else if(cmd.equals("size")) {
                bw.write(String.valueOf(stack.size())+"\n");
            }
            else if(cmd.equals("empty")) {
                if(stack.isEmpty())
                    bw.write(String.valueOf(1)+"\n");
                else
                    bw.write(String.valueOf(0)+"\n");
            }
            else if(cmd.equals("top")) {
                if(stack.isEmpty())
                    bw.write(String.valueOf(-1)+"\n");
                else {
                    int val = stack.peek();
                    bw.write(String.valueOf(val)+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
