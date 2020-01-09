package dsdoubleylinkedlist;

/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    private Node first;
    private Node last;

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        else {
            first.previous = newNode;

        }
        newNode.next = first;
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        if(isEmpty()){
            first = newNode;
        }else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public void display(){
        Node current = first;
        while(current != null){
            System.out.print(current);
        }
        System.out.println();
    }

}