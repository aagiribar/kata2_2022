package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {4, 1, 2, 4, 7, 9, 3, 5, 7, 2, 0, 1, 3, 5, 3, 3, 5};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? 
                            histogram.get(key) + 1 : 1);
        }
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }
    
}
