package problrms;

public class Armstrrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
    }
    public static boolean isArmstrong(int n) {
        int temp=n;
        int sum=0;
        while(temp!=0) {
             sum=sum+(temp%10)*(temp%10)*(temp%10);
           // sum=sum+(int) Math.pow(temp%10, 3);
             temp=temp/10;
        }
        return sum == n;
    }
}
