package DSA_Revision;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int n2 = sc.nextInt();

        System.out.println("GCD/HCF of " + n1 + " and " + n2 + " is : " + getGcd(n1, n2));

        System.out.println("LCM of " + n1 + " and " + n2 + " is : " + getLcm(n1, n2));
    }
    public static int getGcd(int n1, int n2){
        while(n1 != 0 && n2 != 0){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        if(n1 == 0){
            return n2;
        }
        else{
            return n1;
        }
    }
    public static int getLcm(int n1, int n2){
        for(int i = 1; true; i++){
            if(n1 < n2){
                if((n2*i)%n1 == 0){
                    return n2*i;
                }
            }
            else{
                if((n1*i)%n2 == 0){
                    return n1*i;
                }
            }
        }
    }
}
