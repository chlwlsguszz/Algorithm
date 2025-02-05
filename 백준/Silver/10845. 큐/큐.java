import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            String cmd = br.readLine();

            if(cmd.contains("push")) {
                int val = Integer.parseInt(cmd.split(" ")[1]);
                deque.addLast(val);
            }
            else if(cmd.equals("pop")) {
                if(deque.isEmpty())
                    bw.write(String.valueOf(-1)+"\n");
                else {
                    int val = deque.pollFirst();
                    bw.write(String.valueOf(val)+"\n");
                }
            }
            else if(cmd.equals("size")) {
                bw.write(String.valueOf(deque.size())+"\n");
            }
            else if(cmd.equals("empty")) {
                if(deque.isEmpty())
                    bw.write(String.valueOf(1)+"\n");
                else
                    bw.write(String.valueOf(0)+"\n");
            }
            else if(cmd.equals("front")) {
                if(deque.isEmpty())
                    bw.write(String.valueOf(-1)+"\n");
                else {
                    int val = deque.getFirst();
                    bw.write(String.valueOf(val)+"\n");
                }
            }
            else if(cmd.equals("back")) {
                if(deque.isEmpty())
                    bw.write(String.valueOf(-1)+"\n");
                else {
                    int val = deque.getLast();
                    bw.write(String.valueOf(val)+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
