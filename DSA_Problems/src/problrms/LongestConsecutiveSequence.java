package problrms;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{102, 4, 100, 1, 101, 3, 2, 1, 104, 1, 103};
        int longSeq = 1;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int cnt = 1;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == num+1){
                    num++;
                    cnt++;
                    j = -1;
                }
            }
            if(longSeq < cnt){
                longSeq = cnt;
            }
        }
        System.out.println(longSeq);
    }
}
