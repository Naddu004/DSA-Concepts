package problrms;

import java.util.*;

public class Sum4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,-1,0,-2,2};
        System.out.println(sum4(arr, arr.length, 0));
    }
    public static List<List<Integer>> sum4(int[] arr, int n, int target){
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    for(int l = k+1; l < n; l++){
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if(sum == target){
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
