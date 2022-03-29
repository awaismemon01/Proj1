package HandsOnPractice;

import java.util.HashSet;
import java.util.Set;

//Java Program to Calculate the difference between two sets

public class diffInSets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);


        Set<Integer> primeSet = new HashSet<>();
        primeSet.add(2);
        primeSet.add(3);
        primeSet.add(5);
        System.out.println(primeSet);

        set.removeAll(primeSet);

        System.out.println("After removing same values : "+set);

    }
}
