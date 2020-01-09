package dssinglelinked;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertFirst(2);
        sl.insertFirst(45);
        sl.insertFirst(67);
        sl.insertFirst(88);
        sl.display();
        sl.insertLast(999);
        sl.display();
    }
}