package problrms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,3,2,4,5,1,8};
        findDuplicateElement1(arr);
    }
    public static void findDuplicateElement1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[i] != -1){
                    System.out.print(arr[i] + " ");
                    arr[j] = -1;
                }
            }
        }
    }
    public static void findDuplicateElement2(int[] arr){
        Set<Integer> unique = new HashSet<>();

    }
}
