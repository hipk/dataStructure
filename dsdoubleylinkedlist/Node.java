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
        String nextData;
        String previousData;
        if(next != null){
            nextData = Integer.toHexString(this.next.hashCode());
        }else {
            nextData = "null    ";
        }

        if(previous != null){
            previousData = Integer.toHexString(this.previous.hashCode());
        }else {
            previousData = "null    ";
        }
        return  getClass().getSimpleName()
                + " "
                + Integer.toHexString(hashCode()) 
                + " : " + String.format("%8d", data)
                + " Next " + nextData
                + " Previous "  
                + previousData 
                + " | ";
    }
}