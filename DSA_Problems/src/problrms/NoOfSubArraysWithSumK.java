package problrms;

public class NoOfSubArraysWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(subArrayCntWithSumKBetter(arr, 3));
    }
    public static int subArrayCntWithSumKBruteForce(int[] arr, int k){
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int x = i; x <= j; x++){
                    sum += arr[x];
                }
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static int subArrayCntWithSumKBetter(int[] arr, int k){
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = sum + arr[j];
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
