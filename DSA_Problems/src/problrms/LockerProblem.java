package problrms;

public class LockerProblem {
    public static void main(String[] args) {
        int[] locker = new int[100];
        int len = locker.length;
        printArray(locker, len);
        System.out.println();
        for(int i = 1; i <= len; i++){
            for(int j = i; j <= len; j = j + i){
                if(locker[j-1] == 0){
                    locker[j-1] = 1;
                }
                else if(locker[j-1] == 1){
                    locker[j-1] = 0;
                }
            }
        }
        printLockerNumber(locker, len);
    }
    public static void printArray(int[] arr, int len){
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static  void printLockerNumber(int[] arr, int len){
        for(int i = 0; i < len; i++){
            if(arr[i] == 1){
                System.out.print(i+1 + " ");
            }
        }
    }
}
