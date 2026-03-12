import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int sum = 0;
        int max = -4000;
        int min = 4000;

        for (int i=0;i<n;i++) {
            int x = Integer.parseInt(br.readLine());
            sum += x;
            min = Math.min(min,x);
            max = Math.max(max,x);
            array[i] = x;

            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

        Arrays.sort(array);

        int middleValue = array[n/2];

        int maxFreq = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : freqMap.keySet()) {
            if(maxFreq <= freqMap.get(i)) {
                if(maxFreq == freqMap.get(i))
                    result.add(i);
                else {
                    maxFreq = freqMap.get(i);
                    result.clear();
                    result.add(i);
                }
            }
        }

        System.out.println(Math.round((float)sum/n));

        System.out.println(middleValue);

        if(result.size() > 1) {
            Collections.sort(result);
            System.out.println(result.get(1));
        }
        else
            System.out.println(result.get(0));

        System.out.println(max-min);

    }
}


