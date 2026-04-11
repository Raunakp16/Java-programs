import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){

        // Creating list
        LinkedList<Integer> list = new LinkedList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Display LinkedList
        System.out.println(" Linked List " + list);

        // Adding element to first position
        list.addFirst(5);
        // Adding element to last position
        list.addLast(35);

        // removing an element
        list.remove(1);

        // Display updated linked list
        System.out.println(" Updated LinkedList " + list);

        // Get first and last
        System.out.println(" First element:" + list.getFirst());

        // Get last element
        System.out.println(" Last element " + list.getLast());

        // Get size of list
        System.out.println(" size of linkedlist : " +list.size());
    }

}
