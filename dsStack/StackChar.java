package dsStack;

/**
 * Stack
 */
public class StackChar {

    private int top;
    private char[] arr;
    private int size;

    StackChar(int size){
        top = -1;
        this.size = size;
        arr = new char[size];
    }

    // push method 
    public void push(char data){
        if(top == size-1){
            System.out.println("Stack is full");
            return;
        } 
        else {
            arr[++top] = data;
        }

    }

    public char pop(){
        if(top  >= 0 && top < size){
            return arr[top--];
           
        }else {
            System.out.println("Stack is empty");
            return '\n';
           
        }
    }

    public void status(){
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}