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
        newNode.previous = null;
        first = newNode;
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

    public boolean insertAfter(int key, int data){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;
        if(current == last){
            current.next = null;
            last = newNode;
        }
        else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }

        current.next = newNode;
        newNode.previous = current;
        return true;
    }

    public void deleteFirst(){
        // assuming linked list is not empty
        System.out.println("Deleteing first Node-----------------");
        if(first.next == null){
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
    }

    public void deleteLast(){
        if(first.next == null){
            first = null;
        }
        else {
            last.previous.next = null;
        }
        last = last.previous;
    }

    public boolean deleteKey(int key){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current.next == null){
                return false;
            }
        }
        if(current == last){
            last = current.previous;
        }
        else{
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }

        return true;
    }

    public void display(){
        System.out.println("..........................................................");
        Node current = first;
        while(current != null){
            System.out.println(current);
            current = current.next;
        }
        System.out.println("..........................................................");
        System.out.println();
    }

    public void status(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("first " + first );
        System.out.println("last  " + last  );
        System.out.println("----------------------------------------------------------------");

        System.out.println();
    }

}