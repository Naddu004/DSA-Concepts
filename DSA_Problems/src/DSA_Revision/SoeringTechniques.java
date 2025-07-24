package DSA_Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class SoeringTechniques {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 0, 5 , 8, 1, 3 , 4 , 1 , 2, 9, 6, 7};
        int length = arr.length;
        System.out.println("<--- Before Sorting --->");
        printArray(arr);
        quickSort(arr, 0, length-1);
        System.out.println("<--- After Sorting ---->");
        printArray(arr);
    }

    //SELECTION SORT
    public static void selectionSort(int[] arr, int length){
        for(int i = 0; i < length; i++){
            int minIndex = i;
            for(int j = i+1; j < length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    //BUBBLE SORT
    public static void bubbleSort(int[] arr, int length){
        for(int i = 0; i < length-1; i++){
            for(int j = 0; j < length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //INSERTION SORT
    public static void insertionSort(int[] arr, int length){
        for(int i = 1; i < length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    //MERGE SORT
    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid+1;
        ArrayList<Integer> sortedList = new ArrayList<>();
        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                sortedList.add(arr[left]);
                left++;
            }
            else{
                sortedList.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            sortedList.add(arr[left]);
            left++;
        }
        while(right <= end){
            sortedList.add(arr[right]);
            right++;
        }
        for(int i = start; i <= end ; i++) {
            arr[i] = sortedList.get(i-start);
        }
    }

    //QUICK SORT
    public static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int position = getPosition(arr, start, end);
        quickSort(arr, start, position-1);
        quickSort(arr, position+1, end);
    }
    public static int getPosition(int[] arr, int start, int end){
        int i = start;
        int j = end;
        int pivot = arr[start];
        while(i < j){
            while(i < end && arr[i] <= pivot){
                i++;
            }
            while(j > start && arr[j] > pivot){
                j--;
            }
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    //PRINT ARRAY
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
