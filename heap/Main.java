package heap;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.insert(3);
        h.insert(6);
        h.insert(67);
        h.insert(1);

        // for(Node n : h.heapArray){
        //     System.out.println(n.data);
        // }

        System.out.println(h.remove().data);
        System.out.println(h.remove().data);
    }
}