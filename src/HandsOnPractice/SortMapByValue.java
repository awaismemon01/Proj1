package HandsOnPractice;

import java.util.*;

//Java program to sort Map by value

public class SortMapByValue {
    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Delhi");
        map.put(2,"Mumbai");
        map.put(3,"Bangalore");
        map.put(4,"Ahmedabad");
        map.put(5,"Chennai");

        Map<Integer,String> sortedMap = sortMap(map);

        for (Map.Entry e:
             sortedMap.entrySet()) {
            System.out.print("Key : "+ e.getKey());
            System.out.println("\tValue : "+ e.getValue());
        }
    }

    public static LinkedHashMap sortMap(Map<Integer,String> map) {
        List<Map.Entry<Integer,String>> cities = new LinkedList<>(map.entrySet());

        Collections.sort(cities,(l1,l2)->l1.getValue().compareTo(l2.getValue()));

        LinkedHashMap<Integer,String> result = new LinkedHashMap<>();

        for (Map.Entry<Integer,String> entry:
             cities) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
