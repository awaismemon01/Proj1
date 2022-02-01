package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(2);
        queue.add(25);
        queue.add(17);
        queue.add(15);

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.offer(35);
        System.out.println(queue);

        System.out.println(queue.element());

        queue.poll();
        System.out.println(queue);

        queue.stream().sorted().forEach(e -> System.out.println(e));

        queue.clear();
        System.out.println("Queue is now empty : "+queue);
        System.out.println();
        for(int i=0; i<10; i++){
            queue.add((int)(Math.random()*100));

        }
        System.out.println(queue+"\n");
        System.out.println("Getting values by using Iterator: ");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
