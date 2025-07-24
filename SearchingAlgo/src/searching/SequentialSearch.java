package searching;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1,9,7,6,14,54,2,34,194,46,71,25,50};
        System.out.println("Index : " + sequentialSort(arr, 2));
    }
    public static int sequentialSort(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println(key + " Found at index " + i);
                return i;
            }
        }
        System.out.println(key + " is not present in Array.");
        return -1;
    }
}
