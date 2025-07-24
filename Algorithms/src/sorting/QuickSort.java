package sorting;

public class QuickSort {
    public void quick_sort(int a[],int start,int end)
    {
        int i=start;
        int j=end;
        int pivot=start;
        while(i<j)
        {
            while(a[i]<a[pivot])
                i++;
            while(a[j]>a[pivot])
                j--;
            if(i<j)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        if(i<end)
            quick_sort(a,i+1,end);
        if(start<j)
            quick_sort(a,start,j-1);
    }
}
