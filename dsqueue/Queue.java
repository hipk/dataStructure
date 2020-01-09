package dsqueue;

/**
 * Queue
 */
public class Queue {

    private int front;
    private int back;
    private int[] arr;
    private int nItems;
    private int size;

    Queue(int size){
        this.size = size;
        this.arr = new int[size];
        front = 0;
        back = -1;
        nItems = 0;
    }

    public void insert(int data){
        back++;
        arr[back] = data;
        nItems++;
    }

    public int remove(){
        int temp = arr[front];
        front++;
        nItems--;
        if(front == size){
            front = 0;
        }
        return temp;
    }

    public void view(){
        for(int i = front; i <= back; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}