package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
         Queue<Integer>number = new PriorityQueue<>();
          number.add(10);
          number.add(20);
          number.add(30);
          number.add(40);
          number.add(50);

        System.out.println(number);
        System.out.println(number.remove());
        number.offer(60);
         System.out.println(number);

    }
}
