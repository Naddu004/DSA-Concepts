package problrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        ArrayList<Integer> list = getAllPrimeNumbersLessThan(num);
        System.out.println(list);
    }
//    This is Sieve Of Eratosthenes Algorithm to find out prime numbers between 1 to given number
    public static ArrayList<Integer> getAllPrimeNumbersLessThan(int num){
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[num+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i = 2; i <= num; i++){  // this loop iterate through boolean array and if it finds prime No then add to list
            if(prime[i]){
                list.add(i);
            }
            for(int j = 2; i*j <= num; j++){    // this loop marks all multiple indexes of current number as not prime
                if(prime[i*j]){
                    prime[i*j] = false;
                }
            }
        }
        return list;
    }
}