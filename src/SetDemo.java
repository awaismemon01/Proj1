
import java.util.HashSet;

import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        
        s.add(2);
        s.add(3);
        s.add(2);

        System.out.println(s);


    }
}

