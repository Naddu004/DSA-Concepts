package DSA_Revision;

public class DuplicateAndMissing {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 9, 5, 6, 2, 6, 7, 8, 4};
        System.out.println(getDuplicate(arr));
    }
    public static int getDuplicate(int[] arr){
        int slow = 0;
        int fast = 0;
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        fast = 0;
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
