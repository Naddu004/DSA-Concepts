package problrms;

public class Prime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 7, 2, 1};
        System.out.println(isPalindrom(arr,0,arr.length-1));
    }
    public static boolean isPalindrom(int[] arr, int i, int j){
        if(i>j)
        {
            return true;
        }
        if(arr[i]==arr[j]){
            i++;
            j--;
            return isPalindrom(arr,i,j);
        }
        else{
            return false;
        }
    }
    public static void recReverse(int[] arr, int i, int j){

    }
    public void printArray(int[] arr){
        for(int it : arr){
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
