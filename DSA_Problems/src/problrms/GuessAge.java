package problrms;

import java.util.Scanner;

public class GuessAge {
    public static void main(String[] args) {
        guessAge();
    }
    public static void guessAge(){
        Scanner sc = new Scanner(System.in);
        int ageToGuess = 54;
        int guess;

        System.out.println("Total Guesses are 10");
        System.out.print("Enter a guess for age : ");
        guess = sc.nextInt();

        int cnt = 1;
        while(true){
            if(guess == ageToGuess){
                System.out.println("You Guessed it Right.");
                break;
            }
            else if(ageToGuess < guess) {
                System.out.println("less than it.");
                System.out.println("Guess are remaining : " + (10-cnt));
                System.out.print("Enter a guess for age : ");
                guess = sc.nextInt();
            }
            else{
                System.out.println("Larger than it.");
                System.out.println("Guess are remaining : " + (10-cnt));
                System.out.print("Enter a guess for age : ");
                guess = sc.nextInt();
            }
            if(cnt == 9){
                System.out.println("Reached Guess limit...!");
                break;
            }
            cnt++;
        }
    }
}
