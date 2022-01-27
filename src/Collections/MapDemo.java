package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String > values = new HashMap<>();

        values.put(1,"A");
        values.put(3,"C");
        values.put(2,"B");
        System.out.println(values);

        values.put(3,"D");
        System.out.println(values);

        System.out.println("Keys : ");
        for (Map.Entry<Integer,String> e:
             values.entrySet()) {
            System.out.println(e.getKey());
        }

        //Another way of getting keys or values
        //values.keySet().forEach(System.out::println);
        //values.ValueSet().forEach(System.out::println);

        System.out.println("Values : ");
        for (Map.Entry<Integer,String> e:
                values.entrySet()) {
            System.out.println(e.getValue());
        }

    }
}
