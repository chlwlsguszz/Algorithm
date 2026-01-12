import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class Main {
    static int N, M;
    static char board[][];

    static class Person {
        int age;
        String name;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st;

        List<Person> people = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());

            Person p = new Person();
            p.age = Integer.parseInt(st.nextToken());
            p.name = st.nextToken();
            people.add(p);
        }

        Collections.sort(people, (x, y) -> x.age - y.age);

        for(Person p : people)
            System.out.println(p.age + " "+ p.name);
    }
}
