package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> revTreeSet = new TreeSet<>(Comparator.reverseOrder());

        for(int i=0; i<10; i++){
            treeSet.add((int)(Math.random()*100));

        }
        System.out.println("Tree set in natural order : "+treeSet);

        for(int i=0; i<10; i++){
            revTreeSet.add((int)(Math.random()*100));

        }
        System.out.println("Tree set in reverse order : "+revTreeSet);
    }
}
