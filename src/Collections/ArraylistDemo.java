package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(21);
        alist.add(44);
        alist.add(35);
        alist.add(2);
        alist.add(5);
        System.out.println(alist);


        alist.remove(2);
        System.out.println(alist);

        if(alist.contains(21)) alist.add(2,36);
        System.out.println(alist);

        alist.stream().sorted().forEach(e -> System.out.println(e));

        alist.clear();
        System.out.println(alist);
    }
}
