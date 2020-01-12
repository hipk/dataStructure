package binarysearch;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,56,77,88,99,102};
        BinarySearch s = new BinarySearch(a, 88);
        System.out.println(s.search());
    }
}