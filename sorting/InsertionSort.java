package sorting;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] unsorted = {2,1,888,23,3,3,2,71,32,32,79,1,4,95,567,889};
        int[] result = InsertionSort.sort(unsorted);
        for(int i : result){
            System.out.println(i);
        }
        
    }

    public static int[] sort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int element = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > element) {
                arr[j+1] = arr[j];
                j--;
                
            }
            arr[j+1] = element;
        }
        return arr;
    }
    
}