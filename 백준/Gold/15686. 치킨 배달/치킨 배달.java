import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getDistance(Point p) {
            return Math.abs(x - p.x) + Math.abs(y - p.y);
        }
    }
    static ArrayList<Point> housePointArray = new ArrayList<>();
    static ArrayList<Point> storePointArray = new ArrayList<>();
    static List<List<Point>> combinations = new ArrayList<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                int number = Integer.parseInt(st.nextToken());
                if(number == 1)
                    housePointArray.add(new Point(i, j));
                else if (number == 2)
                    storePointArray.add(new Point(i, j));
            }
        }

        // 치킨집 조합 생성
        combination(0, new ArrayList<>());

        int minChickenDistance = Integer.MAX_VALUE;

        for(List<Point> selectedCombination : combinations) {
            minChickenDistance = Math.min(minChickenDistance, getChickenDistance(selectedCombination));
        }

        System.out.println(minChickenDistance);
    }

    //start 인덱스 -> 중복 선택 방지
    static void combination(int start, List<Point> selected) {
        if (selected.size() == M) {
            combinations.add(new ArrayList<>(selected));
            return;
        }

        for (int i = start; i < storePointArray.size(); i++) {
            selected.add(storePointArray.get(i));
            combination(i + 1, selected); // 다음 요소 선택
            selected.remove(selected.size() - 1); // 백트래킹
        }
    }

    static int getChickenDistance(List<Point> combination) {
        int totalDistance = 0;

        for(Point house : housePointArray) {
            int minDistance = Integer.MAX_VALUE;
            for(Point store : combination) {
                minDistance = Math.min(minDistance, house.getDistance(store));
            }
            totalDistance += minDistance;
        }

        return totalDistance;
    }
}

