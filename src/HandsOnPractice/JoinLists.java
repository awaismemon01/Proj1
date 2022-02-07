package HandsOnPractice;

import java.util.ArrayList;
import java.util.List;

//Java program to join two lists

public class JoinLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add((int) (Math.random()*100));
        list.add((int) (Math.random()*100));
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add((int) (Math.random()*100));

        System.out.println(list2);
        list2.addAll(list);
        System.out.println(list2);

    }
}
