package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
//        Deque<Integer> deque1 = new ArrayDeque<>();

        System.out.println("Adding Elements : ");
        deque.add(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(6);
        deque.addLast(5);
        System.out.println(deque);

        System.out.println("Checking elements at first and Last");
        System.out.println(deque.peek());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println("Removing elements from first and last");
        deque.pollFirst();
        deque.poll();
        deque.pollLast();
        System.out.println(deque);

        System.out.println("Adding elements from 1 to 5");
        for (int i=1 ; i<6 ; i++) deque.addFirst(i);
        System.out.println(deque);

        System.out.println("Printing Even values from Deque by Streams");

        deque.stream().filter(e -> e%2==0).forEach(integer -> System.out.println(integer));

    }
}
