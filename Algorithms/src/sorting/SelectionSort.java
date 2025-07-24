package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    /*
    public static void selection_sort(int a[])
    {
        int i,j,min,pos;
        for(i=0;i<a.length-1;i++)//passes
        {
            min=a[i];pos=i;//ref
            for(j=i+1;j<a.length;j++)
            {
                if(a[j]<min)//update
                {
                    min=a[j];
                    pos=j;
                }
            }
            a[pos]=a[i];
            a[i]=min;
        }
    }
    */
}
