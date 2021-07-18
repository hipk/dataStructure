package dsStack;

/**
 * Stack
 * message update
 */
public class Stack {

    private int top;
    private int[] arr;
    private int size;

    Stack(int size){
        top = -1;
        this.size = size;
        arr = new int[size];
    }

    // push method 
    public void push(int data){
        if(top == size-1){
            System.out.println("Stack is full.");
            return;
        } 
        else {
            arr[++top] = data;
        }

    }

    public int pop(){
        if(top  >= 0 && top < size){
            return arr[top--];
           
        }else {
            System.out.println("Stack is empty.");
            return -32767;
           
        }
    }

    public void status(){
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}