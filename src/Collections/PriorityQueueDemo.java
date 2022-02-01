package Collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
      //PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<10; i++){
            priorityQueue.add((int)(Math.random()*100));

        }
//        priorityQueue.add(44);
//        priorityQueue.add(12);
//        priorityQueue.add(4);
//        priorityQueue.add(20);

        System.out.println(priorityQueue);

        priorityQueue.poll();
        priorityQueue.poll();
        priorityQueue.poll();
        System.out.println(priorityQueue);
        System.out.println();

        Queue<Integer> priorityQueue2 = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<10; i++){
            priorityQueue2.add((int)(Math.random()*100));

        }

        System.out.println("Reverse Ordered : "+priorityQueue2);
    }
}
