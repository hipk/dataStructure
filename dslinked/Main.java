package dslinked;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
         a.data = 1;
         b.data = 3;
         c.data = 5;

         a.next = b;
         b.next =c;
         c.next = null;

         int length = 0;
         while(a != null){
             length++;
             a = a.next;
         }
         System.out.println(length);
    }
}