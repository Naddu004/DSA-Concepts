package sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int j = i+1;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    /*
    public static void insertion_sort(int[] arr){
        int i, j, inserted_element;
        for(int i = 0; i < arr.length-1; i++){
            inserted_element = a[i+1];
            int j = i+1;
            while(j > 0 && arr[j-1] > inserted_element){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = inserted_element;
        }
    }
    */
}
