package sorting;

public class SortingMain {
    public static void main(String[] args) {
        int[] arr = new int[]{88, 11, 44, 22, 99, 77, 66, 33};
        System.out.println("Array before Sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        InsertionSort.insertionSort(arr);
        System.out.println("\nArray after Sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
