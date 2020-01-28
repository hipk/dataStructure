package heap;

/**
 * Heap
 */
public class Heap {

    public Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int size){
        this.maxSize = size;
        currentSize = 0;
        heapArray = new Node[size];
    }

    public boolean insert(int data){
        if(currentSize == maxSize){
            return false;
        }

        Node newNode = new Node();
        newNode.data = data;
        heapArray[currentSize] = newNode;
        trickleUp(currentSize);

        currentSize++;
        return true;

    }

    public void trickleUp(int idx){
        int parentIdx = (idx-1) / 2;
        Node nodeToInsert = heapArray[idx];

        // loop as long as we haven't reached the root and key 
        // node parents is less than root

        while(idx > 0 && heapArray[parentIdx].data < nodeToInsert.data){
            heapArray[idx] = heapArray[parentIdx];
            idx = parentIdx;
            parentIdx = (parentIdx -1) / 2;

        }
        heapArray[idx] = nodeToInsert;
    }

    public void trickleDown(int idx){

        int largerChildIdx;
        Node top = heapArray[idx]; // saving last node

        // will run as long as index is not on the bootom row

        while(idx < currentSize/2 ){
            // left child
            int leftChildIdx = 2*idx + 1;
            int rightChildIdx = 2 * idx + 2;

            // figure out
            if(rightChildIdx < currentSize && heapArray[leftChildIdx].data < heapArray[rightChildIdx].data){
                largerChildIdx = rightChildIdx;
            }else {
                largerChildIdx = leftChildIdx;
            }

            if(top.data >= heapArray[largerChildIdx].data){
                // successful
                break;
            }
            heapArray[idx]  = heapArray[largerChildIdx];
            idx =largerChildIdx;
        }
        
        heapArray[idx] = top;

    }


    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];

        trickleDown(0);
        return root;


    }
}