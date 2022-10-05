package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        HistogramGenerator generator = new HistogramGenerator(data);
        Map<String, Integer> histogram = generator.getHistogram();
        
        for(Map.Entry<String, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }
    
}
