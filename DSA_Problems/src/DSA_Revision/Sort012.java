package DSA_Revision;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 2, 0, 1, 2, 0, 2, 1};

        System.out.println("<--- Before Sort --->");
        printArray(arr);

        sort012s(arr);

        System.out.println("<--- After Sort ---->");
        printArray(arr);
    }
    public static  void sort012s(int[] arr){
        int i = 0;
        int j = 0;
        int k = arr.length-1;

        while(j <= k){
            if(arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
            else if(arr[j] == 2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
            else{
                j++;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
