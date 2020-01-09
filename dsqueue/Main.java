package dsqueue;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(4);
        q.insert(1);
        q.insert(99);
        q.insert(78);
        q.insert(34);
        q.view();
        System.out.println(q.remove());
        q.view();
        System.out.println(q.remove());
        q.view();
        System.out.println(q.remove());
        q.view();
        System.out.println(q.remove());
        q.view();
    }
}