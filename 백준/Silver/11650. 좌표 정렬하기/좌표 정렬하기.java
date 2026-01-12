import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int N, M;
    static char board[][];

    static class Point {
        int x, y;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st;

        List<Point> points = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());

            Point p = new Point();
            p.x = Integer.parseInt(st.nextToken());
            p.y = Integer.parseInt(st.nextToken());
            points.add(p);
        }

        Collections.sort(points, (p1, p2) -> {
            if (p1.x != p2.x) return p1.x - p2.x;
            return p1.y - p2.y;
        });

        for(Point p : points)
            System.out.println(p.x + " "+ p.y);
    }
}
