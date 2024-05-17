package training.datastructures.linkedlist.leetcode;


public class Demo {

    public static void main(String[] args) {
        MyLinkedList ssl = new MyLinkedList();

        ssl.addAtIndex(0,10);
        ssl.addAtIndex(1,20);
        ssl.addAtIndex(2,30);

        System.out.println(ssl.get(2));

    }
}
