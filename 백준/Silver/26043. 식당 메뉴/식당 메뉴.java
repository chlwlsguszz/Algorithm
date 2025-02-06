import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Queue<Student> studentQ = new LinkedList<>();
    static Queue<String> cafeQ = new LinkedList<>();
    static ArrayList<Integer> listA = new ArrayList<>();
    static ArrayList<Integer> listB = new ArrayList<>();
    static ArrayList<Integer> listC = new ArrayList<>();

    static class Student {
        int id;
        String menu;

        public Student(int id, String menu) {
            this.id = id;
            this.menu = menu;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            if(type.equals("1")) {
                int a = Integer.parseInt(st.nextToken());
                String b = st.nextToken();
                studentQ.add(new Student(a,b));
            }
            else {
                String b = st.nextToken();
                cafeQ.add(b);
            }

            if(!cafeQ.isEmpty() && !studentQ.isEmpty()) {
                Student student = studentQ.poll();
                String menu = cafeQ.poll();
                if (student.menu.equals(menu)) {
                    listA.add(student.id);
                } else
                    listB.add(student.id);
            }
        }

        for(Student student: studentQ) {
            listC.add(student.id);
        }

        listA.sort(Comparator.naturalOrder());
        listB.sort(Comparator.naturalOrder());
        listC.sort(Comparator.naturalOrder());

        if(listA.isEmpty())
            System.out.print("None");
        else {
            for (int id : listA) {
                System.out.print(id+" ");
            }
        }
        System.out.println();

        if(listB.isEmpty())
            System.out.print("None");
        else {
            for (int id : listB) {
                System.out.print(id+" ");
            }
        }
        System.out.println();

        if(listC.isEmpty())
            System.out.print("None");
        else {
            for (int id : listC) {
                System.out.print(id+" " );
            }
        }
    }
}



