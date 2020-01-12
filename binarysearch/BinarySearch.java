package binarysearch;

/**
 * BinarySearch
 */
public class BinarySearch {

    int[] data;
    int key;

    BinarySearch(int[] data, int key){
        this.data = data;
        this.key = key;

    }

    public int search(){

        int low = 0;
        int high = data.length - 1;
        int mid = (low + high) / 2;
        while(data[mid] != key && high > low){
            if(data[mid] < key){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if(data[mid] == key){
            return mid;
        }else {

            return -1;
        }
        
    }
    
}