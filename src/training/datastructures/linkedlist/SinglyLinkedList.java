package training.datastructures.linkedlist;

public class SinglyLinkedList {
    int size;
    Node head;

    public SinglyLinkedList(){
        size = 0;
        head = new Node("");
    }

    public String get(int index){

        if(index < 0 || index > size+1) return null; //Invalid index

        Node currentNode = head;

        //move forward to desired index
        for(int i=0; i < index+1 ; i++){
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public void displayAll(){
        if(size > 0) {
            Node currentNode = head;
            for(int i=0; i <size ; i++){
                currentNode = currentNode.next;
                System.out.println(currentNode.value);
            }
        }
    }

    public void addFirst(String data){
        addAtIndex(0, data);
    }
    public void addLast(String data){
        addAtIndex(size, data);
    }
    public void add(String data){
        addAtIndex(size, data);
    }


    public void addAtIndex(int index, String val){
        // If index is greater than the length,
        // the node will not be inserted.
        if (index > size) return;

        // [so weird] If index is negative,
        // the node will be inserted at the head of the list.
        if (index < 0) index = 0;
        ++size;
        Node previousNode = head;
        for(int i=0; i< index ; ++i){
            previousNode = previousNode.next;
        }
        Node newNode = new Node(val);

        newNode.next = previousNode.next;
        previousNode.next = newNode;

    }

}
