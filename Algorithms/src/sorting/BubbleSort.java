package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    /*
    public static void bubble_sort(int a[])
    {
        int i,j,temp;
        for(i=0;i<a.length-1;i++)//passes
        {
            for(j=0;j<a.length-1;j++)//sort
            {
                if(a[j]>a[j+1])//swap
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    */
}
