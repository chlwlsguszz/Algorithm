import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String fileName = br.readLine();
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        for (String key : keySet) {
            System.out.println(key+ " " +map.get(key));
        }
    }
}

