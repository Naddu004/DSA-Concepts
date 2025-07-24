package searching;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,10,8,1,6};
        System.out.println("Array before Sort.");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        heap_sort(arr);
        System.out.println("\nArray after Sort.");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void heap_sort(int a[])
    {
        int p_c,done;
        for(int i=a.length-1;i>0;i--) {
            for (int j = 0; j <= i; j++) {
                p_c = j;
                while (p_c >= 0 && p_c / 2 >= 0) {
                    if (a[p_c / 2] < a[p_c])
                    {
                        int t = a[p_c / 2];
                        a[p_c / 2] = a[p_c];
                        a[p_c] = t;
                        p_c = p_c / 2;
                    }
                    else{
                        break;
                    }
                }
                int t = a[0];
                a[0] = a[i];
                a[i] = t;
            }
        }
    }
}
