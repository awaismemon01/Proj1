package Collections;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();



//        System.out.println(set1.hashCode());

        for(int i=0; i<10; i++){
            set1.add((int)(Math.random()*100));

        }

        Set<Integer> set2 = new HashSet<>();
        for (int e:
             set1) {
            set2.add(e);
        }
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        System.out.println("Set1 : "+set1);
        System.out.println("Set2 : "+set2);



        System.out.println("Does Set1 consists all elements of Set2 : "+ set1.containsAll(set2));
        System.out.println("Does Set2 consists all elements of Set1 : "+ set2.containsAll(set1));

        System.out.println();
        set1.remove(2);
        System.out.println("Set1 : "+set1+"\n");

        System.out.println("Removing all odd integers from set2 : ");
        Set<Integer> evenSet = set2.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toSet());
        System.out.println(evenSet);

//        Iterator<Integer> iterator = set2.iterator();


        System.out.println("\nSet2 : "+set2);
    }
}

