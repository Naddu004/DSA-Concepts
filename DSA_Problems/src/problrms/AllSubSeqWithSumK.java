package problrms;

import java.util.*;

public class AllSubSeqWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 1};
        printAllSubseqWithSumK(0, arr, new ArrayList<Integer>(), 0, 5);
    }
    public static void printAllSubseqWithSumK(int ix, int[] arr, List<Integer> ans, int sum, int k){
        if(ix == arr.length){
            if(sum == k){
                for(int it : ans){
                    System.out.print(it + " ");
                }
                System.out.println();
            }
            return;
        }
        ans.add(arr[ix]);
        sum = sum + arr[ix];
        printAllSubseqWithSumK(ix+1, arr, ans, sum, k);
        ans.removeLast();
        sum = sum - arr[ix];
        printAllSubseqWithSumK(ix+1, arr, ans, sum, k);
    }
}
