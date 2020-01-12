package recursive;

/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,7,77,654,3,4};
        int ans = search(data, 0, 77);
        System.out.println(ans);
    }

    public static int search(int[] data, int i, int key){
        if (i > data.length-1) {
            return -1;
            
        } else if(data[i] == key) {
            return i;
            
        } else {
            return search(data, i + 1, key);
            
        }
        
    }
}