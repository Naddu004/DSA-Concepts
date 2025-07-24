package DSA_Revision;

public class RotateArrayByOneStep {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = arr.length;

        System.out.println("<--- Before Rotation --->");
        printArray(arr);

        rotateArrayByKSteps(arr, 4);

        System.out.println("<--- After Rotation ---->");
        printArray(arr);
    }
    public static void rotateArrayByOneStep(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void rotateArrayByKSteps(int[] arr, int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //PRINT ARRAY
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
