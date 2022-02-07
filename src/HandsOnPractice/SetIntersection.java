package HandsOnPractice;

import java.util.HashSet;
import java.util.Set;

//Java Program to Calculate the intersection of two sets

public class SetIntersection {
    public static void main(String[] args) {

        Set<Integer> evenSet = new HashSet<>();

        evenSet.add(2);
        evenSet.add(4);
        evenSet.add(6);
        evenSet.add(8);
        System.out.println("Even Set :"+evenSet);

        Set<Integer> numbersSet = new HashSet<>();

        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);
        numbersSet.add(6);
        numbersSet.add(7);
        numbersSet.add(8);
        System.out.println("Numbers Set :"+numbersSet);

        numbersSet.retainAll(evenSet);
        System.out.println("Intersection :"+numbersSet);
    }
}
