import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    }
    public static void getPaitWithGivenSum(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }
}