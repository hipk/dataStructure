package recursive;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,7,77,654,3,4};
        int ans = search(data, 3, 0, data.length -1);
        System.out.println(ans);
        
    }

    public static int search(int[] data , int key, int low , int high){
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
            
        } else if(data[mid] == key){
            return mid;
            
        }else if(data[mid] > key){
            return search(data, key, low, mid-1);
        } else {
            return search(data, key, mid+1, high);
        }
    }
}