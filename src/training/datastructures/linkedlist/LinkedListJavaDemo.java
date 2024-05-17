package training.datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListJavaDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
        list.add(2, "Java");
        System.out.println(list);
    }
}
