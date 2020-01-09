package dscircularLinked;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertFirst(4);
        cl.insertFirst(56);
        cl.insertFirst(79);
        cl.display();
        cl.insertLast(45);
        cl.display();
    }
}