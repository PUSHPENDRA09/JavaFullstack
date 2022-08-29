package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    public static void main(String[] args) {

        Deque <String> cities = new ArrayDeque<>();

        cities.addFirst("pune");
        cities.addFirst("mumbai");
        cities.addLast("Ooty");
        cities.addLast("nagpur");
        System.out.println(cities);

    }
}
