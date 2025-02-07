import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        while(true) {
            String s = br.readLine();
            if (s.equals(".")) break;
            boolean flag = true;

            stack = new Stack<>();
            for(char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')' || c == '}' || c == ']') {
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    char target = stack.pop();
                    switch(c) {
                        case ')':
                            if(target!='(')
                                flag = false;
                            break;
                        case '}':
                            if(target!='{')
                                flag = false;
                            break;
                        case ']':
                            if(target!='[')
                                flag = false;
                            break;
                    }
                }
                if(!flag) break;
            }
            if(!stack.isEmpty())
                flag = false;
            System.out.println(flag ? "yes" : "no");
        }
    }
}



