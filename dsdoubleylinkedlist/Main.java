package dsdoubleylinkedlist;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList ds = new DoublyLinkedList();
       
        ds.insertFirst(1);
        ds.insertFirst(2);
        ds.insertFirst(3);
        ds.insertFirst(555555);
        //ds.status();
        ds.insertAfter(3, 4444);
        ds.display();
        ds.deleteKey(4444);
        ds.display();

        
    }
}