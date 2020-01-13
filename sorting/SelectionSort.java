package sorting;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] unsorted = {2,12,78,543,3,56,12,45,02,12};
        int[] sorted = SelectionSort.sort(unsorted);
        for(int data : sorted){
            System.out.print(data + "\t");
        }
        System.out.println();
    }

    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}