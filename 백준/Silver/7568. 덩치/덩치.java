import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static class Person {
        int x;
        int y;

        int peopleBigger = 0;
        int rank;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Person[] people = new Person[N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());

            Person p = new Person();
            p.x = Integer.parseInt(st.nextToken());
            p.y = Integer.parseInt(st.nextToken());
            people[i] = p;
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j) continue;

                if(people[i].x < people[j].x && people[i].y < people[j].y){
                    people[i].peopleBigger++;
                }
            }
        }

        // new list to sort
        /*List<Person> sortedPeople = new ArrayList<>();
        Collections.addAll(sortedPeople, people);
        sortedPeople.sort(Comparator.comparingInt(p -> p.peopleBigger));

        sortedPeople.get(0).rank = 1;
        int lastRank = 1;
        for(int i=1;i<N;i++){
            Person current = sortedPeople.get(i);
            Person prev = sortedPeople.get(i-1);

            if(current.peopleBigger == prev.peopleBigger){
                current.rank = lastRank;
            } else {
                current.rank = i+1;
                lastRank = i+1;
            }
        }*/

        for(Person p : people){
            System.out.print(p.peopleBigger + 1 + " ");
        }

    }
}