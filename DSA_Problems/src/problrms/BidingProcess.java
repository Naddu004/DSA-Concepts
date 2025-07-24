package problrms;

import java.util.Scanner;

public class BidingProcess {
    public static void main(String[] args) {
        biding();
    }
    public static void biding() {
        double price = 1100;
        double nearest = 999999;
        int user = 0;
        Scanner sc = new Scanner(System.in);

        double guess, cost=0;

        while (true){
            user++;
            System.out.print("Guess Price of Cost : ");
            guess = sc.nextInt();
            if(guess == 0){
                System.out.println("User : " + user + "\nPrice : " + price + "\nGuess is : " + cost);
                break;
            }
            if(Math.abs(price-guess) < nearest ){
                nearest = Math.abs(price-guess);
                cost = guess;
            }
        }
    }
}
