import sorting.InsertionSort;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{88, 11, 44, 22, 99, 77, 66, 33};
        System.out.println("Array before Sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        merge_sort(arr, 0, arr.length-1);
        System.out.println("\nArray after Sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void merger(int a[],int start,int mid,int end) {
        int i = start;
        int j = mid + 1;
        int t[] = new int[a.length];
        int ti = start;//t-index
        while (i <= mid && j <= end)
        {
            if (a[i] < a[j])
                t[ti++] = a[i++];
            else
                t[ti++] = a[j++];
        }
        while (j <= end)//copy leftover
        {
            t[ti++] = a[j++];
        }
        while (i <= mid)//copy leftover
        {
            t[ti++] = a[i++];
        }
        //copy to a
        for(i=start;i<=end;i++)
            a[i]=t[i];
    }

    static void merge_sort(int a[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            merge_sort(a,start,mid);
            merge_sort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }

}