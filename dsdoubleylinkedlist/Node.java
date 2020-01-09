package dsdoubleylinkedlist;

/**
 * Node
 */
public class Node {

    public int data;
    public Node next;
    public Node previous;

     @Override
    public String toString(){
        return "<- " +data + " ->";
    }
}