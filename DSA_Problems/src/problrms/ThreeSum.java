package problrms;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = new int[] {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] arr){
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null );
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}
