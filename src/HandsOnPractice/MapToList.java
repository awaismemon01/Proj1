package HandsOnPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Java program to convert Map to List

public class MapToList {
    public static void main(String[] args) {

        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"a");
        integerStringMap.put(2,"b");
        integerStringMap.put(3,"c");
        integerStringMap.put(4,"d");
        integerStringMap.put(5,"e");

        List<Integer> keys = new ArrayList<>(integerStringMap.keySet());
        List<String> values = new ArrayList<>(integerStringMap.values());

        System.out.println(keys);
        System.out.println(values);
    }
}
