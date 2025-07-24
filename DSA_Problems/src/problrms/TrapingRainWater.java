package problrms;

public class TrapingRainWater {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trapingRainWater(arr);
    }
    public static void trapingRainWater(int[] arr){
        int water = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == 0 || arr[i+1] == 0){
                continue;
            }
            else{
                if(arr[i] < arr[i+1]){
                    water += arr[i];
                }
                else{
                    water += arr[i+1];
                }
            }
        }
        System.out.println(water);
    }
}
