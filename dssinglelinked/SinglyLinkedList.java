package dssinglelinked;

/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    private Node first;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next != null){
            current =  current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = temp.next;
        return temp;
    }

    public void display(){
        Node current = first;
        while(current != null){
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }


    public boolean isEmpty(){
        return (first == null);
    }
}