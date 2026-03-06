import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int x;
        int y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Point[] points = new Point[N];

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            Point p = new Point();
            p.x = Integer.parseInt(st.nextToken());
            p.y = Integer.parseInt(st.nextToken());
            points[i] = p;
        }

        Arrays.sort(points, (p1, p2) -> {
            if(p1.y == p2.y)
                return p1.x - p2.x;
            else
                return p1.y-p2.y;
        });

        for(Point p : points)
            System.out.println(p.x + " " +p.y);


    }

}


