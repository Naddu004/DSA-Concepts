package problrms;

public class ByeAndSellStocks {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4, 9};
        byeAndSellStocks(arr);
    }
    public static void byeAndSellStocks(int[] arr){
        int byeDay = -1, sellDay = -1, profit = -1;
        for(int i = 0; i < arr.length; i++){    //To Bye
            for(int j = i+1; j < arr.length; j++){  //To Sell
                if(arr[j] - arr[i] > profit){
                    profit = arr[j] - arr[i];
                    byeDay = j;
                    sellDay = i;
                }
            }
        }
        System.out.println(arr[byeDay] + "-" + arr[sellDay] + " = " + profit);
    }
}
