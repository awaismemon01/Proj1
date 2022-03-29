package HandsOnPractice;

import java.util.HashSet;
import java.util.Set;

//Java Program to Calculate union of two sets

public class SetUnion {
    public static void main(String[] args) {

        Set<Integer> evenSet = new HashSet<>();

        evenSet.add(2);
        evenSet.add(4);
        evenSet.add(6);
        evenSet.add(8);

        System.out.println("Even Set :"+evenSet);

        Set<Integer> oddSet = new HashSet<>();

        oddSet.add(1);
        oddSet.add(3);
        oddSet.add(5);
        oddSet.add(7);

        System.out.println("Odd Set :"+oddSet);

        Set<Integer> union = new HashSet<>(evenSet);
        union.addAll(oddSet);
        System.out.println("Union : "+union);
    }
}
