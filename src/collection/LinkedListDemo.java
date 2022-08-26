package collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

    public static void main(String[] args) {
        // List<String> fruits=new LinkedList<>();
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("grapes");
        System.out.println(fruits);
        fruits.addFirst("banana");
        System.out.println(fruits);
        fruits.addLast("chikoo");
        System.out.println(fruits);

        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        Iterator descIterator = fruits.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next()+"");

        }
        System.out.println(fruits.offer("watermelon"));

        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(fruits.peekFirst());
        System.out.println(fruits.peekLast());
        System.out.println(fruits.poll());
    }
}


